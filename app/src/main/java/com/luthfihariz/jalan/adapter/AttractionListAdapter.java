package com.luthfihariz.jalan.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.luthfihariz.jalan.R;
import com.luthfihariz.jalan.model.dao.Attraction;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luthfihariz on 11/20/16.
 */

public class AttractionListAdapter extends RecyclerView.Adapter<AttractionListViewHolder> {

    private ArrayList<Attraction> mAttractions;
    private Context mContext;

    public AttractionListAdapter(Context context) {
        mAttractions = new ArrayList<>();
        mContext = context;
    }

    public void addAttractions(List<Attraction> attractions) {
        mAttractions.addAll(attractions);
    }

    @Override
    public AttractionListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AttractionListViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_attractions, parent, false));
    }

    @Override
    public void onBindViewHolder(AttractionListViewHolder holder, int position) {
        Attraction attraction = mAttractions.get(position);
        holder.mAttractionTitle.setText(attraction.getTitle());
        holder.mAttractionCategories.setText("Categories");

        Picasso.with(mContext).load(attraction.getSelectedPhoto()).into(holder.mAttractionImg);
    }

    @Override
    public int getItemCount() {
        return mAttractions.size();
    }
}
