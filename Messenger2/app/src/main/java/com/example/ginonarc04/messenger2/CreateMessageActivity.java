package com.example.ginonarc04.messenger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Call onSendMessage() when the button is clicked
    public void onSendMessage(View view){
        //creates a var of type Edittext containing the message in the textview of layout//
        EditText messageView = (EditText)findViewById(R.id.message);
        //converts the messageview into a string
        String messageText = messageView.getText().toString();
        /*replaced with action Intent
        //create an intent that sends to receiveMessageActivity to start
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //uses the putextra() to send with the intent
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);*/

        //create intent that uses the action send
        Intent intent = new Intent(Intent.ACTION_SEND);
        //sets the type of message is being sent
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        //gets the chooser title
        String chooserTitle = getString(R.string.chooser);
        //displays the chooser dialog
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);


        startActivity(chosenIntent);
    }
}
