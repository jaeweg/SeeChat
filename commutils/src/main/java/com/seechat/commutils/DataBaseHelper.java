package com.seechat.commutils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.seechat.commutils.model.Books;
import com.seechat.commutils.model.DataModel;
import com.seechat.commutils.view.ControlDataBase;

import org.litepal.tablemanager.Connector;

/**
 * Created by hjw on 2018/3/28.
 */

public class DataBaseHelper {

    private ControlDataBase controlDataBase;
    private Context context;
   public DataBaseHelper(Context context){
       SQLiteDatabase database = Connector.getDatabase();
       this.context = context;
   }

   public ControlDataBase getDbController(){
        if (controlDataBase != null)
            controlDataBase = new ControlDataBase(context);
        return controlDataBase;
   }

}
