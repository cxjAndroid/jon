package com.example.administrator.breaking.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by chenxujun on 2016/6/1.
 */
public abstract class BaseActivity extends AppCompatActivity {

    public boolean isNeedBindButterKnife = true;

    //private Object subscriber;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int contentViewLayoutID = getContentViewLayoutID();
        if (contentViewLayoutID != 0) setContentView(contentViewLayoutID);
        if (isNeedBindButterKnife) ButterKnife.bind(this);
        initView();
        initPresenter();
        initData();
    }

    public abstract int getContentViewLayoutID();

    protected abstract void initView();

    protected void initPresenter() {

    }


    public abstract void initData();

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


}
