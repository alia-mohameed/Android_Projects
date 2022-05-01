package edu.qc.seclass.fim;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CustomerDB extends SQLiteOpenHelper {

    public static final String CustomerDB = "CustomerNewDB.db";
    public static int customerIDs;


    public CustomerDB(Context context) {
        super(context, "CustomerNewDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase customerDB) {
        customerDB.execSQL("create Table CustomersNew(username TEXT primary key, password TEXT, email TEXT, customerID TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase customerDB, int i, int i1) {
        customerDB.execSQL(("drop Table if exists CustomersNew"));
    }

    public Boolean insertData(String username, String password, String email, String customerID) {
        SQLiteDatabase CustomerDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Username", username);
        contentValues.put("Password", password);
        contentValues.put("Email", email);
        contentValues.put("CustomerID", customerID);

        long result = CustomerDB.insert("CustomersNew",null,contentValues);
        if(result == -1) {
            return false;
        }
        else
            this.customerIDs = this.customerIDs+1;
            return true;
    }

    public boolean customerExists(String username) {
        SQLiteDatabase CustomerDB = this.getWritableDatabase();
        Cursor cursor = CustomerDB.rawQuery("Select * from CustomersNew where username = ?", new String [] {username});
        if (cursor.getCount() > 0)
        {
            return true;
        }
        else
            return false;
    }

    public boolean login(String username, String password) {
        SQLiteDatabase CustomerDB = this.getWritableDatabase();
        Cursor cursor = CustomerDB.rawQuery("Select * from CustomersNew where username = ? and password = ? ", new String [] {username,password});
        if (cursor.getCount() > 0)
        {
            return true;
        }
        else
            return false;
    }

}
