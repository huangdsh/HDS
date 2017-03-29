package com.landptf.viewtest;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.landptf.view.ButtonExtendM;
import com.landptf.view.MenuM;

public class MenuMTestActivity extends Activity {

    private String[] text = new String[]{"首页", "通讯录", "发现", "我"};
    private Drawable[] iconDrawable;
    private Drawable[] iconDrawablePress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mtest);
        initData();
        initView();
    }

    private void initData() {
        Drawable drawable = getResources().getDrawable(R.drawable.icon_home_page);
        Drawable drawablePress = getResources().getDrawable(R.drawable.icon_home_page_press);
        iconDrawable = new Drawable[]{drawable, drawable, drawable, drawable};
        iconDrawablePress = new Drawable[]{drawablePress, drawablePress, drawablePress, drawablePress};
    }

    private void initView() {
        ButtonExtendM bemBack = (ButtonExtendM) findViewById(R.id.bem_back);
        if (bemBack != null){
            bemBack.setOnClickListener(new ButtonExtendM.OnClickListener() {
                @Override
                public void onClick(View v) {
                    MenuMTestActivity.this.finish();
                }
            });
        }

        final MenuM mmBottom = (MenuM) findViewById(R.id.mm_bottom);
        mmBottom.setText(text);
        mmBottom.setIconDrawable(iconDrawable);
        mmBottom.setIconDrawablePress(iconDrawablePress);
        //设置默认选中第一项
        mmBottom.setPressState(0, MotionEvent.ACTION_DOWN);
        mmBottom.setOnItemClickListener(new MenuM.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MenuMTestActivity.this, mmBottom.getText(position), Toast.LENGTH_SHORT).show();
            }
        });

        mmBottom.setUnReadCount(0, 100);
        mmBottom.setUnReadCount(1, 15);
        mmBottom.setVisibilityMore(2, View.VISIBLE);
        mmBottom.setVisibilityNew(3, View.VISIBLE);

    }
}
