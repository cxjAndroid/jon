package com.example.administrator.breaking.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.administrator.breaking.R;
import com.example.administrator.breaking.fragment.FragmentDemo1;
import com.example.administrator.breaking.fragment.FragmentDemo2;
import com.example.administrator.breaking.utils.LogUtils;

import butterknife.BindView;

import static android.widget.Toast.LENGTH_SHORT;

public class FragmentDemoActivity extends BaseActivity {
    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.fragment_container)
    FrameLayout fragmentContainer;

    @Override
    public int getContentViewLayoutID() {
        return R.layout.activity_fragment;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.e("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.e("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.e("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtils.e("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtils.e("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.e("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.e("onRestart");
    }


    @Override
    public void initData() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        FragmentDemo1 fragmentDemo1 = new FragmentDemo1();
       /* fragmentDemo1.setFragmentClick(new FragmentDemo1.FragmentClick() {
            @Override
            public void fragmentClickListener() {
                Toast.makeText(FragmentDemoActivity.this,"in activity",LENGTH_SHORT).show();
            }
        });*/
        fragmentTransaction.replace(R.id.fragment_container, fragmentDemo1);
        fragmentTransaction.commitAllowingStateLoss();

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                FragmentDemo2 fragmentDemo2 = new FragmentDemo2();
                fragmentTransaction.replace(R.id.fragment_container, fragmentDemo2);
                fragmentTransaction.commitAllowingStateLoss();
            }
        });
    }

    public interface FragmentClick {
        void fragmentClickListener();
    }

}
