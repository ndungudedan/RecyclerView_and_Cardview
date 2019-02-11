package com.tidtech.meetup;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;

public class Differ extends DiffUtil.ItemCallback<noteItem> {
    @Override
    public boolean areItemsTheSame(@NonNull noteItem item, @NonNull noteItem t1) {

        return item.equals(t1);
    }

    @Override
    public boolean areContentsTheSame(@NonNull noteItem item, @NonNull noteItem t1) {

        return item.getItemName().equals(t1.getItemName());
    }
}
