package com.jaygietl.android.myappportfolio;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    private void showAppNameToastMessage( String appName )
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch my " + appName + " app!";

        Toast.makeText(context, text, duration).show();
    }

    private void getLaunchToast( String appName )
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Launching my " + appName + " app!";

        Toast.makeText(context, text, duration).show();
    }

    public void spotifyMessage(View view) {

        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.jaygietl.android.spotifystreamer");
        startActivity(launchIntent);

        getLaunchToast("spotify streamer");

    }

    public void scoresMessage(View view) {

        showAppNameToastMessage("scores");

    }

    public void libraryMessage(View view) {

        showAppNameToastMessage("library");

    }

    public void buildMessage(View view) {

        showAppNameToastMessage("built it bigger");

    }

    public void xyzMessage(View view) {

        showAppNameToastMessage("xyz reader");

    }

    public void capstoneMessage(View view) {

        showAppNameToastMessage("capstone");

    }
}
