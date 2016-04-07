package com.example.tsd.kosarka1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.tsd.kosarka1.R;

public class MainActivity extends AppCompatActivity {
    int domaciRezultat=0;
    int gostiRezultat=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rezultatDomaci(0);
    }

    /**
     * metoda za tricu šalje rezultat metodi za rezultat domaćih
     */
    public void plusTriDomaci(View view) {
        domaciRezultat=domaciRezultat+3;
        rezultatDomaci(domaciRezultat);
    }
    /**
     * metoda za dva poena šalje rezultat metodi za rezultat domaćih
     */

    public void plusDvaDomaci(View view) {
        domaciRezultat=domaciRezultat+2;
        rezultatDomaci(domaciRezultat);
    }
    /**
     * metoda za slobodno bacanje šalje rezultat metodi za rezultat domaćih
     */
    public void slobodnoBacanjeDomaci(View view) {
        domaciRezultat=domaciRezultat+1;
        rezultatDomaci(domaciRezultat);
    }
    /**
     * prikazuje rezultat domaćih.
     */
    public void rezultatDomaci(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.domaci_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }



    /**
     * metoda za tricu šalje rezultat metodi za rezultat domaćih
     */
    public void plusTriGosti(View view) {
        gostiRezultat=gostiRezultat+3;
        rezultatGosti(gostiRezultat);
    }
    /**
     * metoda za dva poena šalje rezultat metodi za rezultat domaćih
     */

    public void plusDvaGosti(View view) {
        gostiRezultat=gostiRezultat+2;
        rezultatGosti(gostiRezultat);
    }
    /**
     * metoda za slobodno bacanje šalje rezultat metodi za rezultat domaćih
     */
    public void slobodnoBacanjeGosti(View view) {
        gostiRezultat=gostiRezultat+1;
        rezultatGosti(gostiRezultat);
    }
    /**
     * prikazuje rezultat domaćih.
     */

    public void reset(View view) {
        rezultatGosti(gostiRezultat=0);
        rezultatDomaci (domaciRezultat=0);
    }
    public void rezultatGosti(int rezultat) {
        TextView scoreView = (TextView) findViewById(R.id.gosti_rezultat);
        scoreView.setText(String.valueOf(rezultat));
    }


}