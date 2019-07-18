package com.calmmycode.myapplication.view;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.calmmycode.myapplication.R;
import com.calmmycode.myapplication.model.BaseData;

public class VerticalDividerDecoration extends RecyclerView.ItemDecoration {

    private Integer edges_padding = null;

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        if (position != RecyclerView.NO_POSITION) {
            RecyclerView.Adapter adapter = parent.getAdapter();
            if (adapter != null) {
                int viewType = adapter.getItemViewType(position);
                if (viewType == BaseData.TYPE_TITLE) {
                    if (edges_padding == null) {
                        edges_padding = (int) view.getContext().getResources().getDimension(R.dimen.edges_padding);
                    }
                    outRect.set(edges_padding, 0, edges_padding, 0);
                } else{
                    outRect.setEmpty();
                }
            }
        }
    }
}
