package com.k2infosoft.response;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by admin 54 on 5/8/2017.
 */

public interface RequestInterface {
    @GET("connect/document.json")
    Call<JSONResponse> getJSON();

}
