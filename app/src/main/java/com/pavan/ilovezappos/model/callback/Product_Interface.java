package com.pavan.ilovezappos.model.callback;

import com.pavan.ilovezappos.model.Result;
import com.pavan.ilovezappos.model.product_extraction;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Pavan Prabhakar Bhat
 * @version 1.0
 * @date 2/6/2017.
 */

public interface Product_Interface {
    @GET("/Search")
    Call<product_extraction> getResults(@Query(value = "term") String searchTerm, @Query(value = "key") String searchKey);

    /*Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .build();

    Product_Interface service = retrofit.create(Product_Interface.class);
*/
}
