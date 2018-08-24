package com.bawei.gouwuche.view;

import com.bawei.gouwuche.bean.CartBean;

/**
 * Created by _ヽ陌路离殇ゞ on 2018/8/24.
 */

public interface IcartView {
    void success(CartBean cartBean);//请求成功
    void failure(String msg);//请求失败
}
