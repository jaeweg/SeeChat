package com.seechat.seechat.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import com.seechat.seechat.R;

/**
 * Created by hjw on 2018/3/29.
 */

public class BottomBtnManager extends ViewManager{

    private Context mContext;
    private View mView;
    private ViewPager mViewPager;
    Button btn_sChat,btn_weiBo,btn_Video,btn_aboutMe;

    public BottomBtnManager(Context context, View view, ViewPager viewPager){
        mContext = context;
        mView = view;
        mViewPager = viewPager;
        initExView(mView);
        initExOnListener();
    }

    @Override
    public void initExView(View view) {
        btn_sChat = view.findViewById(R.id.bottomBtn_sChat);
        btn_weiBo = view.findViewById(R.id.bottomBtn_weiBo);
        btn_Video = view.findViewById(R.id.bottomBtn_video);
        btn_aboutMe = view.findViewById(R.id.bottomBtn_about);
    }

    @Override
    public void initExOnListener(){
        btn_sChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(0);
            }
        });

        btn_weiBo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(1);
            }
        });
        btn_Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(2);
            }
        });
        btn_aboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(3);
            }
        });
    }
}
