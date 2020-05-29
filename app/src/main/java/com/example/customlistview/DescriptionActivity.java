package com.example.customlistview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title, description;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        imageView = findViewById(R.id.another_imageView);
        title = findViewById(R.id.titleText);
        description = findViewById(R.id.descriptionText);

        if (position == 0) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int image = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            imageView.setImageResource(image);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }

        if (position == 1) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int image = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            imageView.setImageResource(image);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }

        if (position == 2) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int image = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            imageView.setImageResource(image);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }

        if (position == 3) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int image = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            imageView.setImageResource(image);
            title.setText(aTitle);
            description.setText(aDescription);
            actionBar.setTitle(aTitle);
        }

        if (position == 4) {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int image = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");
            imageView.setImageResource(image);
            title.setText(aTitle);
            description.setText(aDescription);

            actionBar.setTitle(aTitle);
        }

    }

}
