package com.example.factory_chocolate.data.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(context, "factoryDataBase", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table customer(cpf text primary key, name text, email text, phone text, age Integer)")
    }

    override fun onUpgrade(
        db: SQLiteDatabase?,
        oldVersion: Int,
        newVersion: Int
    ) {
        TODO("Not yet implemented")
    }

}