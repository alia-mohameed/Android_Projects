package edu.qc.seclass.fim;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class FlooringDB extends SQLiteOpenHelper {

    public static final String FloorDB = "FloorDB1.db";


    public FlooringDB(Context context) {
        super(context, "FloorDB1.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase FlooringDB) {
        FlooringDB.execSQL("create Table Flooring1(storeID TEXT, storeAddress TEXT, floorID TEXT, floorName TEXT, floorColor TEXT, floorSize TEXT, floorPrice TEXT, floorBrand TEXT, floorType TEXT, tileName TEXT, tileStyle TEXT, stoneName TEXT, stoneStyle TEXT, woodName TEXT, woodStyle TEXT, woodSpecies TEXT, laminateName TEXT, laminateStyle TEXT, vinylName TEXT, vinylStyle TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase FlooringDB, int i, int i1) {
        FlooringDB.execSQL(("drop Table if exists Flooring1"));
    }

    public Boolean insertData(String storeID, String storeAddress, String floorID, String floorName, String floorColor, String floorSize, String floorPrice, String floorBrand, String floorType, String tileName, String tileStyle, String stoneName, String stoneStyle, String woodName, String woodStyle, String woodSpecies, String laminateName, String laminateStyle, String vinylName, String vinylStyle) {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("storeID",storeID); //0
        contentValues.put("storeAddress", storeAddress); //1
        contentValues.put("floorID", floorID); //2
        contentValues.put("floorName", floorName); //3
        contentValues.put("floorColor",floorColor); //4
        contentValues.put("floorSize", floorSize); //5
        contentValues.put("floorPrice", floorPrice); //6
        contentValues.put("floorBrand", floorBrand); //7
        contentValues.put("floorType", floorType); //8
        contentValues.put("tileName", tileName); //9
        contentValues.put("tileStyle", tileStyle); //10
        contentValues.put("stoneName", stoneName); //11
        contentValues.put("stoneStyle", stoneStyle); //12
        contentValues.put("woodName", woodName); //13
        contentValues.put("woodStyle", woodStyle); //14
        contentValues.put("woodSpecies", woodSpecies); //15
        contentValues.put("laminateName", laminateName); //16
        contentValues.put("laminateStyle", laminateStyle); //17
        contentValues.put("vinylName", vinylName); //18
        contentValues.put("vinylStyle", vinylStyle); //19

        long result = FlooringDB.insert("Flooring1",null,contentValues);
        if(result == -1) {
            return false;
        }
        else
            return true;
    }

    public Boolean updateData(String storeID, String storeAddress, String floorID, String floorName, String floorColor, String floorSize, String floorPrice, String floorBrand, String floorType, String tileName, String tileStyle, String stoneName, String stoneStyle, String woodName, String woodStyle, String woodSpecies, String laminateName, String laminateStyle, String vinylName, String vinylStyle) {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("storeID",storeID);
        contentValues.put("storeAddress", storeAddress);
        contentValues.put("floorID", floorID);
        contentValues.put("floorName", floorName);
        contentValues.put("floorColor",floorColor);
        contentValues.put("floorSize", floorSize);
        contentValues.put("floorPrice", floorPrice);
        contentValues.put("floorBrand", floorBrand);
        contentValues.put("floorType", floorType);
        contentValues.put("tileName", tileName);
        contentValues.put("tileStyle", tileStyle);
        contentValues.put("stoneName", stoneName);
        contentValues.put("stoneStyle", stoneStyle);
        contentValues.put("woodName", woodName);
        contentValues.put("woodStyle", woodStyle);
        contentValues.put("woodSpecies", woodSpecies);
        contentValues.put("laminateName", laminateName);
        contentValues.put("laminateStyle", laminateStyle);
        contentValues.put("vinylName", vinylName);
        contentValues.put("vinylStyle", vinylStyle);

        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where floorID = ?", new String[] {floorID});

        if(cursor.getCount()>0)
        {
            long result = FlooringDB.update("Flooring1", contentValues, "floorID=?", new String[] {floorID});
            if(result == -1) {
                return false;
            }
            else
                return true;
        }
        else
            return false;
    }

    public Boolean deleteData(String floorID)
    {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where floorID = ?", new String[] {floorID});
        if(cursor.getCount()>0)
        {
            long result = FlooringDB.delete("Flooring1","floorID=?", new String[] {floorID});
            if(result == -1) {
                return false;
            }
            else
                return true;
        }
        else
            return false;
    }

    public Cursor search(String floorName)
    {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where floorName = ?", new String[] {floorName});
        return cursor;
    }

    public Cursor woodSpecies(String species)
    {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where woodSpecies = ?", new String[] {species});
        return cursor;
    }

    public Cursor woodStyle(String style)
    {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where woodStyle = ?", new String[] {style});
        return cursor;
    }

    public Cursor vinylStyle(String style)
    {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where vinylStyle = ?", new String[] {style});
        return cursor;
    }

    public Cursor laminateStyle(String style)
    {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where laminateStyle = ?", new String[] {style});
        return cursor;
    }

    public Cursor stoneStyle(String style)
    {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where stoneStyle = ?", new String[] {style});
        return cursor;
    }

    public Cursor tileStyle(String style)
    {
        SQLiteDatabase FlooringDB = this.getWritableDatabase();
        Cursor cursor = FlooringDB.rawQuery("Select * from Flooring1 where tileStyle = ?", new String[] {style});
        return cursor;
    }

}
