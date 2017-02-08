package com.pavan.ilovezappos.controller;

import android.os.AsyncTask;
import android.util.Log;

import com.pavan.ilovezappos.model.callback.Product_Interface;
import com.pavan.ilovezappos.model.product_extraction;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.pavan.ilovezappos.model.helper.Constants.HTTP;

/**
 *
 */
public class product_page extends AsyncTask<String, Void, product_extraction> implements Callback<product_extraction> {

    /**
     * @param strings
     * @return
     */

    @Override
    protected product_extraction doInBackground(String... strings) {
        Product_Interface product_interface;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HTTP.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        product_interface = retrofit.create(Product_Interface.class);
        Call<product_extraction> call = product_interface.getResults(strings[0], strings[1]);

        product_extraction res = null;
        try {
            res = call.execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    public void onResponse(Call<product_extraction> call, Response<product_extraction> response) {
        if (response.isSuccessful()) {
            Log.i("Success Check ", "not successful");
        }
    }

    @Override
    public void onFailure(Call<product_extraction> call, Throwable t) {
        Log.i("Failure Check ", "Sorry! Our Website doesn't have any thing for you right now!");
    }


}
