package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton fabPizza;
    FloatingActionButton fabSalads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabPizza = findViewById(R.id.fab_pizza);
        fabPizza.setOnClickListener(this);
        fabSalads = findViewById(R.id.fab_salads);
        fabSalads.setOnClickListener(this);
    }

    public void screenMenuPizza() {
        Intent menuPizza = new Intent(this, PizzaMenu.class);
        startActivity(menuPizza);

    }

    public void screenMenuSalads() {
        Intent menuSalads = new Intent(this, SaladsMenu.class);
        startActivity(menuSalads);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.fab_pizza:
                screenMenuPizza();
                break;
            case R.id.fab_salads:
                screenMenuSalads();
                break;

        }
    }
}