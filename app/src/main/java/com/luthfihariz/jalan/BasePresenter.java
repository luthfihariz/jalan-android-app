package com.luthfihariz.jalan;

/**
 * Created by luthfihariz on 11/6/16.
 */

public interface BasePresenter<V extends BaseView> {
    void bind(V view);

    void unbind();
}
