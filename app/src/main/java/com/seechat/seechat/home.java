package com.seechat.seechat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.test.suitebuilder.annotation.MediumTest;
import android.view.View;

import com.seechat.commutils.DataBaseHelper;
import com.seechat.seechat.view.BaseActivity;
import com.seechat.seechat.view.BottomBtnManager;
import com.seechat.seechat.view.MyFragmentAdapter;
import com.seechat.seechat.view.ViewPagerManager;



/**
 * Created by hjw on 2018/3/28.
 */

public class home extends BaseActivity {

    private static final String TAG = "MainActivity";
    private FragmentPagerAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = this.getLayoutInflater().inflate(R.layout.main,null);
        setContentView(v);
        adapter = new MyFragmentAdapter(getSupportFragmentManager());
        viewPager = ViewPagerManager.getViewPagerInstance(this,v);
        viewPager.setAdapter(adapter);
        BottomBtnManager bottomBtnManager = new BottomBtnManager(this, v,viewPager);
        DataBaseHelper dataBaseHelper = new DataBaseHelper(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @MediumTest
    public void testActivity(){

    }
}
