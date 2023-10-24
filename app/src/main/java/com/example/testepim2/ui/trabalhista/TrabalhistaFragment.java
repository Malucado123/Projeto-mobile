package com.example.testepim2.ui.trabalhista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.testepim2.databinding.FragmentPessoalBinding;
import com.example.testepim2.databinding.FragmentTrabalhistaBinding;

public class TrabalhistaFragment extends Fragment {

    private FragmentTrabalhistaBinding binding;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentTrabalhistaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

}