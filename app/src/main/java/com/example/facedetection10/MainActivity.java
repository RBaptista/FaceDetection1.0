package com.example.facedetection10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.FaceDetector;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.facedetection10.Helpers.ImageHelperActivity;
import com.example.facedetection10.funcoes.FaceDetectionActivity;
import com.example.facedetection10.funcoes.ImageClassificationActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onGoToImageClassification(View view){
        Intent intent = new Intent(this, ImageClassificationActivity.class);
        startActivity(intent);
    }

    public void onGoToFaceDetector(View view){
        Intent intent = new Intent(this, FaceDetectionActivity.class);
        startActivity(intent);
    }

}