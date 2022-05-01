package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class employeeLoginPage extends AppCompatActivity {

    EditText username;
    EditText password;
    Button login;
    EmployeeDB empDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_login_page);

        username = (EditText) findViewById(R.id.empUsername);
        password = (EditText) findViewById(R.id.empPassword);
        login = (Button) findViewById(R.id.empLogin);
        empDB = MainActivity.empDB;

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username1 = username.getText().toString();
                String password1 = password.getText().toString();


                if(username1.equals("")||password1.equals("")) {
                    Toast.makeText(employeeLoginPage.this,"Please enter a UN, PW", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean login = empDB.login(username1,password1);
                    if(login==true) {
                        Toast.makeText(employeeLoginPage.this,"You have logged in", Toast.LENGTH_SHORT).show();
                        openemployeeAdminPage();
                    }
                }
            }
        });
    }
    public void openemployeeAdminPage() {
        Intent intent3 = new Intent(this, employeeAdminPage.class);
        startActivity(intent3);
    }



}