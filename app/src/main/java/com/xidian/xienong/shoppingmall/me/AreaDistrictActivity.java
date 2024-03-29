package com.xidian.xienong.shoppingmall.me;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.xidian.xienong.R;
import com.xidian.xienong.util.AreaHttpUtils;

public class AreaDistrictActivity extends BaseFragmentActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_area_district);
        super.onCreate(savedInstanceState);

        initViews();
        initData();
        initEvent();

        setAreaType(AreaHttpUtils.DISTRICT);
    }

    private void initEvent() {
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initData() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initViews() {
        toolbar = (Toolbar) findViewById(R.id.app_bar);
    }
}
