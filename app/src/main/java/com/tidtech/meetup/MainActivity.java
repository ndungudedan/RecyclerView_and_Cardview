package com.tidtech.meetup;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit=findViewById(R.id.txt);
        final EditText ed=findViewById(R.id.editText);
        RecyclerView recyclerView=findViewById(R.id.rec);
        Button button=findViewById(R.id.btn);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        final ArrayList<noteItem> itemArrayList=new ArrayList<>();
        final RecyclerAdapter Adapter=new RecyclerAdapter(this,itemArrayList);
        recyclerView.setAdapter(Adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item=edit.getText().toString();
                String sub=ed.getText().toString();
                noteItem noteItem=new noteItem(item,sub);
                itemArrayList.add(noteItem);
                edit.getText().clear();
                ed.getText().clear();

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
