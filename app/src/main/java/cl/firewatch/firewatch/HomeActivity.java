package cl.firewatch.firewatch;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

public class HomeActivity extends AppCompatActivity {
    //pantalla MAIN de 3 botones
    FragmentManager fManager = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
//        String NombreActividad = this.getClass().getSimpleName();
        String DispSeleccionado = "";

        getSupportActionBar().setTitle("Dispositivo :" + "#" + DispSeleccionado);
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
//// titulo

//        getSupportActionBar().setTitle("Whatever title");


    }

//  seleccionado

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Intent Qintnto = new Intent(this, HomeActivity.class);

        String NombreActividad = this.getClass().getSimpleName();

        if (NombreActividad.equalsIgnoreCase("HomeActivity")) {
        } else {
            startActivity(Qintnto);
        }
        return super.onOptionsItemSelected(item);

    }
    //


}
