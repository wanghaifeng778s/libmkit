package com.mkit.libmkit.http;

import android.content.Context;

/**
 * Created by WHF.Javas on 2017/8/22.
 */

public class Api {
    private static CommonService commonService;
    public static CommonService getComApi(Context context){
        if (commonService == null) {
            synchronized (Api.class){
                if (commonService == null){
                    commonService=HttpService.create(CommonService.class,context);
                }
            }
        }
        return commonService;
    }
}
