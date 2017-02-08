package com.pavan.ilovezappos.activity;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.pavan.ilovezappos.R;
import com.pavan.ilovezappos.databinding.ActivityNearByDevicesBinding;

import java.util.ArrayList;
import java.util.Set;

public class NearByDevices extends AppCompatActivity {

    BluetoothManager bm;
    BluetoothAdapter bluetoothAdapter;
    Set<BluetoothDevice> bluetoothDeviceSet;
    ArrayList<String> list = new ArrayList<String>();
    ListView l;



    ActivityNearByDevicesBinding activityNearByDevicesBinding;

    public ActivityNearByDevicesBinding getActivityNearByDevicesBinding() {
        return activityNearByDevicesBinding;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR2)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityNearByDevicesBinding = DataBindingUtil.setContentView(this, R.layout.activity_near_by_devices);
        Intent out = getIntent();
        bm = (BluetoothManager)getSystemService(BLUETOOTH_SERVICE);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        bluetoothAdapter.startDiscovery();
        IntentFilter filter = new IntentFilter(BluetoothDevice.ACTION_FOUND);
        registerReceiver(broadcastReceiver, filter);
        /*bluetoothDeviceSet = bluetoothAdapter.getBondedDevices();
        for(BluetoothDevice bd :bluetoothDeviceSet){
            list.add(bd.getName());
        }
        getActivityNearByDevicesBinding().listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,list));*/
    }

    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (BluetoothDevice.ACTION_FOUND.equals(action)) {
                BluetoothDevice device = intent
                        .getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
                list.add(device.getName() + "\n" + device.getAddress());
//                Log.i("BT", device.getName() + "\n" + device.getAddress());
                getActivityNearByDevicesBinding().listView.setAdapter(new ArrayAdapter<String>(context,
                        android.R.layout.simple_list_item_1, list));
            }
        }
    };

    @Override
    protected void onDestroy() {
        unregisterReceiver(broadcastReceiver);
        super.onDestroy();
    }
}
