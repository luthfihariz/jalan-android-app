package com.luthfihariz.jalan.contract;

import com.luthfihariz.jalan.BasePresenter;
import com.luthfihariz.jalan.BaseView;

/**
 * Created by luthfihariz on 11/6/16.
 */

public class NearbyContract {

    public interface Presenter extends BasePresenter<View> {
        void loadNearby();
    }

    public interface View extends BaseView<Presenter> {
        void updateNearbyList();
    }

}
