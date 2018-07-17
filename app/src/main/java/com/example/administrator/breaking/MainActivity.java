package com.example.administrator.breaking;

import android.content.Intent;
import android.view.View;

import com.example.administrator.breaking.activity.BaseActivity;
import com.example.administrator.breaking.activity.PerformanceActivity;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @Override
    public int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    public void initData() {

    }

    @OnClick({R.id.btn_performance})
    public void onClick(View v){
        startActivity(new Intent(this, PerformanceActivity.class));
    }
}
