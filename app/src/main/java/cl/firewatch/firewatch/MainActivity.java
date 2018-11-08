package cl.firewatch.firewatch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv_dispositivos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_dispositivos=findViewById(R.id.lv_dispositivos);
        String[] dispositivos={                             //cambiar a arralist de dispositivos
                "Dispositivo1",
                "Dispositivo2",
                "Dispositivo2",
                "Dispositivo2",
                "Dispositivo2",
                "Dispositivo2",
                "Dispositivo2",
                "Dispositivo3"};

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dispositivos);
        lv_dispositivos.setAdapter(adapter);

    }
}
