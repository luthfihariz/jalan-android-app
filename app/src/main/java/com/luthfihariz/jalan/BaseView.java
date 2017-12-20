package com.luthfihariz.jalan;

import android.support.annotation.NonNull;

/**
 * Created by luthfihariz on 11/6/16.
 */

public interface BaseView<P extends BasePresenter> {

    @NonNull
    P initPresenter();
}
