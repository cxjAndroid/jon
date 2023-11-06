package com.example.administrator.breaking.activity;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.breaking.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class RecyclerViewActivity extends BaseActivity {
    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @Override
    public int getContentViewLayoutID() {
        return R.layout.activity_recycler_demo;
    }

    @Override
    protected void initView() {

    }

    @Override
    public void initData() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        MyAdapter adapter = new MyAdapter();
        adapter.setData(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.notifyDataSetChanged();
    }


    class MyAdapter extends RecyclerView.Adapter<MyHolder> {
        private List<Integer> data;

        public List<Integer> getData() {
            return data;
        }

        public void setData(List<Integer> data) {
            this.data = data;
        }

        @NonNull
        @Override
        public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            MyHolder holder = new MyHolder(LayoutInflater.from(RecyclerViewActivity.this).inflate(R.layout.item_recycler_demo, null));
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyHolder holder, int position) {
            holder.text.setText(String.valueOf(data.get(position)));
        }

        @Override
        public int getItemCount() {
            return data == null ? 0 : data.size();
        }
    }


    class MyHolder extends RecyclerView.ViewHolder {

        private final ImageView imagePic;
        private final TextView text;

        public MyHolder(View itemView) {
            super(itemView);
            imagePic = itemView.findViewById(R.id.image_pic);
            text = itemView.findViewById(R.id.text);
        }
    }


}
