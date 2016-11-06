package com.luthfihariz.jalan.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import com.luthfihariz.jalan.R;
import com.luthfihariz.jalan.adapter.SimpleViewPagerAdapter;
import com.luthfihariz.jalan.fragment.ExploreFragment;
import com.luthfihariz.jalan.fragment.FavoriteFragment;
import com.luthfihariz.jalan.fragment.NearbyFragment;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.bnv_main_navigation)
    BottomNavigationView mNavigation;

    @BindView(R.id.vp_main)
    ViewPager mMainPager;

    @Override
    int getLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    void onViewInjected() {
        setTitle(R.string.app_name);
        SimpleViewPagerAdapter pagerAdapter = new SimpleViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new NearbyFragment());
        pagerAdapter.addFragment(new ExploreFragment());
        pagerAdapter.addFragment(new FavoriteFragment());
        mMainPager.setAdapter(pagerAdapter);
        mNavigation.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        return onMainNavigationSelected(item);
                    }
                });
    }

    private boolean onMainNavigationSelected(MenuItem item) {
        if (item.getItemId() == R.id.nav_nearby) {
            mMainPager.setCurrentItem(0);
        } else if (item.getItemId() == R.id.nav_explore) {
            mMainPager.setCurrentItem(1);
        } else {
            mMainPager.setCurrentItem(2);
        }
        return true;
    }
}
