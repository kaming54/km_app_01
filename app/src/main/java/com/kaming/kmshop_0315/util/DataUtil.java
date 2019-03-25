package com.kaming.kmshop_0315.util;

import android.content.Context;
import android.widget.ImageView;

import com.kaming.kmshop_0315.entity.HomeMenu;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    /**
     *
     * @param context
     * @param icons
     * @return datas
     */
    public static List<ImageView> getHearAddInfo(Context context, int icons[]){
        List<ImageView> datas = new ArrayList<>();
        for(int i=0;i<icons.length;i++){
            ImageView icon  = new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(icons[i]);
            datas.add(icon);
        }
        return datas;
    }

    /**
     *
     * @param icons
     * @param names
     * @return menus
     * Menu imports係自己起的Menu類
     */
    public static List<HomeMenu> getMainMenus(int icons[], String names[]){
        List<HomeMenu> menus = new ArrayList<>();
        for (int i=0;i<icons.length;i++){
            HomeMenu menu = new HomeMenu(icons[i],names[i]);
            menus.add(menu);
        }
        return menus;
    }
}
