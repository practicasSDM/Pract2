package oo.doob.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;



public class MainActivity extends Activity {

    Button boton_intents;
    Button boton_parameters;
    Button boton_credits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        boton_intents = (Button) findViewById(R.id.intents_button);

        boton_parameters = (Button) findViewById(R.id.parameters_button);

        boton_credits = (Button) findViewById(R.id.credits_button);

    }

    public void intents (View v)
    {

        /** El boton uno cambiara su etiqueta sin importar que boton se le de click*/

        boton_intents.setText("Opening phone dialer...");

        Intent intents = (new Intent(this, actividad2.class));

        startActivity(intents);


    }

    public void parameters (View v)
    {


        boton_parameters.setText("Opening parameters...");

        Intent intents = (new Intent(this, actividad3.class));

        startActivity(intents);



    }

    public void credits (View v)
    {


        boton_credits.setText("Opening credits...");

        Intent intents = (new Intent(this, actividad4.class));

        startActivity(intents);




    }
}



















































/**
public class MainActivity extends AppCompatActivity implements onClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodoIntents
    public void onClick (View v){
        //Button intents_button = (Button) findViewById(R.id.intents_button);
        if(v.getId()==R.id.intents_button){
            ((TextView)v).setText("Evento onClick controlado del boton intents");
        }

    }

    public void metodoParameters(View v){

        if(v.getId()==R.id.parameters_button){
            ((TextView)v).setText("Evento onClick controlado del boton parameters");
        }

    }

    }
}
*/