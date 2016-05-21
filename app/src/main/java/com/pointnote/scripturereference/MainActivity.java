package com.pointnote.scripturereference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.pointnote.scripturereference.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareScripture(View view) {
        Intent intent = new Intent(this, ShareActivity.class);
        EditText bookEditText = (EditText) findViewById(R.id.bookField);
        EditText chapterEditText = (EditText) findViewById(R.id.chapterField);
        EditText verseEditText = (EditText) findViewById(R.id.verseField);

        //Build a message for the next activity
        String message = "You favorite scripture is: ";
        message += bookEditText.getText().toString() + " ";
        message += chapterEditText.getText().toString() + ":";
        message += verseEditText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
