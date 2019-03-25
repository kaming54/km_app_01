package com.kaming.kmshop_0315.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kaming.kmshop_0315.R;
import com.kaming.kmshop_0315.adapter.HomeHeaderAdapter;
import com.kaming.kmshop_0315.adapter.HomeMenuAdapter;
import com.kaming.kmshop_0315.util.DataUtil;

public class HomeMenuFragment extends Fragment{

    //首頁廣告框聲明object,初始化icons數組
    protected int[] icons = {R.mipmap.home_ad_japan,R.mipmap.home_ad_korea,R.mipmap.home_ad_taiwan,R.mipmap.home_ad_china};
    protected ViewPager mVPagerAd;

    protected int[] meunIcons={R.mipmap.home_menu_japan,R.mipmap.home_menu_korea,
            R.mipmap.home_menu_thailand,R.mipmap.home_menu_taiwan,
            R.mipmap.home_menu_china,R.mipmap.home_menu_hk,
            R.mipmap.home_menu_usa,R.mipmap.home_menu_britain};
    protected String [] menus;
    protected RecyclerView mRvHomeMenu;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu_home,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //首頁廣告框 設定mVPagerAd在layout的位置
        mVPagerAd = getActivity().findViewById(R.id.vpage_home_ad);
        //聲明object 初始化object
        HomeHeaderAdapter homeHeaderAdapter = new HomeHeaderAdapter(getActivity(), DataUtil.getHearAddInfo(getActivity(),icons));
        //放homeHeaderAdapter內容進mVPagerAd
        mVPagerAd.setAdapter(homeHeaderAdapter);

        menus = this.getActivity().getResources().getStringArray(R.array.home_menu_name);
        mRvHomeMenu = getActivity().findViewById(R.id.home_menu);
        mRvHomeMenu.setLayoutManager(new GridLayoutManager(getActivity(),4));
        HomeMenuAdapter mHomeMenuAdapter = new HomeMenuAdapter(getActivity(),DataUtil.getMainMenus(meunIcons,menus));
        mRvHomeMenu.setAdapter(mHomeMenuAdapter);

    }
}
