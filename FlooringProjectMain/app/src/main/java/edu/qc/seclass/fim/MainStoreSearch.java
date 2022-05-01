package edu.qc.seclass.fim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class MainStoreSearch extends AppCompatActivity {

    EditText floorSearchText;
    Button searchButton;
    Button woodButton;
    Button tileButton;
    Button vinylButton;
    Button laminateButton;
    Button stoneButton;
    FlooringDB empDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_store_search);

        floorSearchText = (EditText) findViewById(R.id.floorSearchText);
        searchButton = (Button) findViewById(R.id.searchButton);
        woodButton = (Button) findViewById(R.id.woodButton);
        tileButton = (Button) findViewById(R.id.tileButton);
        vinylButton = (Button) findViewById(R.id.vinylButton);
        laminateButton = (Button) findViewById(R.id.laminateButton);
        stoneButton = (Button) findViewById(R.id.stoneButton);
        empDB = new FlooringDB(this);

        tileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTilePage();
            }
        });

        woodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWoodPage();
            }
        });

        vinylButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVinylPage();
            }
        });

        laminateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLaminatePage();
            }
        });

        stoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStonePage();
            }
        });




        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String floorSearchText1 = floorSearchText.getText().toString();
                Cursor data = empDB.search(floorSearchText1);

                if(data.getCount()==0)
                {
                    Toast.makeText(MainStoreSearch.this,"This has returned 0 results", Toast.LENGTH_SHORT).show();
                }
                else {
                    StringBuffer viewdata = new StringBuffer();
                    while(data.moveToNext()){
                        viewdata.append("Store Address : " + data.getString(1)+"\n");
                        viewdata.append("Floor Name : " + data.getString(3)+"\n");
                        viewdata.append("Floor Color : " + data.getString(4)+"\n");
                        viewdata.append("Floor Size : " + data.getString(5)+"\n");
                        viewdata.append("Floor Price: " + data.getString(6)+"\n");
                        viewdata.append("Floor Brand: " + data.getString(7)+"\n");
                        viewdata.append("Floor Type: " + data.getString(8)+"\n");
                        if(data.getString(9).equals("")==false)
                        {
                            viewdata.append("Tile Name: " + data.getString(9)+"\n");
                        }
                        if(data.getString(10).equals("")==false)
                        {
                            viewdata.append("Tile Style: " + data.getString(10)+"\n");
                        }
                        if(data.getString(11).equals("")==false)
                        {
                            viewdata.append("Stone Name: " + data.getString(11)+"\n");
                        }
                        if(data.getString(12).equals("")==false)
                        {
                            viewdata.append("Stone Style: " + data.getString(12)+"\n");
                        }
                        if(data.getString(13).equals("")==false)
                        {
                            viewdata.append("Wood Name: " + data.getString(13)+"\n");
                        }
                        if(data.getString(14).equals("")==false)
                        {
                            viewdata.append("Wood Style: " + data.getString(14)+"\n");
                        }
                        if(data.getString(15).equals("")==false)
                        {
                            viewdata.append("Wood Species: " + data.getString(15)+"\n");
                        }
                        if(data.getString(16).equals("")==false)
                        {
                            viewdata.append("Laminate Name : " + data.getString(16)+"\n");
                        }
                        if(data.getString(17).equals("")==false)
                        {
                            viewdata.append("Laminate Style : " + data.getString(17)+"\n");
                        }
                        if(data.getString(18).equals("")==false)
                        {
                            viewdata.append("Vinyl Name : " + data.getString(18)+"\n");
                        }
                        if(data.getString(19).equals("")==false)
                        {
                            viewdata.append("Vinyl Style : " + data.getString(19)+"\n");
                        }
                    }
                    AlertDialog.Builder floorData = new AlertDialog.Builder(MainStoreSearch.this);
                    floorData.setCancelable(true);
                    floorData.setTitle("Returned Results");
                    floorData.setMessage(viewdata.toString());
                    floorData.show();
                }

            }
        });

    }

    public void openWoodPage() {
        Intent intent = new Intent(this, woodPage.class);
        startActivity(intent);
    }

    public void openStonePage() {
        Intent intent = new Intent(this, stonePage.class);
        startActivity(intent);
    }

    public void openTilePage() {
        Intent intent = new Intent(this, tilePage.class);
        startActivity(intent);
    }

    public void openLaminatePage() {
        Intent intent = new Intent(this, laminatePage.class);
        startActivity(intent);
    }

    public void openVinylPage() {
        Intent intent = new Intent(this, vinylPage.class);
        startActivity(intent);
    }
}