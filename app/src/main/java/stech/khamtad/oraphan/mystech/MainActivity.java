package stech.khamtad.oraphan.mystech;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Explicit
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View คือ การผูกตัวแปร กับ View ที่อยู่ ที่ Activity
        initialView();

                //Create Controller
        controller();



    }   //Main Method

    private void controller() {
        textView.setOnClickListener(MainActivity.this);
        button.setOnClickListener(MainActivity.this);
    }

    private void initialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView= (TextView) findViewById(R.id.txtRegister);
        button = (Button) findViewById(R.id.btnLogin);


    }

    @Override
    public void onClick(View v) {


        String tag = "SriwattanaV1";

        //For TextView
        if (v == textView) {
            Log.d(tag, "You Click TextView");
        }
        //For Button
        if (v == button) {
            Log.d(tag, "You Click Button");
        }
        }


     //onClick

} //Main Class นี่คือ คลาสหลัก
