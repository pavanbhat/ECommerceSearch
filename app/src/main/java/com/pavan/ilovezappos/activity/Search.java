package com.pavan.ilovezappos.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.pavan.ilovezappos.R;
import com.pavan.ilovezappos.databinding.ActivitySearchBinding;

import java.net.Socket;

public class Search extends AppCompatActivity {

    ActivitySearchBinding as_binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        as_binding = DataBindingUtil.setContentView(this, R.layout.activity_search);

        as_binding.searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getSearchString = as_binding.searchInput.getText().toString();
                Intent in = new Intent(Search.this, ProductActivity.class);
                in.putExtra("search", getSearchString);
                startActivity(in);
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
}
