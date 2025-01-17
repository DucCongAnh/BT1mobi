package com.example.baitap01;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        processRandomArrayList();

    }

    private void processRandomArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(100) + 1); // Số từ 1 đến 100
        }

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();


        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        Log.d("Activity2", "Mảng ngẫu nhiên: " + numbers.toString());
        Log.d("Activity2", "Số chẵn: " + evenNumbers.toString());
        Log.d("Activity2", "Số lẻ: " + oddNumbers.toString());
    }
}
