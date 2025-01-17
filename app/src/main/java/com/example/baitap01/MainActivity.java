package com.example.baitap01;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircleImageView studentImage = findViewById(R.id.studentImage);
        TextView studentName = findViewById(R.id.studentName);
        TextView studentClass = findViewById(R.id.studentClass);
        EditText inputText = findViewById(R.id.inputText);
        TextView outputText = findViewById(R.id.outputText);
        Button reverseButton = findViewById(R.id.reverseButton);

        studentImage.setImageResource(R.drawable.image);
        studentName.setText("Nguyễn Đức Công Anh");
        studentClass.setText("MSSV: 22110281");

        reverseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputText.getText().toString();
                if (input.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Vui lòng nhập chuỗi!", Toast.LENGTH_SHORT).show();
                } else {
                    // Đảo vị trí các từ trong chuỗi
                    String reversed = reverseWords(input);
                    outputText.setText(reversed);
                    Toast.makeText(MainActivity.this, reversed, Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Xử lý mảng ArrayList số nguyên
        processArrayList();
    }

    private String reverseWords(String input) {
        // Tách chuỗi thành mảng các từ
        String[] words = input.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        // Duyệt ngược từ cuối mảng về đầu
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    private void processArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        Log.d("Even Numbers", evenNumbers.toString());
        Log.d("Odd Numbers", oddNumbers.toString());
    }
}
