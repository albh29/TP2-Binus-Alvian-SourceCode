package com.example.catalogmakanan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    private ImageView detailImage;
    private TextView detailTitle;
    private TextView detailDescription;
    private TextView detailInfo;
    private Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Button btnBack = findViewById(R.id.btnBack);
        detailImage = findViewById(R.id.detailImage);
        detailTitle = findViewById(R.id.detailTitle);
        detailDescription = findViewById(R.id.detailDescription);
        detailInfo = findViewById(R.id.detailInfo);
        actionButton = findViewById(R.id.actionButton);

        Item item = (Item) getIntent().getSerializableExtra("item");

        detailImage.setImageResource(item.getImageResource());
        detailTitle.setText(item.getTitle());
        detailDescription.setText(item.getDescription());
        detailInfo.setText(item.getDetailInfo());

        actionButton.setOnClickListener(v -> {
            Toast.makeText(DetailActivity.this, "Item sudah masuk ke keranjang", Toast.LENGTH_SHORT).show();
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}

