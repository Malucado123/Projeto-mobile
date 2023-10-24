package com.example.testepim2.ui.bancario;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testepim2.R;
import com.example.testepim2.databinding.FragmentDadosBancariosBinding;

public class DadosBancariosFragment extends Fragment {

    private FragmentDadosBancariosBinding biding;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        biding = FragmentDadosBancariosBinding.inflate(inflater, container, false);
        View root = biding.getRoot();
        return root;
    }


}