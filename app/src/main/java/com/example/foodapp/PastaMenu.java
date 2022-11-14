package com.example.foodapp;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PastaMenu extends AppCompatActivity implements View.OnClickListener{
    FloatingActionButton fabPasta1;
    MaterialCardView cardPasta1;
    TextView tvInfoPasta1,precio;
    boolean flag =true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta_menu);

        fabPasta1 = findViewById(R.id.fab_pasta_1);
        cardPasta1 = findViewById(R.id.card_pasta_1);
        tvInfoPasta1 = findViewById(R.id.tv_info_pasta_1);
        fabPasta1.setOnClickListener(this);
        precio = findViewById(R.id.tv_precio_pasta_1);
        precio.setText("32,40");



    }
    public void init(){
        tvInfoPasta1.setVisibility(View.INVISIBLE);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab_pasta_1:
                if (flag==true){
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardPasta1.getLayoutParams();
                    layoutParams.height = 600;
                    cardPasta1.setLayoutParams(layoutParams);
                    tvInfoPasta1.setVisibility(View.VISIBLE);
                    tvInfoPasta1.setText(R.string.pasta1info);

                    flag = false;

                }else{
                    flag = true;
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardPasta1.getLayoutParams();
                    layoutParams.height = 300;
                    cardPasta1.setLayoutParams(layoutParams);
                    tvInfoPasta1.setVisibility(View.GONE);


                }
                break;
        }
    }
}