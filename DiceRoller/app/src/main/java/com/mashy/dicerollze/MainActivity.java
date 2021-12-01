package com.mashy.dicerollze;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.btn);
        TextView txtView1 = (TextView) findViewById(R.id.textView1);
        TextView txtView2 = (TextView) findViewById(R.id.textView2);
        EditText editText = (EditText) findViewById(R.id.editText);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int max_ = Integer.parseInt(editText.getText().toString());
                txtView1.setText(getRandomNumber(max_));
                txtView2.setText(getRandomNumber(max_));
            }

            private String getRandomNumber(int max) {
                //fonction permettant de génerer un nombre aléatoire
                return Integer.toString((int) Math.floor(Math.random()*(max)+1));//retourne un String pour l'attribuer à la fonction setText
            }
        });
    }
}