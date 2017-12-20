package com.luthfihariz.jalan.presenter;

import android.util.Log;

import com.luthfihariz.jalan.BasePresenter;
import com.luthfihariz.jalan.contract.AttractionsContract;
import com.luthfihariz.jalan.model.AttractionInteractor;
import com.luthfihariz.jalan.model.AttractionInteractorImpl;
import com.luthfihariz.jalan.model.dao.Attraction;
import com.luthfihariz.jalan.model.dao.GenericApiResponse;
import com.luthfihariz.jalan.model.remote.AttractionServiceBuilder;

import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by luthfihariz on 11/20/16.
 */

public class AttractionsPresenter implements AttractionsContract.Presenter {

    private AttractionsContract.View mView;
    private AttractionInteractor mInteractor;

    public AttractionsPresenter() {
        mInteractor = new AttractionInteractorImpl(new AttractionServiceBuilder().build());
    }

    @Override
    public void loadAttractionByArea(String areaId) {
        mInteractor.getAttractionList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GenericApiResponse<List<Attraction>>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(GenericApiResponse<List<Attraction>> response) {
                        List<Attraction> attractions = response.getData();
                        if (mView != null) {
                            mView.showAttractionList(attractions);
                        }
                    }
                });
    }

    @Override
    public void bind(AttractionsContract.View view) {
        mView = view;
    }

    @Override
    public void unbind() {
        mView = null;
    }
}
