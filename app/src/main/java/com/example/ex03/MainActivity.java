package com.example.ex03;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.colors,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st=item.getTitle().toString();
        if(st.equals("red")) layout.setBackgroundColor(Color.RED);
        if(st.equals("green")) layout.setBackgroundColor(Color.GREEN);
        if(st.equals("blue")) layout.setBackgroundColor(Color.BLUE);
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}