package com.calmmycode.myapplication.view.holders;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.calmmycode.myapplication.model.BaseData;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {
    BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bindView(BaseData item);
}
