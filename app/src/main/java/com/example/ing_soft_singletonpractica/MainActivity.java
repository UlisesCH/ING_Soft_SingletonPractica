package com.example.ing_soft_singletonpractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insert();
    }

    public void insert(){
        SQLiteDatabase conexion = Singleton.getDataBaseInstance(getApplicationContext()).getWritableDatabase();
        ContentValues contenido = new ContentValues();
        contenido.put("idUsuario",1);
        contenido.put("nombreUser","Juan Perez");
        contenido.put("edad",23);
        if(conexion.insert("tbl_usuarios", null, contenido)>0){
            Toast.makeText(this, "SE INSERTO CORRECTAMENTE", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this, "ERROR AL INSERTAR", Toast.LENGTH_LONG).show();
        }
    }

}