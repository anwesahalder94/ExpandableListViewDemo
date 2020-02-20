package com.example.expandablelistviewdemo;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ReportingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        LayerListData[] layerListData = new LayerListData[] {
                new LayerListData("Email", R.drawable.ic_img),
                new LayerListData("Info", R.drawable.ic_img),
                new LayerListData("Delete", R.drawable.ic_img),
                new LayerListData("Dialer", R.drawable.ic_img),
                new LayerListData("Alert", R.drawable.ic_img),
                new LayerListData("Map", R.drawable.ic_img),
                new LayerListData("Email", R.drawable.ic_img),
                new LayerListData("Info", R.drawable.ic_img),
                new LayerListData("Delete", R.drawable.ic_img),
                new LayerListData("Dialer", R.drawable.ic_img),
                new LayerListData("Alert", R.drawable.ic_img),
                new LayerListData("Map", R.drawable.ic_img),
        };

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        LayerListAdapter adapter = new LayerListAdapter(layerListData,this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
