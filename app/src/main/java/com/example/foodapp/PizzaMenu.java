package com.example.foodapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PizzaMenu extends AppCompatActivity implements View.OnClickListener{
    FloatingActionButton fabPizza1;
    MaterialCardView cardPizza1;
    TextView tvInfoPizza1,precio;
    boolean flag =true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_menu);

        fabPizza1 = findViewById(R.id.fab_pizza_1);
        cardPizza1 = findViewById(R.id.card_pizza_1);
        tvInfoPizza1 = findViewById(R.id.tv_info_pizza_1);
        fabPizza1.setOnClickListener(this);
        precio = findViewById(R.id.tv_precio_pizza_1);
        precio.setText("32,40");



    }
    public void init(){
        tvInfoPizza1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab_pizza_1:
                if (flag==true){
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardPizza1.getLayoutParams();
                    layoutParams.height = 600;
                    cardPizza1.setLayoutParams(layoutParams);
                    tvInfoPizza1.setVisibility(View.VISIBLE);
                    tvInfoPizza1.setText(R.string.pizza1info);

                    flag = false;

                }else{
                    flag = true;
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardPizza1.getLayoutParams();
                    layoutParams.height = 300;
                    cardPizza1.setLayoutParams(layoutParams);
                    tvInfoPizza1.setVisibility(View.GONE);


                }
                break;
        }
    }
}