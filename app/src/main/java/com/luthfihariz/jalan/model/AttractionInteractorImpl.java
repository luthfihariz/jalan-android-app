package com.luthfihariz.jalan.model;

import com.luthfihariz.jalan.model.dao.Attraction;
import com.luthfihariz.jalan.model.dao.GenericApiResponse;
import com.luthfihariz.jalan.model.remote.AttractionService;

import java.util.List;

import rx.Observable;

/**
 * Created by luthfihariz on 11/6/16.
 */

public class AttractionInteractorImpl implements AttractionInteractor {

    private AttractionService mService;

    public AttractionInteractorImpl(AttractionService activityService) {
        mService = activityService;
    }

    @Override
    public Observable<GenericApiResponse<List<Attraction>>> getAttractionList() {
        return mService.getSampleActivites();
    }
}
