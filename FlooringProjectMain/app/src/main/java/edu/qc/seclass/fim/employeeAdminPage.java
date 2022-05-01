package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class employeeAdminPage extends AppCompatActivity {

    EditText StoreIDText;
    EditText StoreAddressText;
    EditText FloorIDText;
    EditText FloorNameText;
    EditText FloorColorText;
    EditText FloorSizeText;
    EditText FloorPriceText;
    EditText FloorBrandText;
    EditText FloorTypeText;
    EditText TileNameText;
    EditText TileStyleText;
    EditText StoneNameText;
    EditText StoneStyleText;
    EditText WoodNameText;
    EditText WoodStyleText;
    EditText WoodSpeciesText;
    EditText LaminateNameText;
    EditText LaminateStyleText;
    EditText VinylNameText;
    EditText VinylStyleText;

    Button add;
    Button update;
    Button delete;

    public static FlooringDB flrDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_admin_page);

        flrDB = new FlooringDB(this);

        add = (Button) findViewById(R.id.addButton);
        update = (Button) findViewById(R.id.updateButton);
        delete = (Button) findViewById(R.id.deleteButton);

        StoreIDText = (EditText) findViewById(R.id.StoreIDText);
        StoreAddressText = (EditText) findViewById(R.id.StoreAddressText);
        FloorIDText = (EditText) findViewById(R.id.FloorIDText);
        FloorNameText = (EditText) findViewById(R.id.FloorNameText);
        FloorColorText = (EditText) findViewById(R.id.FloorColorText);
        FloorSizeText = (EditText) findViewById(R.id.FloorSizeText);
        FloorPriceText = (EditText) findViewById(R.id.FloorPriceText);
        FloorBrandText= (EditText) findViewById(R.id.FloorBrandText);
        FloorTypeText = (EditText) findViewById(R.id.FloorTypeText);
        TileNameText = (EditText) findViewById(R.id.TileNameText);
        TileStyleText = (EditText) findViewById(R.id.TileStyleText);
        StoneNameText = (EditText) findViewById(R.id.StoneNameText);
        StoneStyleText = (EditText) findViewById(R.id.StoneStyleText);
        WoodNameText = (EditText) findViewById(R.id.WoodNameText);
        WoodStyleText = (EditText) findViewById(R.id.WoodStyleText);
        WoodSpeciesText = (EditText) findViewById(R.id.WoodSpeciesText);
        LaminateNameText = (EditText) findViewById(R.id.LaminateNameText);
        LaminateStyleText = (EditText) findViewById(R.id.LaminateStyleText);
        VinylNameText = (EditText) findViewById(R.id.VinylNameText);
        VinylStyleText = (EditText) findViewById(R.id.VinylStyleText);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String StoreIDText1 = StoreIDText.getText().toString();
                String StoreAddressText1 = StoreAddressText.getText().toString();
                String FloorIDText1 = FloorIDText.getText().toString();
                String FloorNameText1 = FloorNameText.getText().toString();
                String FloorColorText1 = FloorColorText.getText().toString();
                String FloorSizeText1 = FloorSizeText.getText().toString();
                String FloorPriceText1 = FloorPriceText.getText().toString();
                String FloorBrandText1 = FloorBrandText.getText().toString();
                String FloorTypeText1 = FloorTypeText.getText().toString();
                String TileNameText1 = TileNameText.getText().toString();
                String TileStyleText1 = TileStyleText.getText().toString();
                String StoneNameText1 = StoneNameText.getText().toString();
                String StoneStyleText1 = StoneStyleText.getText().toString();
                String WoodNameText1 = WoodNameText.getText().toString();
                String WoodStyleText1 = WoodStyleText.getText().toString();
                String WoodSpeciesText1 = WoodSpeciesText.getText().toString();
                String LaminateNameText1 = LaminateNameText.getText().toString();
                String LaminateStyleText1 = LaminateStyleText.getText().toString();
                String VinylNameText1 = VinylNameText.getText().toString();
                String VinylStyleText1 = VinylStyleText.getText().toString();

                Boolean insert = flrDB.insertData(StoreIDText1, StoreAddressText1, FloorIDText1, FloorNameText1, FloorColorText1, FloorSizeText1, FloorPriceText1, FloorBrandText1, FloorTypeText1, TileNameText1, TileStyleText1, StoneNameText1, StoneStyleText1, WoodNameText1, WoodStyleText1, WoodSpeciesText1, LaminateNameText1, LaminateStyleText1, VinylNameText1, VinylStyleText1);
                if(insert==true) {
                    Toast.makeText(employeeAdminPage.this, "You have added data", Toast.LENGTH_SHORT).show();
                }
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String StoreIDText1 = StoreIDText.getText().toString();
                String StoreAddressText1 = StoreAddressText.getText().toString();
                String FloorIDText1 = FloorIDText.getText().toString();
                String FloorNameText1 = FloorNameText.getText().toString();
                String FloorColorText1 = FloorColorText.getText().toString();
                String FloorSizeText1 = FloorSizeText.getText().toString();
                String FloorPriceText1 = FloorPriceText.getText().toString();
                String FloorBrandText1 = FloorBrandText.getText().toString();
                String FloorTypeText1 = FloorTypeText.getText().toString();
                String TileNameText1 = TileNameText.getText().toString();
                String TileStyleText1 = TileStyleText.getText().toString();
                String StoneNameText1 = StoneNameText.getText().toString();
                String StoneStyleText1 = StoneStyleText.getText().toString();
                String WoodNameText1 = WoodNameText.getText().toString();
                String WoodStyleText1 = WoodStyleText.getText().toString();
                String WoodSpeciesText1 = WoodSpeciesText.getText().toString();
                String LaminateNameText1 = LaminateNameText.getText().toString();
                String LaminateStyleText1 = LaminateStyleText.getText().toString();
                String VinylNameText1 = VinylNameText.getText().toString();
                String VinylStyleText1 = VinylStyleText.getText().toString();
                Boolean update = flrDB.updateData(StoreIDText1, StoreAddressText1, FloorIDText1, FloorNameText1, FloorColorText1, FloorSizeText1, FloorPriceText1, FloorBrandText1, FloorTypeText1, TileNameText1, TileStyleText1, StoneNameText1, StoneStyleText1, WoodNameText1, WoodStyleText1, WoodSpeciesText1, LaminateNameText1, LaminateStyleText1, VinylNameText1, VinylStyleText1);
                if (update == true) {
                    Toast.makeText(employeeAdminPage.this, "You have updated data", Toast.LENGTH_SHORT).show();
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FloorIDText1 = FloorIDText.getText().toString();
                Boolean delete = flrDB.deleteData(FloorIDText1);
                if(delete == true)
                {
                    Toast.makeText(employeeAdminPage.this, "You have deleted data", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}