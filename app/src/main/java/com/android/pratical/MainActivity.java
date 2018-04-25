package com.android.pratical;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText myUsername;
    private EditText myEmail;
    private EditText myAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myUsername=findViewById(R.id.username);
        myEmail=findViewById(R.id.email);
        myAbout=findViewById(R.id.about);


    }

    /* Profile icon click*/
    public void goToDetailsActivity(View view){
        Intent intent = new Intent(getApplicationContext(), DetailsActivity.class);
        intent.putExtra("myusername",myUsername.getText().toString());
        intent.putExtra("myemail",myEmail.getText().toString());
        intent.putExtra("myabout",myAbout.getText().toString());
        startActivity(intent);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // Save UI state changes to the savedInstanceState.
        // This bundle will be passed to onCreate if the process is
        // killed and restarted.

        savedInstanceState.putString("myusername", myUsername.getText().toString());
        savedInstanceState.putString("myemail", myEmail.getText().toString());
        savedInstanceState.putString("myabout", myAbout.getText().toString());

        // etc.

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.

        String myusername = savedInstanceState.getString("myusername");
        String myemail = savedInstanceState.getString("myemail");
        String myabout = savedInstanceState.getString("myabout");
    }

}

