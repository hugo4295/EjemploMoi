package mx.edu.isc.tesoem.hugo4295.ejemplomoi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CapturaActivity extends AppCompatActivity {

    EditText txtnombre, txtedad, txtcorreo;
    Button btnregresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_captura);

        btnregresa = findViewById(R.id.btnregresa);
        txtnombre = findViewById(R.id.txtnombre);
        txtedad = findViewById(R.id.txtedad);
        txtcorreo = findViewById(R.id.txtcorreo);
        btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                DatosParce datosParce = new DatosParce(txtnombre.getText().toString(), txtedad.getText().toString(), txtcorreo.getText().toString());
                Intent parametros = new Intent();
                parametros.putExtra("datosparce", datosParce);
                setResult(RESULT_OK,parametros);
                finish();
            }
        });


    }
}