package com.example.jeancarlos.jogodamemoria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.jeancarlos.radiobuttonandcheckbox.R;


public class MenuActivity extends ActionBarActivity implements View.OnClickListener {

    private Button btn16;
    private Button btn20;
    private Button btn24;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        inicializarComponents();
        adicionarOuvintes();

    }

    public void inicializarComponents() {
        btn16 = (Button) findViewById(R.id.btn16);
        btn20 = (Button) findViewById(R.id.btn20);
        btn24 = (Button) findViewById(R.id.btn24);
    }


    public void adicionarOuvintes() {
        btn16.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn24.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn16:
                intent.setClass(this, Activity_16.class);
                startActivity(intent);
                break;
            case R.id.btn20:
                intent.setClass(this, Activity_20.class);
                startActivity(intent);
                break;
            case R.id.btn24:
                intent.setClass(this, Activity_24.class);
                startActivity(intent);
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
