package com.dentgeek.dentgeek;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.dentgeek.dentgeek.view.ContainerActivity;
import com.dentgeek.dentgeek.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        siguiente = (Button) findViewById(R.id.login);
        siguiente.setOnClickListener((new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent siguiente = new Intent(LoginActivity.this, ContainerActivity.class);
                startActivity(siguiente);
            }
        }

        ));
    }

    public void goCreateAccount(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void opengoogle(View logo) throws Exception {
        String link ="http://www.google.com";
                Intent intent = null;
                intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
                startActivity(intent);
            }
}
