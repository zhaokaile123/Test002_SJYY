package com.atguigu.mobileplayer0224.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class VideoView extends android.widget.VideoView {


    public VideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //保存测量的结果
        setMeasuredDimension(widthMeasureSpec,heightMeasureSpec);
    }

    public void setVideoSize(int width,int height){
        ViewGroup.LayoutParams l = getLayoutParams();
        l.width = width;
        l.height = height;
        setLayoutParams(l);
    }
}
