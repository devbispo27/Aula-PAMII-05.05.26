package com.example.arthurbisposantospamiiapiibimii.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.arthurbisposantospamiiapiibimii.api.AppUtil;
import com.example.arthurbisposantospamiiapiibimii.datamodel.ClienteDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    public static final String NAME = "atividade_arthur_bispo.sqlite";
    public static int version       = 1;

    SQLiteDatabase db;
    public AppDataBase(Context context) {
        super(context, NAME, null, version);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(AppUtil.TAG, "Criando a tabela " + ClienteDataModel.TABELA);
        db.execSQL(ClienteDataModel.criartabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
