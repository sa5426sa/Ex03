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

public class SecondActivity extends AppCompatActivity {

    LinearLayout layout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        layout2=findViewById(R.id.layout2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.colors,menu);
        menu.add("white");
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String st=item.getTitle().toString();
        if(st.equals("red")) layout2.setBackgroundColor(Color.RED);
        if(st.equals("green")) layout2.setBackgroundColor(Color.GREEN);
        if(st.equals("blue")) layout2.setBackgroundColor(Color.BLUE);
        if(st.equals("white")) layout2.setBackgroundColor(Color.WHITE);
        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}