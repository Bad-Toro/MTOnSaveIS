package com.mobileappscompany.training.onsaveis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tV ;
    EditText eT;

    String theVal;
    Contact c = new Contact("Fernando");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV = ((TextView) findViewById(R.id.textView));
        eT = ((EditText) findViewById(R.id.editText));

        if(savedInstanceState != null){
            c = (Contact) savedInstanceState.getParcelable("K");
        }

    }

    public void onC(View view) {
       //theVal = eT.getText().toString();
        c.setName(eT.getText().toString());
    }

    public void onLoadFV(View view) {
        //tV.setText(theVal);
        tV.setText(c.getName());
    }

    @Override
    protected void onSaveInstanceState(Bundle b) {
        super.onSaveInstanceState(b);

        b.putParcelable("K" , c);
    }
}
