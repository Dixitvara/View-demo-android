package com.example.viewpracticeandroid;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SearchViewPractical extends AppCompatActivity {

    ListView listView;
    SearchView searchView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view_practical);

        listView = findViewById(R.id.listView);
        searchView = findViewById(R.id.searchBox);

        list = new ArrayList<>();
        list.add("google");
        list.add("facebook");
        list.add("amazon");
        list.add("flipkart");
        list.add("Lenovo");
        list.add("HP");
        list.add("Dell");
        list.add("Logitech");
        list.add("Samsung");
        list.add("BenQ");
        list.add("Redmi");
        list.add("Xiaomi");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (list.contains(query))
                    adapter.getFilter().filter(query);
                else
                    Toast.makeText(getApplicationContext(), "no match found", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });

    }
}