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
    private String [] myData={"Lahore","Karachi","Islamabad","Multan","Peshawar","Rawalpindi","Lahore","Karachi","Islamabad","Multan","Peshawar","Rawalpindi",
            "Lahore","Karachi","Islamabad","Multan","Peshawar","Rawalpindi"};
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
                Intent intent = new Intent(MainActivity.this,lahore.class);
                startActivity(intent);
            }
        });
    }
    private void initializeVariables()
    {
        objListView=findViewById(R.id.listView);
    }
}
