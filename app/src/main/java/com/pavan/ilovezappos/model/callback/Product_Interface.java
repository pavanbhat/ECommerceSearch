package com.pavan.ilovezappos.model.callback;

import com.pavan.ilovezappos.model.product_extraction;

import retrofit2.Call;
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

}
