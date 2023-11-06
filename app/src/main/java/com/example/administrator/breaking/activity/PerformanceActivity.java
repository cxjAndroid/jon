package com.example.administrator.breaking.activity;

import android.app.ActivityManager;
import android.content.Context;
import android.view.View;
import android.widget.TextView;


import com.example.administrator.breaking.R;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author jon
 * @since 6/25/18
 */
public class PerformanceActivity extends BaseActivity {

    @BindView(R.id.heap_text)
    TextView heapText;

    @Override
    public int getContentViewLayoutID() {
        return R.layout.activity_performance;
    }

    @Override
    protected void initView() {
    }

    @Override
    public void initData() {
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        int heapSize = manager.getMemoryClass();
        heapText.setText("heapSize=" + heapSize);
    }

    @OnClick({R.id.btn})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                heapText.scrollTo(100, 0);
                break;
        }
    }
}
