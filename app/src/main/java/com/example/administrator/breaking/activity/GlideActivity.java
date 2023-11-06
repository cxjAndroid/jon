package com.example.administrator.breaking.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.administrator.breaking.R;
import com.example.administrator.breaking.utils.LogUtils;

import butterknife.BindView;

/**
 * @author jon
 * @since 7/13/18
 */
public class GlideActivity extends BaseActivity {

    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.text_byte_before)
    TextView textByteBefore;
    @BindView(R.id.text_byte_after)
    TextView textByteAfter;

    @Override
    public int getContentViewLayoutID() {
        return R.layout.activity_glide;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        LogUtils.e("onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        LogUtils.e("onRestoreInstanceState");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.e("onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.e("onRestart");
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
    public void initData() {
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024 / 1024);
        LogUtils.e("Max memory is " + maxMemory + "MB");
        Glide.with(this).load(R.drawable.picture_shijue_92).into(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GlideActivity.this, GlideActivity.class));
            }
        });
    }


    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        final BitmapFactory.Options options1 = new BitmapFactory.Options();
        Bitmap bitmapBefore = BitmapFactory.decodeResource(getResources(),
                R.drawable.picture_shijue_92, options1);

        textByteBefore.setText(
                "bitmapBefore----" + bitmapBefore.getByteCount() / 1024 / 1024 + "MB");

        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), R.drawable.picture_shijue_92, options);
        // 调用上面定义的方法计算inSampleSize值
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        LogUtils.e("width-----:" + width);
        LogUtils.e("height-----:" + height);

        options.inSampleSize = calculateInSampleSize(options, width, height);
        // 使用获取到的inSampleSize值再次解析图片
        options.inJustDecodeBounds = false;
        Bitmap bitmapAfter = BitmapFactory.decodeResource(getResources(),
                R.drawable.picture_shijue_92, options);

        textByteAfter.setText("bitmapAfter----" + bitmapAfter.getByteCount() / 1024 / 1024 + "MB");

        imageView.setImageBitmap(bitmapAfter);
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth,
                                            int reqHeight) {
        // 源图片的高度和宽度
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;
        if (height > reqHeight || width > reqWidth) {
            // 计算出实际宽高和目标宽高的比率
            final int heightRatio = Math.round((float) height / (float) reqHeight);
            final int widthRatio = Math.round((float) width / (float) reqWidth);
            // 选择宽和高中最小的比率作为inSampleSize的值，这样可以保证最终图片的宽和高
            // 一定都会大于等于目标的宽和高。
            inSampleSize = heightRatio < widthRatio ? heightRatio : widthRatio;
        }
        return inSampleSize;
    }

}
