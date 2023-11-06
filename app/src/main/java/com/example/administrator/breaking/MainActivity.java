package com.example.administrator.breaking;

import android.content.Intent;
import android.view.View;

import com.android.volley.toolbox.Volley;
import com.example.administrator.breaking.activity.BaseActivity;
import com.example.administrator.breaking.activity.FragmentDemoActivity;
import com.example.administrator.breaking.activity.GlideActivity;
import com.example.administrator.breaking.activity.PerformanceActivity;
import com.example.administrator.breaking.activity.RecyclerViewActivity;

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
        Volley.newRequestQueue(this);
    }

    @OnClick({R.id.btn_performance, R.id.btn_glide, R.id.btn_fragment,R.id.btn_recycler})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_performance:
                startActivity(new Intent(this, PerformanceActivity.class));
                break;
            case R.id.btn_glide:
                startActivity(new Intent(this, GlideActivity.class));
                break;
            case R.id.btn_fragment:
                startActivity(new Intent(this, FragmentDemoActivity.class));
                break;
            case R.id.btn_recycler:
                startActivity(new Intent(this, RecyclerViewActivity.class));
                break;
        }
    }
}
