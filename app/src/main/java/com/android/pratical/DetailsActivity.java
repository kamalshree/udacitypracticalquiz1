package com.android.pratical;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private Toolbar mytoolbar;
    private String username,email,about;
    private TextView myUsername;
    private TextView myEmail;
    private TextView myAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mytoolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.my_toolbar);
        mytoolbar.setNavigationIcon(R.drawable.ic_left);

        username = getIntent().getStringExtra("myusername");
        email = getIntent().getStringExtra("myemail");
        about = getIntent().getStringExtra("myabout");

        myUsername=findViewById(R.id.username);
        myEmail=findViewById(R.id.email);
        myAbout=findViewById(R.id.about);

        myUsername.setText(username);
        myEmail.setText(email);
        myAbout.setText(about);

        setSupportActionBar(mytoolbar);
        mytoolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
