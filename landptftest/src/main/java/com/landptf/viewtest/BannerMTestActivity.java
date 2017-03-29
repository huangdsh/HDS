package com.landptf.viewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.landptf.bean.BannerBean;
import com.landptf.view.BannerM;

import java.util.ArrayList;
import java.util.List;

public class BannerMTestActivity extends AppCompatActivity {

    private List<BannerBean> bannerList;
    private final static String url1 = "http://upload-images.jianshu.io/upload_images/589909-d046f5ca2abbd31e.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240";
    private final static String url2 = "http://upload-images.jianshu.io/upload_images/589909-da8eaee55c62a4dd.JPG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240";
    private final static String url3 = "http://upload-images.jianshu.io/upload_images/589909-88189759a24f42da.JPG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240";
    private final static String url4 = "http://upload-images.jianshu.io/upload_images/589909-fad4a3da8703501c.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_mtest);
        initData();
        initView();
    }

private void initData() {
    bannerList = new ArrayList<>(4);
    BannerBean banner1 = new BannerBean("测试图片1", url1, "");
    BannerBean banner2 = new BannerBean("测试图片2", url2, "");
    BannerBean banner3 = new BannerBean("测试图片3", url3, "");
    BannerBean banner4 = new BannerBean("测试图片4", url4, "");
    bannerList.add(banner1);
    bannerList.add(banner2);
    bannerList.add(banner3);
    bannerList.add(banner4);
}

    private void initView() {
        BannerM banner = (BannerM) findViewById(R.id.bm_banner);
        if (banner != null) {
            banner.setBannerBeanList(bannerList)
                    .setDefaultImageResId(R.drawable.default_image)
                    .setIndexPosition(BannerM.INDEX_POSITION_BOTTOM)
                    .setIndexColor(getResources().getColor(R.color.colorPrimary))
                    .setIntervalTime(3)
                    .setOnItemClickListener(new BannerM.OnItemClickListener() {
                        @Override
                        public void onItemClick(int position) {
                            Log.e("landptf", "position = " + position);
                        }
                    })
                    .show();
        }
    }
}
