package com.calmmycode.myapplication.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.calmmycode.myapplication.R;
import com.calmmycode.myapplication.model.HorizontalListData;
import com.calmmycode.myapplication.model.HorizontalListItemData;
import com.calmmycode.myapplication.model.TitleData;
import com.calmmycode.myapplication.view.adapter.ParentRecyclerViewAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView mainRecyclerView = findViewById(R.id.horizontalRecyclerView);
        mainRecyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        mainRecyclerView.addItemDecoration(new VerticalDividerDecoration());
        ParentRecyclerViewAdapter parentRecyclerViewAdapter = new ParentRecyclerViewAdapter();
        for (int i = 1; i <= 10; i++) {
            parentRecyclerViewAdapter.getData().add(new TitleData(getString(R.string.title_text, i)));
            HorizontalListData horizontalListData = new HorizontalListData();
            for (int j = 1; j <= 10; j++) {
                if (i % 3 == 0 && j > 3 ) {
                    continue;
                }
                horizontalListData.getList().add(new HorizontalListItemData(i, ((i-1) * 10) + j));
            }
            parentRecyclerViewAdapter.getData().add(horizontalListData);
        }
        mainRecyclerView.setAdapter(parentRecyclerViewAdapter);

    }
}
