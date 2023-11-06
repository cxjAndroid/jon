package com.example.administrator.breaking.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.breaking.R;
import com.example.administrator.breaking.activity.FragmentDemoActivity;
import com.example.administrator.breaking.utils.LogUtils;

import static android.widget.Toast.LENGTH_SHORT;

public class FragmentDemo1 extends Fragment implements FragmentDemoActivity.FragmentClick {
    private TextView text;
    private View view;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        LogUtils.e("Fragment----onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.e("Fragment----onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_1, null);
        LogUtils.e("Fragment----onCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        LogUtils.e("Fragment----onActivityCreated");
        TextView tv = this.view.findViewById(R.id.text);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void fragmentClickListener() {
        Toast.makeText(getActivity(), "fragment method", LENGTH_SHORT).show();
    }


    @Override
    public void onStart() {
        super.onStart();
        LogUtils.e("Fragment----onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtils.e("Fragment----onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        LogUtils.e("Fragment----onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        LogUtils.e("Fragment----onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LogUtils.e("Fragment----onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtils.e("Fragment----onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        LogUtils.e("Fragment----onDetach");
    }
}
