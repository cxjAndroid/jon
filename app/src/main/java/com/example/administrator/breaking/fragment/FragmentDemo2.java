package com.example.administrator.breaking.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.breaking.R;
import com.example.administrator.breaking.utils.LogUtils;

public class FragmentDemo2 extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        LogUtils.e("Fragment2----onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.e("Fragment2----onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, null);
        LogUtils.e("Fragment2----onCreateView");
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        LogUtils.e("Fragment2----onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        LogUtils.e("Fragment2----onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        LogUtils.e("Fragment2----onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        LogUtils.e("Fragment2----onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        LogUtils.e("Fragment2----onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        LogUtils.e("Fragment2----onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        LogUtils.e("Fragment2----onDetach");
    }
}
