package com.seechat.seechat.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.seechat.seechat.R;

/**
 * Created by hjw on 2018/3/29.
 */

public class SChatBaseFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_schat,container,false);
        return view;
    }
}
