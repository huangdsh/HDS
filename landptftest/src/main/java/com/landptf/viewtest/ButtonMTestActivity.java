package com.landptf.viewtest;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.landptf.view.ButtonM;

/**
 * Created by landptf on 2016/10/27.
 * 每种样式均通过xml和java代码两种方式来实现不同的样式，可根据项目需要进行使用
 */
public class ButtonMTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_mtest);
        initView();
    }

    private void initView() {
        ButtonM btmNormalColorXml = (ButtonM) findViewById(R.id.btm_normal_color_xml);
        if (btmNormalColorXml != null) {
            btmNormalColorXml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "xml实现", Toast.LENGTH_SHORT).show();
                }
            });
        }
        ButtonM btmNormalColorJava = (ButtonM) findViewById(R.id.btm_normal_color_java);
        if (btmNormalColorJava != null) {
            btmNormalColorJava.setTextColor(Color.parseColor("#ffffff"));
            //这种写法也可以，但要求一定要满足8位数
            //btmNormalColorJava.setTextColor(0Xffffffff);
            btmNormalColorJava.setBackColor(Color.parseColor("#ff3300"));
            btmNormalColorJava.setBackColorPress(Color.parseColor("#ff33ff"));
            btmNormalColorJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "java代码实现", Toast.LENGTH_SHORT).show();
                }
            });
        }

        ButtonM btmNormalTextXml = (ButtonM) findViewById(R.id.btm_normal_text_xml);
        if (btmNormalTextXml != null) {
            btmNormalTextXml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "xml实现", Toast.LENGTH_SHORT).show();
                }
            });
        }
        ButtonM btmNormalTextJava = (ButtonM) findViewById(R.id.btm_normal_text_java);
        if (btmNormalTextJava != null) {
            btmNormalTextJava.setTextColor(Color.parseColor("#ffffff"));
            btmNormalTextJava.setTextColorPress(Color.parseColor("#696969"));
            btmNormalTextJava.setBackColor(Color.parseColor("#ff3300"));
            btmNormalTextJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "java代码实现", Toast.LENGTH_SHORT).show();
                }
            });
        }


        ButtonM btmRadiusColorXml = (ButtonM) findViewById(R.id.btm_radius_color_xml);
        if (btmRadiusColorXml != null) {
            btmRadiusColorXml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "xml实现", Toast.LENGTH_SHORT).show();
                }
            });
        }
        ButtonM btmRadiusColorJava = (ButtonM) findViewById(R.id.btm_radius_color_java);
        if (btmRadiusColorJava != null) {
            btmRadiusColorJava.setFillet(true);
            btmRadiusColorJava.setRadius(30);
            btmRadiusColorJava.setTextColor(Color.parseColor("#ffffff"));
            btmRadiusColorJava.setBackColor(Color.parseColor("#ff3300"));
            btmRadiusColorJava.setBackColorPress(Color.parseColor("#ff33ff"));
            btmRadiusColorJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "java代码实现", Toast.LENGTH_SHORT).show();
                }
            });
        }

        ButtonM btmRadiusTextXml = (ButtonM) findViewById(R.id.btm_radius_text_xml);
        if (btmRadiusTextXml != null) {
            btmRadiusTextXml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "xml实现", Toast.LENGTH_SHORT).show();
                }
            });
        }
        ButtonM btmRadiusTextJava = (ButtonM) findViewById(R.id.btm_radius_text_java);
        if (btmRadiusTextJava != null) {
            btmRadiusTextJava.setFillet(true);
            btmRadiusTextJava.setRadius(30);
            btmRadiusTextJava.setTextColor(Color.parseColor("#ffffff"));
            btmRadiusTextJava.setTextColorPress(Color.parseColor("#696969"));
            btmRadiusTextJava.setBackColor(Color.parseColor("#ff3300"));
            btmRadiusTextJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "java代码实现", Toast.LENGTH_SHORT).show();
                }
            });
        }


        ButtonM btmOvalColorXml = (ButtonM) findViewById(R.id.btm_oval_color_xml);
        if (btmOvalColorXml != null) {
            btmOvalColorXml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "xml实现", Toast.LENGTH_SHORT).show();
                }
            });
        }
        ButtonM btmOvalColorJava = (ButtonM) findViewById(R.id.btm_oval_color_java);
        if (btmOvalColorJava != null) {
            btmOvalColorJava.setFillet(true);
            btmOvalColorJava.setShape(GradientDrawable.OVAL);
            btmOvalColorJava.setTextColor(Color.parseColor("#ffffff"));
            btmOvalColorJava.setBackColor(Color.parseColor("#ff3300"));
            btmOvalColorJava.setBackColorPress(Color.parseColor("#ff33ff"));
            btmOvalColorJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "java代码实现", Toast.LENGTH_SHORT).show();
                }
            });
        }

        ButtonM btmOvalTextXml = (ButtonM) findViewById(R.id.btm_oval_text_xml);
        if (btmOvalTextXml != null) {
            btmOvalTextXml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "xml实现", Toast.LENGTH_SHORT).show();
                }
            });
        }
        ButtonM btmOvalTextJava = (ButtonM) findViewById(R.id.btm_oval_text_java);
        if (btmOvalTextJava != null) {
            btmOvalTextJava.setFillet(true);
            btmOvalTextJava.setShape(GradientDrawable.OVAL);
            btmOvalTextJava.setTextColor(Color.parseColor("#ffffff"));
            btmOvalTextJava.setTextColorPress(Color.parseColor("#696969"));
            btmOvalTextJava.setBackColor(Color.parseColor("#ff3300"));
            btmOvalTextJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "java代码实现", Toast.LENGTH_SHORT).show();
                }
            });
        }

        ButtonM btmNormalImageXml = (ButtonM) findViewById(R.id.btm_normal_image_xml);
        if (btmNormalImageXml != null) {
            btmNormalImageXml.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "xml实现", Toast.LENGTH_SHORT).show();
                }
            });
        }
        ButtonM btmNormalImageJava = (ButtonM) findViewById(R.id.btm_normal_image_java);
        if (btmNormalImageJava != null) {
            btmNormalImageJava.setBackGroundDrawable(getResources().getDrawable(R.drawable.icon_collection));
            btmNormalImageJava.setBackGroundDrawablePress(getResources().getDrawable(R.drawable.icon_collection_press));
            btmNormalImageJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(ButtonMTestActivity.this, "java代码实现", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
