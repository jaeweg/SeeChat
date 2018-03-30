package com.seechat.commutils.view;


import android.content.Context;

import com.seechat.commutils.model.DataModel;

import java.util.List;

/**
 * Created by hjw on 2018/3/28.
 */

public class ControlDataBase implements IControlDataBase{

    private Context mContext;
    public ControlDataBase(Context context){
        mContext = context;
    }
    @Override
    public void newTable() {

    }

    @Override
    public void deleteTable() {

    }

    @Override
    public void updateTable() {

    }

    @Override
    public boolean save(DataModel dataModel) {
        return dataModel.save();
    }

    @Override
    public void saveThrows(DataModel dataModel) {

    }

    @Override
    public void saveAll(List list) {

    }

    @Override
    public void updateAll() {

    }

    @Override
    public void delete(DataModel dataModel, int id) {

    }

    @Override
    public void update() {

    }

    @Override
    public void find() {

    }

    @Override
    public void min() {

    }
}
