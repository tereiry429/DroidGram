package com.teamedge.android.droidgram;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    int numberOfLikes=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method displays the likes on the screen.
     */
    private void displayLikes(int number) {
        TextView likesTextView = (TextView) findViewById(R.id.likes_text_view);
        likesTextView.setText("Likes: " + number);
    }

    public void increase(View view) {
        numberOfLikes++;
        displayLikes(numberOfLikes * 1);
    }


    public void decrease(View view) {
        if(numberOfLikes <= 0) {
            return;
        }
        numberOfLikes--;
        displayLikes(numberOfLikes * 1);
    }
}
