package com.example.demo8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.example.demo8.BinarySearchExample.binarySearch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int last = arr.length - 1;
        binarySearch(arr, 0, last, key);
    }
}
