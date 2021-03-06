package com.cyrillrx.android.section;

import android.view.View;
import android.widget.TextView;

import com.cyrillrx.android.toolbox.OnDataClickListener;

import androidx.recyclerview.widget.RecyclerView;

/**
 * @author Cyril Leroux
 *         Created on 06/04/2018.
 */
public class SectionViewHolder<Data> extends RecyclerView.ViewHolder {

    protected TextView tvTitle;

    public SectionViewHolder(View itemView) {
        super(itemView);
    }

    public void bind(ItemWrapper<Data> wrapper, OnDataClickListener<Data> clickListener) {
        if (wrapper.isHeader()) {
            bindHeader(wrapper.getHeader());
        } else {
            bindData(wrapper.getData(), clickListener);
        }
    }

    protected void bindData(final Data data, final OnDataClickListener<Data> clickListener) {
        // Handle data click
        itemView.setOnClickListener(v -> clickListener.onDataClick(data));
    }

    protected void bindHeader(String header) {
        tvTitle.setText(header);
        // Reset click
        itemView.setOnClickListener(null);
    }
}
