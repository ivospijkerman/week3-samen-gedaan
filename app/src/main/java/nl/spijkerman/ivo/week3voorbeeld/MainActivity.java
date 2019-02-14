package nl.spijkerman.ivo.week3voorbeeld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMe = findViewById(R.id.buttonClickMe);
        Button dontClickMe = findViewById(R.id.buttonDontClickMe);
        SeekBar progressBar = findViewById(R.id.seekBarProgress);

        clickMe.setOnClickListener(v -> {
            Log.i("grep", "Yay");

            Intent i = new Intent(getApplicationContext(), ProgressActivity.class);

            int progressValue = progressBar.getProgress();
            i.putExtra(getString(R.string.EXTRA_PROGRESS), progressValue);

            startActivity(i);
                });

        dontClickMe.setOnClickListener(v -> Log.i("grep", "Boo"));

        progressBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               Log.i("grep", String.valueOf(progress));
           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {
                Log.i("grep", "Start touch");
           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {
                Log.i("grep", "Stop touch");
           }
       }

        );
    }
}

