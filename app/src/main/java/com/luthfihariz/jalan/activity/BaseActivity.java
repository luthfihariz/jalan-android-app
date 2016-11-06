package com.luthfihariz.jalan.activity;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.luthfihariz.jalan.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by luthfihariz on 11/6/16.
 */

abstract class BaseActivity extends AppCompatActivity {

    @Nullable
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResource());
        ButterKnife.bind(this);
        initToolbar();
        onViewInjected();
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
    }

    @Override
    public void setTitle(CharSequence title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public void setTitle(int titleId) {
        setTitle(getResources().getString(titleId));
    }

    @LayoutRes
    abstract int getLayoutResource();

    abstract void onViewInjected();
}
