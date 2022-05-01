package edu.qc.seclass.fim;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class EmployeeDB extends SQLiteOpenHelper {

    public static final String EmployeeDB5 = "EmployeeDB5.db";

    public EmployeeDB(Context context) {
        super(context, "EmployeeDB5.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase EmployeeDB) {
        EmployeeDB.execSQL("create Table Employees5(username TEXT primary key, password TEXT, empName TEXT, empPosition TEXT, empID TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase EmployeeDB, int i, int i1) {
        EmployeeDB.execSQL(("drop Table if exists Employees5"));
    }

    public Boolean insertData(String username, String password, String empName, String empPosition, String empID) {
        SQLiteDatabase EmployeeDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", username);
        contentValues.put("password", password);
        contentValues.put("empName", empName);
        contentValues.put("empPosition", empPosition);
        contentValues.put("empID", empID);

        long result = EmployeeDB.insert("Employees5",null,contentValues);
        if(result == -1) {
            return false;
        }
        else
            return true;
    }

    public boolean employeeExists(String username) {
        SQLiteDatabase EmployeeDB2 = this.getWritableDatabase();
        Cursor cursor = EmployeeDB2.rawQuery("Select * from Employees5 where username = ?", new String [] {username});
        if (cursor.getCount() > 0)
        {
            return true;
        }
        else
            return false;
    }

    public boolean login(String username, String password) {
        SQLiteDatabase EmployeeDB = this.getWritableDatabase();
        Cursor cursor = EmployeeDB.rawQuery("Select * from Employees5 where username = ? and password = ? ", new String [] {username,password});
        if (cursor.getCount() > 0)
        {
            return true;
        }
        else
            return false;
    }


}
