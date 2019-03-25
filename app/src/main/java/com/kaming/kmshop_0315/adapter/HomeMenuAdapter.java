package com.kaming.kmshop_0315.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.kaming.kmshop_0315.R;
import com.kaming.kmshop_0315.entity.HomeMenu;

import java.util.List;


public class HomeMenuAdapter extends RecyclerView.Adapter<HomeMenuAdapter.HomeMenuHolder> {
    protected Context context;
    protected List<HomeMenu> menus;

    public HomeMenuAdapter(Context context, List<HomeMenu> menus){
        this.context = context;
        this.menus = menus;
    }

    @Override
    public HomeMenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new HomeMenuHolder(LayoutInflater.from(context).inflate(R.layout.item_home_menu,null));
    }

    @Override
    public void onBindViewHolder(HomeMenuHolder homeMenuHolder, int i) {

        HomeMenu menu = menus.get(i);
        homeMenuHolder.mMenuIcon.setImageResource(menu.icon);
        homeMenuHolder.mMenuName.setText(menu.menuName);
    }

    @Override
    public int getItemCount() {
        return null!=menus?menus.size():0;
    }

    class HomeMenuHolder extends RecyclerView.ViewHolder{
        public ImageView mMenuIcon;
        public TextView mMenuName;

        public HomeMenuHolder(View itemView) {
            super(itemView);
            mMenuName = (TextView) itemView.findViewById(R.id.main_menu_title);
            mMenuIcon = (ImageView) itemView.findViewById(R.id.img_menu_icon);
        }
    }
}
