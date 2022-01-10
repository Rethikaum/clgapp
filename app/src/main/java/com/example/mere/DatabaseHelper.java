
package com.example.mere;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper{

    public static final String  DATABASE_NAME="student.db";
    public static final String  TABLE_NAME="student_table";
    public static final String  COL_1="ID";
    public static final String  COL_2="NAME";
    public static final String  COL_3="REGISTERNUMBER";
    public static final String  COL_4="DOB";
    public static final String  COL_5="DEPT";
    public static final String  COL_6="BATCH";
    public static final String  COL_7="FATHERNAME";
    public static final String  COL_8="MOTHERNAME";
    public static final String  COL_9="ADDRESS";
    public static final String  COL_10="CITY";
    public static final String  COL_11="STATE";
    public static final String  COL_12="PINCODE";
    public static final String  COL_13="PHONENUMBER";
    public static final String  COL_14="EMAIL";
    public static final String  COL_15="SEM1";
    public static final String  COL_16="SEM2";
    public static final String  COL_17="SEM3";
    public static final String  COL_18="SEM4";
    public static final String  COL_19="SEM5";
    public static final String  COL_20="SEM6";
    public static final String  COL_21="SEM7";
    public static final String  COL_22="SEM8";




    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME ,null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +("(ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME VARCHAR,REGISTERNUMBER INTEGER,DOB VARCHAR, DEPT TEXT,  BATCH VARCHAR, FATHERNAME TEXT, MOTHERNAME TEXT,ADDRESS VARCHAR, CITY TEXT, STATE TEXT, PINCODE INTEGER, PHONENUMBER INTEGER, SEM1 INTEGER,SEM1 INTEGER,SEM1 INTEGER,SEM2 INTEGER,SEM3 INTEGER ,SEM4 INTEGER,SEM5 INTEGER,SEM6 INTEGER,SEM7 INTEGER,SEM8 INTEGER)"));
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String name, String registernumber, String dob, String dept, String batch, String fathername, String mothername, String address, String city, String state, String pincode, String phonenumber, String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,name);
        contentValues.put(COL_3,registernumber);
        contentValues.put(COL_4,dob);
        contentValues.put(COL_5,dept);
        contentValues.put(COL_6,batch);
        contentValues.put(COL_7,fathername);
        contentValues.put(COL_8,mothername);
        contentValues.put(COL_9,address);
        contentValues.put(COL_10,city);
        contentValues.put(COL_11,state);
        contentValues.put(COL_12,pincode);
        contentValues.put(COL_13,phonenumber);
        contentValues.put(COL_14,email);



        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean insertData(String sem1, String sem2, String sem3, String sem4, String sem5, String sem6, String sem7, String sem8) {

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_15,sem1);
        contentValues.put(COL_16,sem2);
        contentValues.put(COL_17,sem3);
        contentValues.put(COL_18,sem4);
        contentValues.put(COL_19,sem5);
        contentValues.put(COL_20,sem6);
        contentValues.put(COL_21,sem7);
        contentValues.put(COL_22,sem8);

        long result = db.insert(TABLE_NAME,null ,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }
}
