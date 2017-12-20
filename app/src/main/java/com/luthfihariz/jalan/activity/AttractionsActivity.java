package com.luthfihariz.jalan.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.luthfihariz.jalan.R;
import com.luthfihariz.jalan.adapter.AttractionListAdapter;
import com.luthfihariz.jalan.contract.AttractionsContract;
import com.luthfihariz.jalan.model.dao.Attraction;
import com.luthfihariz.jalan.presenter.AttractionsPresenter;

import java.util.List;

import butterknife.BindView;

/**
 * Created by luthfihariz on 11/20/16.
 */

public class AttractionsActivity extends BaseActivity implements AttractionsContract.View {

    @BindView(R.id.rv_attractions)
    RecyclerView mAttractionsRv;

    private List<Attraction> mAttractions;
    private AttractionListAdapter mAdapter;
    private AttractionsContract.Presenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mPresenter = initPresenter();
        mPresenter.bind(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.unbind();
    }

    @Override
    int getLayoutResource() {
        return R.layout.activity_attractions;
    }

    @Override
    void onViewInjected() {
        mPresenter.loadAttractionByArea(null);
        mAdapter = new AttractionListAdapter(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mAttractionsRv.setLayoutManager(layoutManager);
        mAttractionsRv.setAdapter(mAdapter);

    }


    @Override
    public void showAttractionList(List<Attraction> attractions) {
        mAdapter.addAttractions(attractions);
        mAdapter.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public AttractionsContract.Presenter initPresenter() {
        return new AttractionsPresenter();
    }

    public static void intent(Context context) {
        Intent intent = new Intent(context, AttractionsActivity.class);
        context.startActivity(intent);
    }

}
