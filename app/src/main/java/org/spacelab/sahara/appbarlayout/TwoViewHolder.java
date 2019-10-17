package org.spacelab.sahara.appbarlayout;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.spacelab.sahara.R;

public class TwoViewHolder extends RecyclerView.ViewHolder {

    private TextView textView;

    public TwoViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.text);

    }

    public void bindData(String text){

        textView.setText(text);

    }

}
