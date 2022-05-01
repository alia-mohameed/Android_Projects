package edu.qc.seclass.fim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class woodPage extends AppCompatActivity {

    Button solid;
    Button engineered;
    Button bamboo;
    Button oak;
    Button hickory;
    Button maple;
    FlooringDB flrDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wood_page);

        solid = (Button) findViewById(R.id.solidButton);
        engineered = (Button) findViewById(R.id.engineeredButton);
        bamboo = (Button) findViewById(R.id.bambooButton);
        oak = (Button) findViewById(R.id.oakButton);
        maple = (Button) findViewById(R.id.mapleButton);
        hickory = (Button) findViewById(R.id.hickoryButton);

        flrDB = new FlooringDB(this);

        solid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.woodStyle("Solid");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(woodPage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(woodPage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(13).equals("") == false) {
                        viewdata.append("Wood Name : " + data.getString(13) + "\n");
                    }
                    if (data.getString(14).equals("") == false) {
                        viewdata.append("Wood Style : " + data.getString(14) + "\n");
                    }
                    if (data.getString(15).equals("") == false) {
                        viewdata.append("Wood Species : " + data.getString(15) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(woodPage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        engineered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.woodStyle("Engineered");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(woodPage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(woodPage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(13).equals("") == false) {
                        viewdata.append("Wood Name : " + data.getString(13) + "\n");
                    }
                    if (data.getString(14).equals("") == false) {
                        viewdata.append("Wood Style : " + data.getString(14) + "\n");
                    }
                    if (data.getString(15).equals("") == false) {
                        viewdata.append("Wood Species : " + data.getString(15) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(woodPage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        bamboo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.woodStyle("Bamboo");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(woodPage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(woodPage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(13).equals("") == false) {
                        viewdata.append("Wood Name : " + data.getString(13) + "\n");
                    }
                    if (data.getString(14).equals("") == false) {
                        viewdata.append("Wood Style : " + data.getString(14) + "\n");
                    }
                    if (data.getString(15).equals("") == false) {
                        viewdata.append("Wood Species : " + data.getString(15) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(woodPage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        oak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.woodSpecies("Oak");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(woodPage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(woodPage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(13).equals("") == false) {
                        viewdata.append("Wood Name : " + data.getString(13) + "\n");
                    }
                    if (data.getString(14).equals("") == false) {
                        viewdata.append("Wood Style : " + data.getString(14) + "\n");
                    }
                    if (data.getString(15).equals("") == false) {
                        viewdata.append("Wood Species : " + data.getString(15) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(woodPage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        hickory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.woodSpecies("Hickory");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(woodPage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(woodPage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(13).equals("") == false) {
                        viewdata.append("Wood Name : " + data.getString(13) + "\n");
                    }
                    if (data.getString(14).equals("") == false) {
                        viewdata.append("Wood Style : " + data.getString(14) + "\n");
                    }
                    if (data.getString(15).equals("") == false) {
                        viewdata.append("Wood Species : " + data.getString(15) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(woodPage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        maple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.woodSpecies("Maple");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(woodPage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(woodPage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(13).equals("") == false) {
                        viewdata.append("Wood Name : " + data.getString(13) + "\n");
                    }
                    if (data.getString(14).equals("") == false) {
                        viewdata.append("Wood Style : " + data.getString(14) + "\n");
                    }
                    if (data.getString(15).equals("") == false) {
                        viewdata.append("Wood Species : " + data.getString(15) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(woodPage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });
    }
}