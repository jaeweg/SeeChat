package com.seechat.seechat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

import com.seechat.commutils.DisPlayUtils;

/**
 * Created by hjw on 2018/3/30.
 */

public class SlipButton extends View{

    Context mContext;
    private int height,wight = 0;
    public static final String TAG = "SlipButton";
    Paint paint;
    public SlipButton(Context context) {
        super(context);
        mContext = context;

    }

    public SlipButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        paint = new Paint();
    }

    public SlipButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        paint = new Paint();
    }

    public SlipButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(0xff97ED0C);
        paint.setStrokeWidth(10f);
        paint.setShadowLayer(2,3,3, Color.rgb(81,179,21));
        RectF rectF = new RectF(0,0,wight,height);
        canvas.drawRoundRect(rectF,6,6,paint);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        Log.i(TAG,"dm.heightPixels == " + dm.heightPixels);
        Log.i(TAG,"dm.widthPixels == " + dm.widthPixels);
        Log.i(TAG,"widthMeasureSpec == " + widthMeasureSpec);
        Log.i(TAG,"heightMeasureSpec == " + heightMeasureSpec);
        //MeasureSpec.getMode(widthMeasureSpec);
        height = DisPlayUtils.dp2px(mContext,50);
        wight = dm.widthPixels / 4;
    }

}
