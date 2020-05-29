package com.example.customlistview;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    ImageView imageView; //shows the picture corresponding to each build tier
    TextView title, description; //description of PC parts
    int item;

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

        if (item == 0) {
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

        if (item == 1) {
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

        if (item == 2) {
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

        if (item == 3) {
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

        if (item == 4) {
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
