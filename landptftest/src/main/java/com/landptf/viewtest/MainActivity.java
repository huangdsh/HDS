package com.landptf.viewtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.landptf.view.ButtonM;

/**
 * Demo主界面
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ButtonM buttonM = (ButtonM) findViewById(R.id.button_m);
        if (buttonM != null){
            buttonM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, ButtonMTestActivity.class));
                }
            });
        }

        ButtonM buttonExtendM = (ButtonM) findViewById(R.id.button_extend_m);
        if (buttonExtendM != null){
            buttonExtendM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, ButtonExtendMTestActivity.class));
                }
            });
        }

        ButtonM MenuItemM = (ButtonM) findViewById(R.id.menu_item_m);
        if (MenuItemM != null){
            MenuItemM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, MenuItemMTestActivity.class));
                }
            });
        }

        ButtonM MenuM = (ButtonM) findViewById(R.id.menu_m);
        if (MenuM != null){
            MenuM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, MenuMTestActivity.class));
                }
            });
        }

        ButtonM DialogM = (ButtonM) findViewById(R.id.dialog_m);
        if (DialogM != null){
            DialogM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, DialogMTestActivity.class));
                }
            });
        }

        ButtonM BannerM = (ButtonM) findViewById(R.id.banner_m);
        if (BannerM != null){
            BannerM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, BannerMTestActivity.class));
                }
            });
        }

        ButtonM CountDownM = (ButtonM) findViewById(R.id.count_down_m);
        if (CountDownM != null){
            CountDownM.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, CountDownMTestActivity.class));
                }
            });
        }

    }
}
