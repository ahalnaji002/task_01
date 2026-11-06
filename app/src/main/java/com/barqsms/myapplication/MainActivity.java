package com.barqsms.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

// شاشة قائمة رئيسية للتنقل بين التطبيقات الخمسة بسهولة
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_birthday).setOnClickListener(v -> open(BirthdayCardActivity.class));
        findViewById(R.id.btn_task_done).setOnClickListener(v -> open(TaskDoneActivity.class));
        findViewById(R.id.btn_quadrant).setOnClickListener(v -> open(QuadrantActivity.class));
        findViewById(R.id.btn_article).setOnClickListener(v -> open(ArticleActivity.class));
        findViewById(R.id.btn_business_card).setOnClickListener(v -> open(BusinessCardActivity.class));
    }

    private void open(Class<?> activity) {
        startActivity(new Intent(this, activity));
    }
}
