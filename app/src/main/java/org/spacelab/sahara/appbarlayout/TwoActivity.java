package org.spacelab.sahara.appbarlayout;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import org.spacelab.sahara.R;

import java.util.ArrayList;
import java.util.List;

public class TwoActivity extends AppCompatActivity {

    private Context context;

    private SwipeRefreshLayout swipeRefreshLayout;

    private RecyclerView recyclerView;

    private TwoAdapter adapter;

    private List<Integer> dataList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_two);

        context = this;

        initView();
    }

    private void initView() {

        swipeRefreshLayout = findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(context, "refreshing.", Toast.LENGTH_SHORT).show();
                swipeRefreshLayout.setRefreshing(false);
            }
        });


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
