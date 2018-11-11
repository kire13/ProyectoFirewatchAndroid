package cl.firewatch.firewatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv_dispositivos;
    Button bt_sincronizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv_dispositivos = findViewById(R.id.lv_dispositivos);
        bt_sincronizar = findViewById(R.id.bt_sincronizar);

        //1   //1
        //2   ///////2
        // X5
        //X6
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
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
