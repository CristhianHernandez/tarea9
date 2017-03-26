package com.example.cristhian.tarea9;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
    AnimationDrawable animacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        animacion = (AnimationDrawable) getResources().getDrawable(
                R.drawable.animacion);
        ImageView vista = new ImageView(this);
        vista.setBackgroundColor(Color.WHITE);
        vista.setImageDrawable(animacion);
        vista.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                animacion.start();

            }
        });
        setContentView(vista);

    }
}


