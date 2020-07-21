package com.example.customautocompleteexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<CountryItem> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fillCountryList();

        AutoCompleteTextView editText = findViewById(R.id.actv);
        AutoCompleteCountryAdapter adapter = new AutoCompleteCountryAdapter(this,countryList);
        editText.setAdapter(adapter);

    }

    private void fillCountryList(){
        countryList = new ArrayList<>();
        countryList.add(new CountryItem("Afganistan", R.mipmap.flaga_afganistan));
        countryList.add(new CountryItem("Albania", R.mipmap.flaga_albania));
        countryList.add(new CountryItem("Algeria", R.mipmap.flaga_algeria));
        countryList.add(new CountryItem("Andora", R.mipmap.flaga_andora));
        countryList.add(new CountryItem("Angola", R.mipmap.flaga_angola));
    }
}