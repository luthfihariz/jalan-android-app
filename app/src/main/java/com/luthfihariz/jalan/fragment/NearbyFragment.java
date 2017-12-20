package com.luthfihariz.jalan.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.luthfihariz.jalan.R;
import com.luthfihariz.jalan.activity.AttractionsActivity;
import com.luthfihariz.jalan.contract.NearbyContract;
import com.luthfihariz.jalan.presenter.NearbyPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by luthfihariz on 11/6/16.
 */

public class NearbyFragment extends Fragment implements NearbyContract.View {

    NearbyContract.Presenter mPresenter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nearby, container, false);
        ButterKnife.bind(this, view);

        mPresenter = initPresenter();
        mPresenter.bind(this);
        return view;
    }

    @OnClick(R.id.btn_test)
    public void onButtonTestClicked() {
        AttractionsActivity.intent(getContext());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.unbind();
    }

    @Override
    public void updateNearbyList() {

    }

    @NonNull
    @Override
    public NearbyContract.Presenter initPresenter() {
        return new NearbyPresenter();
    }
}
