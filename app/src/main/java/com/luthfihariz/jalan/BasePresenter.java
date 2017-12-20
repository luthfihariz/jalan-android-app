package com.luthfihariz.jalan;

import android.support.annotation.NonNull;

/**
 * Created by luthfihariz on 11/6/16.
 */

public interface BasePresenter<V extends BaseView> {

    void bind(@NonNull V view);

    void unbind();
}
