package cl.firewatch.firewatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    //pantalla MAIN de 3 botones
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Monitorizar(View view) {
        Intent intent = new Intent(this, SwipeActivity.class);
        startActivity(intent);
    }

    //genera menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home_main, menu);
        return super.onCreateOptionsMenu(menu);


    }

//  seleccionado

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent Qintnto = new Intent(this, HomeActivity.class);
        startActivity(Qintnto);
        return super.onOptionsItemSelected(item);

    }
}
