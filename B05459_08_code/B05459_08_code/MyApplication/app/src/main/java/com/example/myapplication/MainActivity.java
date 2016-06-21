package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            System.out.println("savedInstanceState = " + savedInstanceState);
        }

        // Alternative way to onAcceptClick method
        //Button b_accept = (Button) findViewById(R.id.button_accept);
        //b_accept.setOnClickListener(this);
    }

    /**
     * Method executed when the user clicks on the Accept button.
     * Change the greeting message to include the name introduced by the user in the editText box.
     *
     * @param v View the user clicked
     */
    public void onAcceptClick(View v) {
        TextView tvGreeting = (TextView) findViewById(R.id.textView_greeting);
        EditText etName = (EditText) findViewById(R.id.editText_name);

        if (etName.getText() != null && 0 < etName.getText().length()) {
            Log.i("MainActivity", "Name read: " + etName.getText());
            tvGreeting.setText("Hello " + etName.getText());
        }
        else {
            Log.w("MainActivity", "No name typed, greeting didn't change");
        }
    }

    @Override
    public void onClick(View view) {
        // Action when the button is pressed
    }

}
