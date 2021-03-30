package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radiogroup;
    private RadioButton radioButton;
    Button btnsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiogroup= findViewById(R.id.radio_group);
        btnsubmit=findViewById(R.id.submit);

         radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton=radioGroup.findViewById(i);
              //  Toast.makeText(MainActivity.this,""+radioButton.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void submitRadioButton(View view) {
        int selectedid=radiogroup.getCheckedRadioButtonId();
       /* if(selectedid==-1){
            Toast.makeText(MainActivity.this,"You have not selected anything",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,""+radioButton.getText(),Toast.LENGTH_SHORT).show();
        }*/

        switch (selectedid){
            case -1:
                Toast.makeText(MainActivity.this,"You have not selected anything",Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(MainActivity.this,"You Select HTML ",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this,HtmlActivity.class);
                startActivity(intent);
                break;
            case 2:
                Toast.makeText(MainActivity.this,"You have selected CSS",Toast.LENGTH_SHORT).show();
                break;
            case 5:
                Toast.makeText(MainActivity.this,"You have selected Android",Toast.LENGTH_SHORT).show();
                Intent intent1= new Intent(MainActivity.this,Android.class);
                startActivity(intent1);
                break;

        }
    }


}