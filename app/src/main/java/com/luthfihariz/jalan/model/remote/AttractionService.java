package com.luthfihariz.jalan.model.remote;

import com.luthfihariz.jalan.model.dao.Attraction;
import com.luthfihariz.jalan.model.dao.GenericApiResponse;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by luthfihariz on 11/6/16.
 */

public interface AttractionService {

    @GET("/activity")
    Observable<GenericApiResponse<List<Attraction>>> getSampleActivites();
}
