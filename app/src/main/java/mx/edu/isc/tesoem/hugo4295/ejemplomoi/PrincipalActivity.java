package mx.edu.isc.tesoem.hugo4295.ejemplomoi;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    TextView lblnombre, lbledad, lblcorreo;
    Button btnlanza;

    ActivityResultLauncher<Intent> resultActiviti = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {
            if (result.getResultCode() == RESULT_OK){

                DatosParce datosParce = result.getData().getParcelableExtra("datosparce");
                lblnombre.setText(datosParce.getNombre());
                lbledad.setText(datosParce.getEdad());
                lblcorreo.setText(datosParce.getCorreo());
            }
        }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lblnombre = findViewById(R.id.lblnombre);
        lbledad = findViewById(R.id.lbledad);
        lblcorreo = findViewById(R.id.lblcorreo);
        btnlanza = findViewById(R.id.btnlanza);

        btnlanza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanza = new Intent(PrincipalActivity.this, CapturaActivity.class);
                resultActiviti.launch(lanza);
            }
        });
    }
}