package com.example.nahim.eva1_examen1_nahim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se agregan y se vinculan los componentes Spinner
        Spinner spinner_marca = (Spinner) findViewById(R.id.spinnerMarca);
        final Spinner spinner_modelos = (Spinner) findViewById(R.id.spinnerModelo);

        //  SE CREA Y SE LE ASIGNA EL ADAPTADOR PERSONALIZADO AL PRIMER SPINNER
        Adapter_Celulares adapter_celulares = new Adapter_Celulares(
                this,R.layout.item_adapter,Celulares.getMarca());
        adapter_celulares.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_marca.setAdapter(adapter_celulares);

        //AL PRIMER SPINNER SE LE ASIGNA UN EVENTO LISTENER, QUE ESTARA AL PENDIENTE DE CUAL ELEMENTO FUE EL
        // SELECCIONADO PARA ASI ESCOJER LOS DATOS QUE MOSTRARA EL SEGUNDO SPINNER
        spinner_marca.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getIphone()));
                        break;
                    case 1:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getMotorolas()));
                        break;
                    case 2:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getSamsung()));
                        break;
                    case 3:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getHuawei()));
                        break;
                    case 4:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getLG()));
                        break;
                    case 5:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getAlcatel()));
                        break;
                    case 6:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getSony()));
                        break;
                    case 7:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getHTC()));
                        break;
                    case 8:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getBlackBerry()));
                        break;
                    case 9:
                        spinner_modelos.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Celulares.getNokia()));
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
