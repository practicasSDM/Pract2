package oo.doob.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class actividad3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad3);
    }


    private static final int OK_RESULT_CODE = 1;

    public void lanzarActivity(View v, String texto ) {
        /**texto = "paso por parametros";
         textView2.putExtra("parametros");

         String result = data.getStringExtra("result");

         TextView text = (TextView) findViewById(R.id.textView1);
         text.setText(R.string.cadena1);*/

        Intent intent = new Intent();
        intent.putExtra("result", "'Valor devuelto por ParametrosActivity'");
        setResult(OK_RESULT_CODE, intent);
        finish();
    }
}
