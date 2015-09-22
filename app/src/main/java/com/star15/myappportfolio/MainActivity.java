package com.star15.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView title;
    Button spotify, scores, library, bib, xyz, capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        title = (TextView) findViewById(R.id.titleTV);
        spotify = (Button) findViewById(R.id.spotifyB);
        scores = (Button) findViewById(R.id.scoresB);
        library = (Button) findViewById(R.id.libraryB);
        bib = (Button) findViewById(R.id.bibAppB);
        xyz = (Button) findViewById(R.id.xyzB);
        capstone = (Button) findViewById(R.id.capstoneB);


    }

    public void spotifyApp(View view) {
        Toast.makeText(this, R.string.spotify_toast, Toast.LENGTH_LONG).show();
    }

    public void scoresApp(View view) {
        Toast.makeText(this, R.string.scores_toast, Toast.LENGTH_LONG).show();
    }

    public void libraryApp(View view) {
        Toast.makeText(this, R.string.library_toast, Toast.LENGTH_LONG).show();
    }

    public void bibApp(View view) {
        Toast.makeText(this, R.string.bib_toast, Toast.LENGTH_LONG).show();
    }

    public void xyzApp(View view) {
        Toast.makeText(this, R.string.xyz_toast, Toast.LENGTH_LONG).show();
    }

    public void capstoneApp(View view) {
        Toast.makeText(this, R.string.capstone_toast, Toast.LENGTH_LONG).show();
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

        return true;
    }
}
