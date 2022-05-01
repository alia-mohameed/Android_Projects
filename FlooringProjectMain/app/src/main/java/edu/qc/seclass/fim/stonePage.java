package edu.qc.seclass.fim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class stonePage extends AppCompatActivity {
    Button marble;
    Button slate;
    Button pebble;
    FlooringDB flrDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stone_page);

        marble = (Button) findViewById(R.id.marbleButton);
        slate = (Button) findViewById(R.id.slateButton);
        pebble = (Button) findViewById(R.id.pebbleButton);

        flrDB = new FlooringDB(this);

        marble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.tileStyle("Marble");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(stonePage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(stonePage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(11).equals("") == false) {
                        viewdata.append("Stone Name : " + data.getString(11) + "\n");
                    }
                    if (data.getString(12).equals("") == false) {
                        viewdata.append("Stone Style : " + data.getString(12) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(stonePage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        pebble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.tileStyle("Pebble");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(stonePage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(stonePage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(11).equals("") == false) {
                        viewdata.append("Stone Name : " + data.getString(11) + "\n");
                    }
                    if (data.getString(12).equals("") == false) {
                        viewdata.append("Stone Style : " + data.getString(12) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(stonePage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        slate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.tileStyle("Pebble");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(stonePage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(stonePage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(11).equals("") == false) {
                        viewdata.append("Stone Name : " + data.getString(11) + "\n");
                    }
                    if (data.getString(12).equals("") == false) {
                        viewdata.append("Stone Style : " + data.getString(12) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(stonePage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });
    }
}