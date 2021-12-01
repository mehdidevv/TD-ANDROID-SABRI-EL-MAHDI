package com.mashy.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle(getLocalClassName());

        EditText login_input = (EditText) findViewById(R.id.login);
        Button login_btn = (Button) findViewById(R.id.btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewsListApplication app = (NewsListApplication) getApplicationContext();
                app.setLogin(login_input.getText().toString());
                Intent intent = new Intent(LoginActivity.this, NewsActivity.class);
                startActivity(intent);

                finish(); //terminer l'activité.
            }
        });
    }
}