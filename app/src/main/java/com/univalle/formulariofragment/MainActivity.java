package com.univalle.formulariofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

import com.univalle.formulariofragment.Fragments.DetailsFragment;

public class MainActivity extends FragmentActivity implements DataListener {

    private boolean isMultiPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Evalua para saver si esta en post o land
        setMultipanel();
    }

    @Override
    public void SendData(String text) {

        if(isMultiPanel){
            //Lllamar al metodo rederizar texto del dtails fragment pasando el texto que recibimos por parametro e este mismo metodo
            FragmentManager manager = getSupportFragmentManager();
            DetailsFragment detailsFragment = (DetailsFragment) manager.findFragmentById(R.id.detailFragment);
            //Mandar la informacion......
            detailsFragment.RenderText(text);
        }else{
            Intent i = new Intent(this, DetailsActivity.class);
            i.putExtra("text", text);
            startActivity(i);
        }

    }
    private void setMultipanel(){
        isMultiPanel = (getSupportFragmentManager().findFragmentById(R.id.detailFragment) != null);
    }
}
