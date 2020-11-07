package com.yx.buglyhotfixdemo;

import android.app.Application;
import android.content.Context;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

import androidx.multidex.MultiDex;

/**
 * Author by YX, Date on 2020/11/3.
 */
public class MyApplication extends TinkerApplication{

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL,"com.yx.buglyhotfixdemo.MyApplicationLike","com.tencent.tinker.loader.TinkerLoader", false);
    }

}
