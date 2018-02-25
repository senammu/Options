package com.example.sentha.options;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
               }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.newuser:
                Intent intent=new Intent(MainActivity.this, Addnewuser.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.manage:
                Intent intent=new Intent(MainActivity.this, Manageusers.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.setrules:
                Intent intent=new Intent(MainActivity.this, Setrules.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.worktime:
                Intent intent=new Intent(MainActivity.this, SetworkTiming.class);
                startActivity(intent);
        }
        switch (item.getItemId()){
            case R.id.optout:
                Intent intent=new Intent(MainActivity.this, Optout.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
