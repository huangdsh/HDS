package com.landptf.viewtest;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.landptf.view.ButtonM;
import com.landptf.view.DialogM;

/**
 * Created by landptf on 2017/02/24.
 * 对话框Demo
 */
public class DialogMTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_mtest);
        initView();
    }

    private void initView() {
        ButtonM btmDefaultAlert = (ButtonM) findViewById(R.id.btm_default_alter);
        if (btmDefaultAlert != null) {
            btmDefaultAlert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DialogM.Builder builder = new DialogM.Builder(DialogMTestActivity.this)
                            .setAlertButton("", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setContent("landptf");
                    builder.create().show();
                }
            });
        }

        ButtonM btmDefaultTip = (ButtonM) findViewById(R.id.btm_default_tip);
        if (btmDefaultTip != null){
            btmDefaultTip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DialogM.Builder builder = new DialogM.Builder(DialogMTestActivity.this)
                            .setContent("landptf")
                            .setStyle(DialogM.STYLE_TIP)
                            .setPositiveButton("submit", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(DialogMTestActivity.this, "submit", Toast.LENGTH_SHORT).show();
                                    dialog.dismiss();
                                }
                            })
                            .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(DialogMTestActivity.this, "cancel", Toast.LENGTH_SHORT).show();
                                    dialog.dismiss();
                                }
                            });
                    builder.create().show();
                }
            });
        }

        ButtonM btmCustomAlert = (ButtonM) findViewById(R.id.btm_custom_alert);
        if (btmCustomAlert != null){
            btmCustomAlert.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DialogM.Builder builder = new DialogM.Builder(DialogMTestActivity.this)
                            .setTitle("Hello")
                            .setTitleBackColor(getResources().getColor(R.color.content))
                            .setTitleTextColor(getResources().getColor(R.color.mainColor))
                            .setAlertButtonBackColor(getResources().getColor(R.color.mainColor))
                            .setAlertButtonTextColor(getResources().getColor(android.R.color.white))
                            .setCanceledOnTouchOutside(false)
                            .setAlertButton("确定", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .setContent("landptf");
                    builder.create().show();
                }
            });
        }

        ButtonM btmCustomTip = (ButtonM) findViewById(R.id.btm_custom_tip);
        if (btmCustomTip != null){
            btmCustomTip.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    DialogM.Builder builder = new DialogM.Builder(DialogMTestActivity.this)
                            .setTitle("发现新版本V5.4.1")
                            .setContent("Version5.4.1\n【更新默认表情】——同步最新表情，聊天更有趣\n" +
                                    "【资料卡大升级】——全新视觉设计，增加陌生人来源信息\n" +
                                    "【消息跳动优化】——鼠标悬浮在消息列表上时顺序不动，再也不怕点错啦\n" +
                                    "【收藏预览升级】——完善图片浏览体验，优化网页预览效果\n" +
                                    "【更多体验优化】——群成员列表宽度可调；优化天气定位策略；优化图片查看器")
                            .setStyle(DialogM.STYLE_TIP)
                            .setPositiveButton("更新", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(DialogMTestActivity.this, "submit", Toast.LENGTH_SHORT).show();
                                    dialog.dismiss();
                                }
                            })
                            .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Toast.makeText(DialogMTestActivity.this, "cancel", Toast.LENGTH_SHORT).show();
                                    dialog.dismiss();
                                }
                            });
                    builder.create().show();
                }
            });
        }
    }
}
