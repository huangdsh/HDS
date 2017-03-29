package com.landptf.viewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.landptf.view.CountDownM;

public class CountDownMTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down_mtest);
        initView();
    }

    private void initView() {
        CountDownM cdmIdentifyingCode = (CountDownM) findViewById(R.id.cdm_identifying_code);
        if (cdmIdentifyingCode != null) {
            cdmIdentifyingCode.setOnClickListener(new CountDownM.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(CountDownMTestActivity.this, "验证码发送成功", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
