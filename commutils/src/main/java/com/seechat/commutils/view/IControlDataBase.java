package com.seechat.commutils.view;

import com.seechat.commutils.model.DataModel;

import java.util.List;

/**
 * Created by hjw on 2018/3/28.
 */

public interface IControlDataBase {

    //new a table
    public void newTable();

    //delete a table
    public void deleteTable();

    //update a table
    public void updateTable();

    //insert one data
    public boolean save(DataModel dataModel);

    //insert one data
    public void saveThrows(DataModel dataModel);

    //insert all data
    public void saveAll(List list);

    //update data
    public void updateAll();

    //delete data by id
    public void delete(DataModel dataModel,int id);

    //update data
    public void update();

    //find data
    public void find();

    //dataSupport.min
    public void min();
}
