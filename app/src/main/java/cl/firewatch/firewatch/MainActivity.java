package cl.firewatch.firewatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "x92", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "testupdate2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "updatea2", Toast.LENGTH_SHORT).show();
    }
}
