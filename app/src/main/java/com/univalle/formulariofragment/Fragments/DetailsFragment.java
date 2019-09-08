package com.univalle.formulariofragment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.univalle.formulariofragment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {


    private TextView txtDeatils;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);
        txtDeatils = (TextView) view.findViewById(R.id.textViewDetails);
        // Inflate the layout for this fragment

        return view;
    }
    public void RenderText (String text){
        txtDeatils.setText(text);
    }

}
