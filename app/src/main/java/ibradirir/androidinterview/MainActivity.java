package ibradirir.androidinterview;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

class MainActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void simpleQuestions(View view){
        Intent intent = new Intent(this, Simplequestions.class);
    }
    public void toughQuestions(View view){
        Intent intent = new Intent(this, Toughquestions.class);
    }
    public void seeOtherApps(View view){
        Intent intent = new Intent(this, Toughquestions.class);
    }




}
