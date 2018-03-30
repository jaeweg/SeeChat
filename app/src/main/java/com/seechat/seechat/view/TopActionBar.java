package com.seechat.seechat.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.seechat.seechat.R;

/**
 * Created by hjw on 2018/3/30.
 */

public class TopActionBar extends ViewManager implements IViewControl{

    private Context mContext;
    private View mView;
    private ImageButton imageButton;

    public TopActionBar(Context context,View view){
        mContext = context;
        mView = view;
        initExView(mView);
        initExOnListener();
    }

    @Override
    public void initExView(View view) {
        imageButton = view.findViewById(R.id.top_backAway);
    }

    @Override
    public void initExOnListener() {
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void visible() {
        imageButton.setVisibility(View.VISIBLE);
    }

    @Override
    public void gone() {
        imageButton.setVisibility(View.GONE);
    }
}
