package com.basit.pdfadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.basit.pdfadmin.databinding.ActivitySubjectBinding;

public class SubjectActivity extends AppCompatActivity {

    private ActivitySubjectBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivitySubjectBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        String name = getIntent().getStringExtra("9th");

        binding.btnChemisrty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String subject = binding.btnChemisrty.getText().toString();
                Intent intent = new Intent(SubjectActivity.this,UploadActivity.class);

                intent.putExtra("sub" , subject);
                intent.putExtra("class" , name);

                startActivity(intent);
            }
        });
    }
}