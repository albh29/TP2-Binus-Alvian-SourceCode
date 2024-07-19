package com.example.catalogmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Item> itemList;
    private ListView listView;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        itemList = new ArrayList<>();
        // Add sample data
        itemList.add(new Item("Nasi Goreng", "Nasi Goreng dengan topping Bakso, Sosis dan Daging Ayam", R.drawable.nasi_goreng, "Rp 15.000"));
        itemList.add(new Item("Ayam geprek", "Ayam Geprek super pedas dengan berbagai pilihal level", R.drawable.ayam_geprek, "Rp 25.000"));
        itemList.add(new Item("Mie Ayam", "Mie Ayam dengan dengan kaldu yang nikmat", R.drawable.mie_ayam, "Rp 16.000"));
        itemList.add(new Item("Bakso", "Bakso dengan daging sapi yang kaya cita rasa", R.drawable.bakso, "Rp 12.000"));

        adapter = new ItemAdapter(this, itemList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("item", itemList.get(position));
                startActivity(intent);
            }
        });
    }
}

