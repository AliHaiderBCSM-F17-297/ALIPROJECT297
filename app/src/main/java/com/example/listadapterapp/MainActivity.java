package com.example.listadapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView objListView;
    private String [] myData={"Lahore","Karachi","Islamabad","Multan","Peshawar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
        creatingAdapter();
    }

    private void creatingAdapter()
    {
        ArrayAdapter<String> objectArrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,myData);
        objListView.setAdapter(objectArrayAdapter);
        objListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int listPosition, long l) {

               // Toast.makeText(MainActivity.this,Integer.toString(listPosition)+"item clicked", Toast.LENGTH_SHORT).show();
                if(listPosition == 0) {
                    Intent intent = new Intent(MainActivity.this, lahore.class);
                    startActivity(intent);
                }
                else if(listPosition == 1)
                {
                    Intent intent = new Intent(MainActivity.this,karachi.class);
                    startActivity(intent);
                }
                else if(listPosition == 2)
                {
                    Intent intent = new Intent(MainActivity.this,isb.class);
                    startActivity(intent);
                }
                else if(listPosition == 3)
                {
                    Intent intent = new Intent(MainActivity.this,multan.class);
                    startActivity(intent);
                }
                else if(listPosition == 4)
                {
                    Intent intent = new Intent(MainActivity.this,peshawar.class);
                    startActivity(intent);
                }

            }
        });
    }
    private void initializeVariables()
    {
        objListView=findViewById(R.id.listView);
    }
}
