package com.android.framework.wifis.database

import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.android.framework.wifis.ui.Application

object DbManager {

    private const val dbName: String = "zroom"

    val db:RoomDB by lazy {
        Room.databaseBuilder(
            Application.getInstance(), RoomDB::class.java, dbName
        ).allowMainThreadQueries()
            .addCallback(DbCreateCallBack)
            .addMigrations()
            .build()
    }

    private object DbCreateCallBack: RoomDatabase.Callback() {
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
        }
    }
}