package com.basit.pdfadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.basit.pdfadmin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




        binding.btn9th.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String  text = binding.btn9th.getText().toString();
                Intent intent = new Intent(MainActivity.this,SubjectActivity.class);
                intent.putExtra("9th" , text);
//                Toast.makeText(MainActivity.this, ""+text, Toast.LENGTH_SHORT).show();

                startActivity(intent);

            }
        });
    }
}