package com.example.poppybu.workself;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import android.widget.TextView;

import java.nio.channels.SeekableByteChannel;

/**
 * Created by poppybu on 17-6-23.
 */

public class Myfive extends View {

    private final static String TAG=Mythree.class.getSimpleName();
    private Paint mPaint;
    private RectF oval;

    public Myfive(Context context){
        super(context);
        init();
    }

    public Myfive(Context context, AttributeSet attrs){
        super(context, attrs);
        init();
    }

    public Myfive(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        oval = new RectF();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        Log.e(TAG,"onMeasure--widthMode-->"+widthMode);
        switch (widthMode){
            case MeasureSpec.EXACTLY:
                break;
            case MeasureSpec.AT_MOST:
                break;
            case MeasureSpec.UNSPECIFIED:
                break;
        }
        Log.e(TAG,"onMeasure--widthSize-->"+widthSize);
        Log.e(TAG,"onMeasure--heightMode-->"+heightMode);
        Log.e(TAG,"onMeasure--heightSize-->"+heightSize);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Log.e(TAG,"onLayout");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        int width = getWidth();
        int height = getHeight();
        Log.e(TAG,"onDraw---->"+width+"*"+height);
        float radius = width / 4;
        canvas.drawCircle(width / 2, width / 2, radius, mPaint);

        mPaint.setColor(Color.GREEN);
        oval.set(width / 2 - radius, width / 2 - radius,
                width / 2 + radius, width / 2 + radius);
        canvas.drawArc(oval,360,72,true,mPaint);

        mPaint.setColor(Color.YELLOW);
        oval.set(width / 2 - radius, width / 2 - radius,
                width / 2 + radius, width / 2 + radius);
        canvas.drawArc(oval,288,72,true,mPaint);

        mPaint.setColor(Color.BLUE);
        oval.set(width / 2 - radius, width / 2 - radius,
                width / 2 + radius, width / 2 + radius);
        canvas.drawArc(oval,216,72,true,mPaint);

        mPaint.setColor(Color.BLACK);
        oval.set(width / 2 - radius, width / 2 - radius,
                width / 2 + radius, width / 2 + radius);
        canvas.drawArc(oval,144,72,true,mPaint);
    }
}





























































