package com.luthfihariz.jalan.model;

import com.luthfihariz.jalan.model.dao.Attraction;
import com.luthfihariz.jalan.model.dao.GenericApiResponse;

import java.util.List;

import rx.Observable;

/**
 * Created by luthfihariz on 11/6/16.
 */

public interface AttractionInteractor {

    Observable<GenericApiResponse<List<Attraction>>> getAttractionList();
}
