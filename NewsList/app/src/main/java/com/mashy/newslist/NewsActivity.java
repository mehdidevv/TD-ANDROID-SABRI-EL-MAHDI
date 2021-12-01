package com.mashy.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        setTitle(getLocalClassName());
        Button btnDetails = (Button) findViewById(R.id.details_btn);
        Button btnLogout = (Button) findViewById(R.id.logout_btn);

        TextView txtView = (TextView) findViewById(R.id.txtView);

        NewsListApplication app = (NewsListApplication) getApplicationContext();
        txtView.setText(app.getLogin());
        btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewsActivity.this, DetailsActivity.class);
                startActivity(intent);
            }
        });
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewsActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}