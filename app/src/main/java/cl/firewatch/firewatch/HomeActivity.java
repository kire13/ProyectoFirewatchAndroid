package cl.firewatch.firewatch;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

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

        String nombre = this.getClass().getSimpleName();

        Toast.makeText(this, "nombre es:" + nombre, Toast.LENGTH_SHORT).show();
        if (nombre.equalsIgnoreCase("HomeActivity")) {
        } else {
            startActivity(Qintnto);
        }
//        MEtodo1();
        return super.onOptionsItemSelected(item);

    }


//    public void MEtodo1() {
//        Activity ACtividad = new Activity();
//        ACtividad.getParent();
//
//        if(ACtividad  MainActivity.class){
//            Toast.makeText(ACtividad, "ZK:" + ACtividad.toString(), Toast.LENGTH_SHORT).show();
//
//        }
//
//    }

}
