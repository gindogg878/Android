package com.example.ginonarc04.multiple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSendMessage(View view) {
        Random rand = new Random();
        int n = rand.nextInt(101);
        EditText messageView = (EditText) findViewById(R.id.guess);
        String messageText = messageView.getText().toString();
        //Intent intent = new Intent(this, RecieveMessageActivity.class);
        //intent.putExtra(RecieveMessageActivity.EXTRA_MESSAGE, messageText);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        startActivity(intent);
    }
}
