package com.example.facedetection10.Helpers;

import android.graphics.Rect;

public class BoxWithLabel {
    public Rect rect;
    public String label;
    public BoxWithLabel(Rect rect,String label) {
        this.rect = rect;
    }
}
