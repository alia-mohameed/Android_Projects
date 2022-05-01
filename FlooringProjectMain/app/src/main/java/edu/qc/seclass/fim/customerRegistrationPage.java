package edu.qc.seclass.fim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.flooringprojectmain.R;

public class customerRegistrationPage extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText email;
    Button register;
    CustomerDB cusDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_registration_page);

        username = (EditText) findViewById(R.id.usernameText);
        password = (EditText) findViewById(R.id.passwordText);
        email = (EditText) findViewById(R.id.emailText);
        register = (Button) findViewById(R.id.registerButton);
        cusDB = new CustomerDB(this);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = username.getText().toString();
                String passWord = password.getText().toString();
                String eMail = email.getText().toString();

                if(userName.equals("")||passWord.equals("")||eMail.equals("")) {
                    Toast.makeText(customerRegistrationPage.this,"Please enter a UN, PW or email", Toast.LENGTH_SHORT).show();
                }
                else {
                    Boolean checkexists = cusDB.customerExists(userName);
                    if(checkexists==false) {
                        Boolean createCustomer = cusDB.insertData(userName, passWord, eMail, String.valueOf(CustomerDB.customerIDs));
                        if(createCustomer == true)
                        {
                            Toast.makeText(customerRegistrationPage.this,"You have created an account", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if(checkexists==true){
                        Toast.makeText(customerRegistrationPage.this,"This username has been taken", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


    }
}