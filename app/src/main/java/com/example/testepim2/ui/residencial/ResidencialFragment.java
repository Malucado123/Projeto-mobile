package com.example.testepim2.ui.residencial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.testepim2.databinding.FragmentResidencialBinding;

public class ResidencialFragment extends Fragment{

    private FragmentResidencialBinding binding;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentResidencialBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

}