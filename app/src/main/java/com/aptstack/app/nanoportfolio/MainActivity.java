package com.aptstack.app.nanoportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setClickEventHandlers();
    }

    private void setClickEventHandlers() {
        final String TOAST_MSG= "This button will launch my ";
        Button btnSpotify = (Button) findViewById(R.id.btnSpotify);
        btnSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), TOAST_MSG+"Spotify app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnScores = (Button) findViewById(R.id.btnScores);
        btnScores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), TOAST_MSG+"Scores app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnLibrary = (Button) findViewById(R.id.btnLibrary);
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), TOAST_MSG+"Library app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnBuildBigger = (Button) findViewById(R.id.btnBuildBigger);
        btnBuildBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), TOAST_MSG+"Big app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnXYZreader = (Button) findViewById(R.id.btnXYZreader);
        btnXYZreader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), TOAST_MSG+"Reader app!", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), TOAST_MSG+"Best ever app!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
