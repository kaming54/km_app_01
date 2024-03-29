package com.kaming.kmshop_0315.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class HomeHeaderAdapter extends PagerAdapter {

    protected Context context;
    protected List<ImageView> images;

    public HomeHeaderAdapter(Context context,List<ImageView> images){
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return null!=images?images.size():0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(images.get(position));
        return images.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(images.get(position));
    }
}
