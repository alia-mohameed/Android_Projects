package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.flooringprojectmain.R;


public class MainActivity extends AppCompatActivity {

    private Button employeeButton;
    private Button customerButton;
    private Button registrationButton;
    public static EmployeeDB empDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set the employee information
        empDB = new EmployeeDB(this);
        setData();

        //Creating Buttons to go to the login page
        employeeButton = (Button) findViewById(R.id.employeeButton);
        customerButton = (Button) findViewById(R.id.customerLoginButton);
        registrationButton = (Button) findViewById(R.id.customerRegistrationButton);

        setData();


        //Going to the correct page once the button has been clicked
        employeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEmployeePage();
            }

        });

        customerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCustomerPage();
            }
        });

        registrationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCustomerRegistration();
            }
        });


    }

    public void openEmployeePage() {
        Intent intent = new Intent(this, employeeLoginPage.class);
        startActivity(intent);
    }

    public void openCustomerRegistration() {
        Intent intent2 = new Intent(this, customerRegistrationPage.class);
        startActivity(intent2);
    }

    public void openCustomerPage() {
        Intent intent3 = new Intent(this, customerLoginPage.class);
        startActivity(intent3);
    }

    public void setData() {
        empDB.insertData("bob","bob","bob","bob","bob");
    }
}