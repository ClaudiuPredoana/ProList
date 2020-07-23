package com.predoana.prolist;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DbDAO {

    @Insert
    void insertItem(DbTable... dbTables);

    @Query("SELECT * from DbTable")
    LiveData<List<DbTable>> getAllItems();

    @Query("SELECT COUNT(*) from DbTable")
    LiveData<Integer> countItems();

    void deleteitem(DbTable dbTable);

}
