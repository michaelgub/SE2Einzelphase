package com.example.michael.einzelbeispiel_palindorm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewOutputLabel;
    EditText editTextInputBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewOutputLabel = (TextView) findViewById(R.id.textViewOutputLabel);
        editTextInputBox = (EditText) findViewById(R.id.editTextInputBox);

    }

    public void buttonCheck_onClick(View v){
        String input = editTextInputBox.getText().toString().trim();
        if(input.equals("")){
            textViewOutputLabel.setText("Es sind keine Leerstrings erlaubt!");
        } else if(input.length()<5){
            textViewOutputLabel.setText("Der Input muss mindestens 5 Zeichen haben!");
        } else {
            textViewOutputLabel.setText(input.equals(new StringBuilder(input).reverse().toString()) ? input+" ist ein Palindrom!":input+" ist kein Palindrom!");
        }
    }


}
