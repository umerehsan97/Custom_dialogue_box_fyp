package com.example.customdialogueboxfyp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final Context context = this;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonShowCustomDialog);

        // add button listener
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.custom);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button

                ImageView image = (ImageView) dialog.findViewById(R.id.imageView);
                ImageView image1 = (ImageView) dialog.findViewById(R.id.imageView2);
                ImageView image2 = (ImageView) dialog.findViewById(R.id.imageView3);
                ImageView image3 = (ImageView) dialog.findViewById(R.id.imageView4);

                image.setImageResource(R.drawable.bee);

                image1.setImageResource(R.drawable.cinema);
                image2.setImageResource(R.drawable.food);
                image3.setImageResource(R.drawable.mall);

                Button dialogButton = (Button) dialog.findViewById(R.id.button);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}
