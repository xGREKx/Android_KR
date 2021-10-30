package com.example.overwork;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    ProgressBar progress;
    TextView res;
    String text;
    double per;
    ImageView Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        res = findViewById(R.id.result);
        Image = findViewById(R.id.smile);
        progress = findViewById(R.id.progressBar);
        Bundle arguments = getIntent().getExtras();
        text = arguments.get("result").toString();
        per = (double) arguments.get("percent");
        progress.setProgress((int) (per*100));
        switch (text){
            case "good":
                res.setText(R.string.cool);
                Image.setImageResource(R.drawable.good);
                //Image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.good));
                break;
            case "normal":
                res.setText(R.string.normal);
                Image.setImageResource(R.drawable.okey);
                //Image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.okey));
                break;
            case "bad":
                res.setText(R.string.bad);
                Image.setImageResource(R.drawable.bad);
                //Image.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.bad));
                break;
        }

    }
}
