package com.calmmycode.myapplication.view.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.calmmycode.myapplication.R;
import com.calmmycode.myapplication.model.BaseData;
import com.calmmycode.myapplication.view.holders.BaseViewHolder;
import com.calmmycode.myapplication.view.holders.HorizontalListViewHolder;
import com.calmmycode.myapplication.view.holders.TitleViewHolder;

import java.util.ArrayList;

public class ParentRecyclerViewAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private ArrayList<BaseData> data = new ArrayList<>();
    private RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == BaseData.TYPE_TITLE){
            return new TitleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_title, parent, false));
        }
        HorizontalListViewHolder horizontalListViewHolder = new HorizontalListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_recyclerview, parent, false));
        horizontalListViewHolder.setRecycledViewPool(recycledViewPool);
        return horizontalListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder baseViewHolder, int position) {
        baseViewHolder.bindView(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getType();
    }

    public ArrayList<BaseData> getData() {
        return data;
    }
}
