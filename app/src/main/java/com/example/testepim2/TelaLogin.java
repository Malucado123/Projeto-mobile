package com.example.testepim2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class TelaLogin extends AppCompatActivity {
    private EditText txt_Usuario, txt_Senha;
    private Button bt_Entrar;
    String[] mensagens = {"Contate um Administrador","Usuário ou Senha Inválidos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IniciarComponentes();

    }

    private void IniciarComponentes(){
        txt_Usuario = findViewById(R.id.caixaTextoUsuario);
        txt_Senha = findViewById(R.id.caixaTextoSenha);
    }


    public void UsuarioLogado(View view) {
        String nome = txt_Usuario.getText().toString();
        String senha = txt_Senha.getText().toString();

        if(nome.equals("ADMIN") && senha.equals("12345")) {
            Intent in = new Intent(TelaLogin.this, TelaPrincipal.class);
            startActivity(in);
        }
        else{
            Snackbar snackbar = Snackbar.make(view,mensagens[1],Snackbar.LENGTH_SHORT);
            snackbar.setBackgroundTint(Color.WHITE);
            snackbar.setTextColor(Color.BLACK);
            snackbar.show();
        }
    }

    public void EsqueceuSenhaPopup(View v){
        Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
        snackbar.setBackgroundTint(Color.WHITE);
        snackbar.setTextColor(Color.BLACK);
        snackbar.show();
    }
}