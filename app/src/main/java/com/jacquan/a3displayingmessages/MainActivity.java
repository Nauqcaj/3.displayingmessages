package com.jacquan.a3displayingmessages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void submitName (View view) {

        EditText myTextField = (EditText) findViewById(R.id.textField);
        //Log.i("TextField Value", myTextField.getText().toString());
        //Toast.makeText(getApplicationContext(), "Hello " + myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        String userName = myTextField.getText().toString();
        Toast.makeText(getApplicationContext(), "Hello " + userName, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
