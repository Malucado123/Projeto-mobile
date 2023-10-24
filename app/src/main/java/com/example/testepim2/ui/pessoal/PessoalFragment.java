package com.example.testepim2.ui.pessoal;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.testepim2.TelaLogin;
import com.example.testepim2.TelaPrincipal;
import com.example.testepim2.databinding.FragmentPessoalBinding;
import com.example.testepim2.ui.residencial.ResidencialFragment;

public class PessoalFragment extends Fragment {
    private FragmentPessoalBinding binding;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPessoalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

}