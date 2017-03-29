package com.landptf.viewtest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.landptf.view.ButtonExtendM;
import com.landptf.view.MenuItemM;

/**
 * Created by landptf on 2016/11/08.
 * 使用自定义消息控件的demo
 */
public class MenuItemMTestActivity extends Activity {

    //定义底部菜单控件
    private MenuItemM mimHomePage;
    private MenuItemM mimDiscover;
    private MenuItemM mimUserCenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_item_mtest);
        initView();
    }

    private void initView() {
        //返回上一页
        ButtonExtendM bemBack = (ButtonExtendM) findViewById(R.id.bem_back);
        if (bemBack != null){
            bemBack.setOnClickListener(new ButtonExtendM.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MenuItemMTestActivity.this.finish();
                }
            });
        }

        //标题栏右上角的消息提醒
        final MenuItemM mimMessage = (MenuItemM) findViewById(R.id.mim_message);
        if (mimMessage != null){
            //显示信息提示
            mimMessage.setVisibilityMore(View.VISIBLE);
            mimMessage.setOnClickListener(new MenuItemM.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mimMessage.setVisibilityMore(View.GONE);
                }
            });
        }

        mimHomePage = (MenuItemM) findViewById(R.id.mim_home_page);
        if (mimHomePage != null){
            //默认为选中状态
            mimHomePage.setPressState(MotionEvent.ACTION_DOWN);
            mimHomePage.setVisibilityMore(View.VISIBLE);
            mimHomePage.setOnClickListener(new MenuItemM.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mimHomePage.setVisibilityMore(View.GONE);
                    //重置选中状态
                    mimHomePage.setPressState(MotionEvent.ACTION_DOWN);
                    mimDiscover.setPressState(MotionEvent.ACTION_UP);
                    mimUserCenter.setPressState(MotionEvent.ACTION_UP);
                }
            });
        }

        mimDiscover = (MenuItemM) findViewById(R.id.mim_discover);
        if (mimDiscover != null){
            mimDiscover.setUnReadCount(23);
            mimDiscover.setOnClickListener(new MenuItemM.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mimDiscover.setUnReadCount(0);
                    mimHomePage.setPressState(MotionEvent.ACTION_UP);
                    mimDiscover.setPressState(MotionEvent.ACTION_DOWN);
                    mimUserCenter.setPressState(MotionEvent.ACTION_UP);
                }
            });
        }

        mimUserCenter = (MenuItemM) findViewById(R.id.mim_user_center);
        if (mimUserCenter != null){
            mimUserCenter.setVisibilityNew(View.VISIBLE);
            mimUserCenter.setOnClickListener(new MenuItemM.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mimUserCenter.setVisibilityNew(View.GONE);
                    mimHomePage.setPressState(MotionEvent.ACTION_UP);
                    mimDiscover.setPressState(MotionEvent.ACTION_UP);
                    mimUserCenter.setPressState(MotionEvent.ACTION_DOWN);
                }
            });
        }
    }
}
