package com.landptf.viewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.landptf.view.ButtonExtendM;

/**
 * Created by landptf on 2016/11/01.
 * 图片和文字组合，分上下左右四种布局
 */
public class ButtonExtendMTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_extend_mtest);
        initView();
    }

    private void initView() {
        ButtonExtendM bemBack = (ButtonExtendM) findViewById(R.id.bem_back);
        if (bemBack != null){
            //这里只演示一下点击事件，需要注意这里使用的是ButtonExtendM.OnClickListener
            bemBack.setOnClickListener(new ButtonExtendM.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ButtonExtendMTestActivity.this.finish();
                }
            });
        }
    }
}
