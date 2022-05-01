package edu.qc.seclass.fim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class vinylPage extends AppCompatActivity {

    Button resistant;
    Button waterproof;
    FlooringDB flrDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinyl_page);

        waterproof = (Button) findViewById(R.id.proofButton);
        resistant = (Button) findViewById(R.id.resistantButton);

        flrDB = new FlooringDB(this);

        waterproof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.vinylStyle("WaterProof");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(vinylPage.this,"Button has been clicked", Toast.LENGTH_SHORT).show();
                if(data.getCount()==0)
                {
                    Toast.makeText(vinylPage.this,"This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(18).equals("") == false) {
                        viewdata.append("Vinyl Name : " + data.getString(18) + "\n");
                    }
                    if (data.getString(19).equals("") == false) {
                        viewdata.append("Vinyl Style : " + data.getString(19) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(vinylPage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });

        resistant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor data = flrDB.vinylStyle("WaterResistant");
                StringBuffer viewdata = new StringBuffer();
                Toast.makeText(vinylPage.this,"Button has been clicked", Toast.LENGTH_SHORT).show();
                if(data.getCount()==0)
                {
                    Toast.makeText(vinylPage.this,"This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                while (data.moveToNext()) {
                    viewdata.append("Store Address : " + data.getString(1) + "\n");
                    viewdata.append("Floor Name : " + data.getString(3) + "\n");
                    viewdata.append("Floor Color : " + data.getString(4) + "\n");
                    viewdata.append("Floor Size : " + data.getString(5) + "\n");
                    viewdata.append("Floor Price: " + data.getString(6) + "\n");
                    viewdata.append("Floor Brand: " + data.getString(7) + "\n");
                    viewdata.append("Floor Type: " + data.getString(8) + "\n");
                    if (data.getString(18).equals("") == false) {
                        viewdata.append("Vinyl Name : " + data.getString(18) + "\n");
                    }
                    if (data.getString(19).equals("") == false) {
                        viewdata.append("Vinyl Style : " + data.getString(19) + "\n");
                    }
                }
                AlertDialog.Builder floorData = new AlertDialog.Builder(vinylPage.this);
                floorData.setCancelable(true);
                floorData.setTitle("Returned Results");
                floorData.setMessage(viewdata.toString());
                floorData.show();
            }
        });
    }
}