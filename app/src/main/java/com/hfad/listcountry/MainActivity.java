package com.hfad.listcountry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CountryModel> countries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


            // начальная инициализация списка
            setInitialData();
            RecyclerView recyclerView = findViewById(R.id.list);
            // создаем адаптер
            CountryAdapter adapter = new CountryAdapter(this, countries);
            // устанавливаем для списка адаптер
            recyclerView.setAdapter(adapter);
        }
        private void setInitialData(){

            countries.add(new CountryModel ("USA", "Washington", R.drawable.us));
            countries.add(new CountryModel ("South Korea", "Seul", R.drawable.kr));
            countries.add(new CountryModel ("Canada", "Ottawa", R.drawable.ca));
            countries.add(new CountryModel ("Germany", "Berlin", R.drawable.de));
            countries.add(new CountryModel ("Italy", "Rome", R.drawable.ie));
            countries.add(new CountryModel ("Japan", "Tokio", R.drawable.jp));
            countries.add(new CountryModel ("United Kingdom", "London", R.drawable.gb_logo));
            countries.add(new CountryModel ("France", "Paris", R.drawable.fr));
            countries.add(new CountryModel ("Kyrgyzstan", "Bishkek", R.drawable.kg));
        }

    }
