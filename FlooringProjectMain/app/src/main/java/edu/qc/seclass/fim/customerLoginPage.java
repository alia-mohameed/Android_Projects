package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class customerLoginPage extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;
    CustomerDB cusDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login_page);

        username = (EditText) findViewById(R.id.username1Text);
        password = (EditText) findViewById(R.id.password1Text);
        login = (Button) findViewById(R.id.loginButton);
        cusDB = new CustomerDB(this);

        String userName = username.getText().toString();
        String passWord = password.getText().toString();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = username.getText().toString();
                String passWord = password.getText().toString();


                if(userName.equals("")||passWord.equals("")) {
                    Toast.makeText(customerLoginPage.this,"Please enter a UN, PW", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean login = cusDB.login(userName,passWord);
                    if(login==true) {
                        Toast.makeText(customerLoginPage.this,"You have logged in", Toast.LENGTH_SHORT).show();
                        openMainStorePage();
                    }
                }
            }
        });
    }
    public void openMainStorePage() {
        Intent intent3 = new Intent(this, MainStoreSearch.class);
        startActivity(intent3);
    }


}