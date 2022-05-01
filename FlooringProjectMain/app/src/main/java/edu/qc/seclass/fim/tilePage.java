package edu.qc.seclass.fim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class tilePage extends AppCompatActivity {

    Button porcelain;
    Button ceramic;
    Button resin;
    FlooringDB flrDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tile_page);

        porcelain = (Button) findViewById(R.id.porcelainButton);
        ceramic = (Button) findViewById(R.id.ceramicButton);
        resin = (Button) findViewById(R.id.resinButton);

        flrDB = new FlooringDB(this);

        porcelain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.tileStyle("Porcelain");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(tilePage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(tilePage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(9).equals("") == false) {
                        viewdata.append("Tile Name : " + data.getString(9) + "\n");
                    }
                    if (data.getString(10).equals("") == false) {
                        viewdata.append("Tile Style : " + data.getString(10) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(tilePage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        ceramic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.tileStyle("Ceramic");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(tilePage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(tilePage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(9).equals("") == false) {
                        viewdata.append("Tile Name : " + data.getString(9) + "\n");
                    }
                    if (data.getString(10).equals("") == false) {
                        viewdata.append("Tile Style : " + data.getString(10) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(tilePage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        resin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.tileStyle("Resin");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(tilePage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(tilePage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(9).equals("") == false) {
                        viewdata.append("Tile Name : " + data.getString(9) + "\n");
                    }
                    if (data.getString(10).equals("") == false) {
                        viewdata.append("Tile Style : " + data.getString(10) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(tilePage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });
    }
}