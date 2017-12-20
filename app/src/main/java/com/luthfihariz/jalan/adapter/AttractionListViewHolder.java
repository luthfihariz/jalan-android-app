package com.luthfihariz.jalan.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.luthfihariz.jalan.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by luthfihariz on 11/20/16.
 */

public class AttractionListViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.tv_attract_categories)
    TextView mAttractionCategories;
    @BindView(R.id.tv_attract_title)
    TextView mAttractionTitle;
    @BindView(R.id.iv_attract_image)
    ImageView mAttractionImg;

    public AttractionListViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
