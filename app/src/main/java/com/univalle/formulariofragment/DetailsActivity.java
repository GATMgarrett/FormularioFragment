package com.univalle.formulariofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.univalle.formulariofragment.Fragments.DetailsFragment;

public class DetailsActivity extends AppCompatActivity {

    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        if(getIntent().getExtras() != null){
            text = getIntent().getStringExtra("text");
        }

        FragmentManager manager = getSupportFragmentManager();
        DetailsFragment detailsFragment = (DetailsFragment) manager.findFragmentById(R.id.detailFragment);
        detailsFragment.RenderText(text);
    }
}
