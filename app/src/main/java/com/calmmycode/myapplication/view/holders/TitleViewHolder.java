package com.calmmycode.myapplication.view.holders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.calmmycode.myapplication.R;
import com.calmmycode.myapplication.model.BaseData;
import com.calmmycode.myapplication.model.TitleData;

public class TitleViewHolder extends BaseViewHolder {
    private TextView titleTextView;

    public TitleViewHolder(@NonNull View itemView) {
        super(itemView);
        titleTextView = itemView.findViewById(R.id.title);
    }

    @Override
    public void bindView(BaseData item) {
        TitleData titleData = (TitleData) item;
        titleTextView.setText(titleData.getTitle());
    }
}
