package stech.khamtad.oraphan.mystech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    //Explicit
    private EditText nameEditText, surEditText, addEditText, userEditText, passwordEditText;
    private Button button;
    private String nameString, surnameString, addressString,
    userString, passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initialView();

        controller();

    }//Main Method

    private void controller() {
      button.setOnClickListener(RegisterActivity.this);
    }

    private void initialView() {
        nameEditText = (EditText) findViewById(R.id.edtName);
        surEditText = (EditText) findViewById(R.id.edtSur);
        addEditText = (EditText) findViewById(R.id.edtAdd);
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        button = (Button) findViewById(R.id.btnSave);

    }

    @Override
    public void onClick(View v) {

        if (v == button) {

            //Get Value From EditText
            nameString = nameEditText.getText().toString().trim();
            surnameString = surEditText.getText().toString().trim();
            addressString = addEditText.getText().toString().trim();
            userString = userEditText.getText().toString().trim();
            passwordString = passwordEditText.getText().toString().trim();


            //Check Space


            if (nameString.equals("") || surnameString.equals("") ||
                    addressString.equals("") || userString.equals("")||
                    passwordString.equals("")) {

                //Have Space
                MyAlert myAlert = new MyAlert(RegisterActivity.this);
                myAlert.myDialog("Have Space", "Please Fill All Blank");

            } else {

                //No Space

            }

        }


    }//OnClick

}//Main Class
