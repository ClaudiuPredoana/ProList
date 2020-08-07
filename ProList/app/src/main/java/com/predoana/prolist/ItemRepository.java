package com.predoana.prolist;

import android.content.Context;
import android.os.AsyncTask;

public class ItemRepository {
    private Context context;

    public ItemRepository(Context context){
        this.context = context.getApplicationContext();
    }

    public void addNewItem(DbTable dbTable) {
        AsyncTask.execute(()->DbDatabase.getInstance(context).dbDAO().insertItem(dbTable));
    }

}
