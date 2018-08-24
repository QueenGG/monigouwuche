package com.bawei.gouwuche.presenter;

import com.bawei.gouwuche.bean.CartBean;
import com.bawei.gouwuche.model.CartModel;
import com.bawei.gouwuche.view.IcartView;

import java.util.HashMap;

/**
 * Created by _ヽ陌路离殇ゞ on 2018/8/24.
 */

public class CartPesenter {
    private CartModel cartModel;
    private IcartView icartView;

    public CartPesenter(IcartView icartView) {
        cartModel =new CartModel();
        attachView(icartView);

    }

    /**
     * 绑定view到presenter
     * @param icartView
     */
    public void attachView(IcartView icartView){
        this.icartView = icartView;
    }

    public void getCarts(HashMap<String,String> params, String url){

        cartModel.getCarts(params, url, new CartModel.CartCallback() {
            @Override
            public void success(CartBean cartBean) {

                if (icartView!=null){
                    icartView.success(cartBean);
                }

            }

            @Override
            public void fail(String msg) {

                if (icartView!=null){
                    icartView.failure(msg);
                }

            }
        });

    }

    /**
     * 解除绑定，把view和presenter解绑，避免内存泄漏
     */
    public void detachView(){
        this.icartView = null;
    }
}
