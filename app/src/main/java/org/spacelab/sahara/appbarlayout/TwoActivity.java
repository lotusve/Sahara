package org.spacelab.sahara.appbarlayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import org.spacelab.sahara.R;

import java.util.ArrayList;
import java.util.List;

public class TwoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private TwoAdapter adapter;

    private List<Integer> dataList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);

        initView();
    }

    private void initView() {

        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new TwoAdapter(this);

        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();

        dataList.clear();

        for (int i = 0; i < 50; i++) {
            dataList.add(i);
        }

        adapter.setDataList(dataList);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
