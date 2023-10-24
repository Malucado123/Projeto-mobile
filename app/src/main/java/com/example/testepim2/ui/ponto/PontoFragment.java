package com.example.testepim2.ui.ponto;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.testepim2.databinding.FragmentPontoBinding;

public class PontoFragment extends Fragment {

    private FragmentPontoBinding binding;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPontoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}