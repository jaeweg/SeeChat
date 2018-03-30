package com.seechat.seechat.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;
import android.view.ViewGroup;

/**
 * Created by hjw on 2018/3/29.
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private SChatBaseFragment SChatFragment;
    private WeiBoBaseFragment weiBoFragment;
    private MovieBaseFragment movieFragment;
    private AboutMeBaseFragment aboutMeBaseFragment;
    static final String TAG = "MyFragmentAdapter";

    public static final int FRAGMENT_NUM = 4;

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
        SChatFragment = new SChatBaseFragment();
         weiBoFragment = new WeiBoBaseFragment();
         movieFragment = new MovieBaseFragment();
         aboutMeBaseFragment = new AboutMeBaseFragment();
    }


    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new BaseFragment();
        switch (position){
            case 0:
                fragment = SChatFragment;
                break;
            case 1:
                fragment = weiBoFragment;
                break;
            case 2:
                fragment = movieFragment;
                break;
            case 3:
                fragment = aboutMeBaseFragment;
                break;
        }
        return fragment;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Log.i(TAG,"position == " + position);
        Log.i(TAG,"container == " + container);
        return super.instantiateItem(container, position);
    }

        @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    @Override
    public int getCount() {
        return FRAGMENT_NUM;
    }

//    @Override
//    public boolean isViewFromObject(View view, Object object) {
//        return false;
//    }


}
