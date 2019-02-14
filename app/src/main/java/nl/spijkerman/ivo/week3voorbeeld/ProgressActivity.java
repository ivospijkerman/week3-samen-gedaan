package nl.spijkerman.ivo.week3voorbeeld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProgressActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        Bundle extras = getIntent().getExtras();
        int progressValue = extras.getInt(getString(R.string.EXTRA_PROGRESS));

        TextView progress = findViewById(R.id.textViewProgress);
        progress.setText(String.valueOf(progressValue));
    }
}
