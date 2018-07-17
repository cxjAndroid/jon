package com.example.administrator.breaking.activity;

import android.app.ActivityManager;
import android.content.Context;
import android.widget.TextView;

import com.example.administrator.breaking.R;

import butterknife.BindView;

public class PerformanceActivity extends BaseActivity {


    @BindView(R.id.text_heap)
    TextView HeapText;

    @Override
    public int getContentViewLayoutID() {
        return R.layout.activity_performance;
    }

    @Override
    protected void initView() {

    }

    @Override
    public void initData() {
        ActivityManager manager = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
        int heapSize = 0;
        try {
            heapSize = manager.getMemoryClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
        HeapText.setText("heapSize="+heapSize);
    }
}
