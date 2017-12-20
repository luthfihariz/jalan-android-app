package com.luthfihariz.jalan.contract;

import com.luthfihariz.jalan.BasePresenter;
import com.luthfihariz.jalan.BaseView;
import com.luthfihariz.jalan.model.dao.Attraction;

import java.util.List;

/**
 * Created by luthfihariz on 11/20/16.
 */

public class AttractionsContract {

    public interface Presenter extends BasePresenter<View> {
        void loadAttractionByArea(String areaId);
    }

    public interface View extends BaseView<Presenter> {
        void showAttractionList(List<Attraction> attractions);
    }
}
