package edu.qc.seclass.fim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class laminatePage extends AppCompatActivity {

    Button resistant;
    Button regular;
    FlooringDB flrDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laminate_page);
        resistant = (Button) findViewById(R.id.resistant2Button);
        regular = (Button) findViewById(R.id.regularButton);


        flrDB = new FlooringDB(this);

        resistant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.laminateStyle("WaterResistant");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(laminatePage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(laminatePage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(16).equals("") == false) {
                        viewdata.append("Laminate Name : " + data.getString(16) + "\n");
                    }
                    if (data.getString(17).equals("") == false) {
                        viewdata.append("Laminate Style : " + data.getString(17) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(laminatePage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        regular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.laminateStyle("Regular");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(laminatePage.this, "Button has been clicked", Toast.LENGTH_SHORT).show();
                if (data.getCount() == 0) {
                    Toast.makeText(laminatePage.this, "This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(16).equals("") == false) {
                        viewdata.append("Laminate Name : " + data.getString(16) + "\n");
                    }
                    if (data.getString(17).equals("") == false) {
                        viewdata.append("Laminate Style : " + data.getString(17) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(laminatePage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });
    }
}