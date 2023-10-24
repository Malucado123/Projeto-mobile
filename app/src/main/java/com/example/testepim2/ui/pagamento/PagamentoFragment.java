package com.example.testepim2.ui.pagamento;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testepim2.R;
import com.example.testepim2.databinding.FragmentPagamentoBinding;
import com.example.testepim2.databinding.FragmentPessoalBinding;


public class PagamentoFragment extends Fragment {

    private FragmentPagamentoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentPagamentoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }
}