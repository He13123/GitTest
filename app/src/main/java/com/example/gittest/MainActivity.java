package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("aaaaa", "第一次更改: ");
        Toast.makeText(this,"第一次更改",Toast.LENGTH_SHORT).show();
    }
}
