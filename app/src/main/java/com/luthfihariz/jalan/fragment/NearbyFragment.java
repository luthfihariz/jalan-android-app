package com.luthfihariz.jalan.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luthfihariz.jalan.R;
import com.luthfihariz.jalan.contract.NearbyContract;

import butterknife.ButterKnife;

/**
 * Created by luthfihariz on 11/6/16.
 */

public class NearbyFragment extends Fragment implements NearbyContract.View {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nearby, container, false);
        ButterKnife.bind(view);
        return view;
    }

    @Override
    public void updateNearbyList() {

    }

    @Override
    public NearbyContract.Presenter initPresenter() {
        return null;
    }
}
