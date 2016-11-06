package com.luthfihariz.jalan;

/**
 * Created by luthfihariz on 11/6/16.
 */

public interface BaseView<P extends BasePresenter> {

    P initPresenter();
}
