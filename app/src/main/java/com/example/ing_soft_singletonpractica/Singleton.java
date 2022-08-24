package com.example.ing_soft_singletonpractica;

import android.content.Context;
import com.example.ing_soft_singletonpractica.base.database;

public class Singleton {

    private static database dataBaseInstance;
    private Context context;

    private Singleton(Context context){
        this.context = context;
        dataBaseInstance = new database(context, "db_prueba", null, 1);
    }

    public static database getDataBaseInstance(Context contextApp) {
        if (dataBaseInstance == null){
            new Singleton(contextApp);
        }
        return dataBaseInstance;
    }
}
