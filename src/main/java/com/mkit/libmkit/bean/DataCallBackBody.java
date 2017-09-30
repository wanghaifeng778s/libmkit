package com.mkit.libmkit.bean;


import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Created by WHF.Javas on 2017/9/28.
 */

public interface DataCallBackBody {
    void dataCall(Response<ResponseBody> bean);
    void onError(Throwable t);
}
