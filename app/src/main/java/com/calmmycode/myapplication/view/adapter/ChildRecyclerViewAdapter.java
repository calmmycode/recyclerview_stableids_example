package com.calmmycode.myapplication.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.calmmycode.myapplication.R;
import com.calmmycode.myapplication.model.HorizontalListItemData;

import java.util.ArrayList;

public class ChildRecyclerViewAdapter extends RecyclerView.Adapter<ChildRecyclerViewAdapter.HorizontalListItemViewHolder> {

    private ArrayList<HorizontalListItemData> list = new ArrayList<>();

    @NonNull
    @Override
    public HorizontalListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalListItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_recyclerview_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalListItemViewHolder holder, int position) {
        bindView(holder, position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public long getItemId(int position) {
        return (list.get(position).getRowNumber() - 1) * 10 + list.get(position).getNumberInRow();
    }

    class HorizontalListItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView textView;

        HorizontalListItemViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.cardView_textview);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(),getText(v.getContext(), getAdapterPosition()), Toast.LENGTH_SHORT).show();
        }
    }

    private void bindView(HorizontalListItemViewHolder viewHolder, int index){
        viewHolder.textView.setText(getText(viewHolder.itemView.getContext(), viewHolder.getAdapterPosition()));
    }

    private String getText(Context context, int position){
        return context.getString(R.string.item_text, list.get(position).getRowNumber(), list.get(position).getNumberInRow());
    }

    public void updateData(ArrayList<HorizontalListItemData> list) {
        this.list = list;
        notifyDataSetChanged();
    }
}
