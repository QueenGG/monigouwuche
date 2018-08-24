package com.bawei.gouwuche.utils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by _ヽ陌路离殇ゞ on 2018/8/24.
 */

public interface RequestCallback {
    void failure(Call call, IOException e);
    void onResponse(Call call, Response response);
}
