package com.example.testepim2.ui.historico;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.testepim2.databinding.FragmentHistoricoBinding;


public class HistoricoFragment extends Fragment {

    private FragmentHistoricoBinding binding;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentHistoricoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}