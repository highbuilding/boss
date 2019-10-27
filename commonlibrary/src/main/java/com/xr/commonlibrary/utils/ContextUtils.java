package com.xr.commonlibrary.utils;

import com.xr.commonlibrary.BaseApplication;

public class ContextUtils {
    public static BaseApplication getAppContext() {
        return BaseApplication.getInstance();
    }

}
