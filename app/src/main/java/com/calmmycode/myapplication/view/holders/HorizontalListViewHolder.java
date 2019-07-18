package com.calmmycode.myapplication.view.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.calmmycode.myapplication.R;
import com.calmmycode.myapplication.model.BaseData;
import com.calmmycode.myapplication.model.HorizontalListData;
import com.calmmycode.myapplication.view.adapter.ChildRecyclerViewAdapter;

public class HorizontalListViewHolder extends BaseViewHolder {

    private RecyclerView.RecycledViewPool recycledViewPool;
    private ChildRecyclerViewAdapter childRecyclerViewAdapter;

    public void setRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        this.recycledViewPool = recycledViewPool;
    }

    public HorizontalListViewHolder(@NonNull View itemView) {
        super(itemView);
        RecyclerView categoryRecyclerView = itemView.findViewById(R.id.horizontalRecyclerView);
        categoryRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.HORIZONTAL, false));
        categoryRecyclerView.setHasFixedSize(true);
        categoryRecyclerView.setRecycledViewPool(recycledViewPool);
        childRecyclerViewAdapter = new ChildRecyclerViewAdapter();
        childRecyclerViewAdapter.setHasStableIds(true);
        categoryRecyclerView.setAdapter(childRecyclerViewAdapter);
    }

    @Override
    public void bindView(BaseData item) {
        HorizontalListData horizontalListItemData = (HorizontalListData) item;
        childRecyclerViewAdapter.updateData(horizontalListItemData.getList());
    }


}
