package com.luthfihariz.jalan.presenter;

import com.luthfihariz.jalan.contract.NearbyContract;
import com.luthfihariz.jalan.model.AttractionInteractor;
import com.luthfihariz.jalan.model.AttractionInteractorImpl;
import com.luthfihariz.jalan.model.remote.AttractionServiceBuilder;

/**
 * Created by luthfihariz on 11/6/16.
 */

public class NearbyPresenter implements NearbyContract.Presenter {

    private static final String TAG = "NearbyPresenter";

    private AttractionInteractor mInteractor;

    public NearbyPresenter() {
        mInteractor = new AttractionInteractorImpl(new AttractionServiceBuilder().build());
    }

    @Override
    public void loadNearby() {

    }

    @Override
    public void bind(NearbyContract.View view) {

    }

    @Override
    public void unbind() {

    }
}
