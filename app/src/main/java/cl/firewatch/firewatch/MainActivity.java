package cl.firewatch.firewatch;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView lv_dispositivos;
    Button bt_sincronizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_dispositivos = findViewById(R.id.lv_dispositivos);
        bt_sincronizar = findViewById(R.id.bt_sincronizar);

        //1   //1 //1   //y
        //2   ///////2 //y
         // X5 //kz    //yy
        //X6  //kz   //y
        //----------------------
        String[] dispositivos = {                             //cambiar a arralist de dispositivos !!!!!!!
                "Dispositivo1",
                "Dispositivo2",
                "Dispositivo2",
                "Dispositivo2",
                "Dispositivo2",
                "Dispositivo6",
                "Dispositivo3",
                "Dispositivo4"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dispositivos);
        lv_dispositivos.setAdapter(adapter);

    }

    public void Sicronizar(View view) {//Cambiar a HOME
        AlertSincronizar();
        //Intent intent = new Intent(this, HomeActivity.class);
        //startActivity(intent);
    }

    private void AlertSincronizar(){

        final CharSequence[] opciones={"Aceptar","Cancelar"};
        final AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setTitle("Sincronizando con el Dispositivo");
        alert.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alert.show();
    }


}
