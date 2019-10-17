package org.spacelab.sahara.appbarlayout;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.spacelab.sahara.R;

import java.util.List;

public class TwoAdapter extends RecyclerView.Adapter<TwoViewHolder> {

    private Context context;

    private List<Integer> dataList;

    public TwoAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public TwoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_two_item, viewGroup, false);
        return new TwoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TwoViewHolder twoViewHolder, int i) {
        twoViewHolder.bindData(String.valueOf(dataList.get(i)));
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }

    public void setDataList(List<Integer> dataList) {
        this.dataList = dataList;
        notifyDataSetChanged();
    }
}
