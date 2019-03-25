package com.kaming.kmshop_0315;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.kaming.kmshop_0315.fragment.HomeMenuFragment;
import com.kaming.kmshop_0315.fragment.MeMenuFragment;
import com.kaming.kmshop_0315.fragment.ShopMenuFragment;
import com.kaming.kmshop_0315.fragment.ShopcarMenuFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    HomeMenuFragment mHomeMenu = new HomeMenuFragment();
    ShopMenuFragment mShopMenu = new ShopMenuFragment();
    ShopcarMenuFragment mShopCarMenu = new ShopcarMenuFragment();
    MeMenuFragment mMeMenu = new MeMenuFragment();

    private LinearLayout menu_home,menu_shop,menu_shopcar,menu_me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_context,mHomeMenu)
                .add(R.id.container_context,mShopMenu).hide(mShopMenu)
                .add(R.id.container_context,mShopCarMenu).hide(mShopCarMenu)
                .add(R.id.container_context,mMeMenu).hide(mMeMenu)
                .commit();
    }

    public void initView(){
        menu_home = (LinearLayout) findViewById(R.id.menu_home);
        menu_shop = (LinearLayout) findViewById(R.id.menu_shop);
        menu_shopcar = (LinearLayout) findViewById(R.id.menu_shopcar);
        menu_me = (LinearLayout) findViewById(R.id.menu_me);

        menu_home.setOnClickListener(this);
        menu_shop.setOnClickListener(this);
        menu_shopcar.setOnClickListener(this);
        menu_me.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_home:
                getSupportFragmentManager()
                        .beginTransaction()
                        .show(mHomeMenu)
                        .hide(mShopMenu)
                        .hide(mShopCarMenu)
                        .hide(mMeMenu)
                        .commit();
                break;
            case R.id.menu_shop:
                getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mHomeMenu)
                        .show(mShopMenu)
                        .hide(mShopCarMenu)
                        .hide(mMeMenu)
                        .commit();
                break;
            case R.id.menu_shopcar:
                getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mHomeMenu)
                        .hide(mShopMenu)
                        .show(mShopCarMenu)
                        .hide(mMeMenu)
                        .commit();
                break;
            case R.id.menu_me:
                getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mHomeMenu)
                        .hide(mShopMenu)
                        .hide(mShopCarMenu)
                        .show(mMeMenu)
                        .commit();
                break;
        }
    }
}
