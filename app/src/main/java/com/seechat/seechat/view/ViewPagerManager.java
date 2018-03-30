package com.seechat.seechat.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;

import com.seechat.seechat.R;

/**
 * Created by hjw on 2018/3/30.
 */

public class ViewPagerManager extends ViewManager{

    private Context mContext;
    private View mView;
    private static ViewPager mViewPager;
    private static final String TAG = "ViewPagerManager";
    public ViewPagerManager(Context context,View view){
        mContext = context;
        mView = view;
        initExView(view);
        initExOnListener();
    }

    public static ViewPager getViewPagerInstance(Context c,View vv){
            new ViewPagerManager(c,vv);
        return mViewPager;
    }

    @Override
    public void initExView(View view){
        mViewPager = view.findViewById(R.id.viewpager);
    }

    @Override
    public void initExOnListener(){
        mViewPager.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                Log.i(TAG,"v.getid == " + v.getId());
                Log.i(TAG,"scrollX == " + scrollX);
                Log.i(TAG,"scrollY == " + scrollY);
                Log.i(TAG,"oldScrollX == " + oldScrollX);
                Log.i(TAG,"oldScrollY == " + oldScrollY);
            }
        });

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


}
