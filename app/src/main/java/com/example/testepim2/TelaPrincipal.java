package com.example.testepim2;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.testepim2.ui.residencial.ResidencialFragment;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.view.menu.MenuView;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.testepim2.databinding.ActivityTelaPrincipalBinding;

public class TelaPrincipal extends AppCompatActivity {
    private EditText edit_data;

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityTelaPrincipalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTelaPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarTelaPrincipal.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_pessoal, R.id.nav_residencial, R.id.nav_trabalhista, R.id.nav_bancario, R.id.nav_pagamento, R.id.nav_ponto, R.id.nav_historico)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_tela_principal);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tela_principal, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_tela_principal);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public class CriaBanco extends SQLiteOpenHelper {
        private static final String NOME_BANCO = "cadastro.db";
        private static final String TABELA = "funcionario";
        private static final String ID = "_id";
        private static final String NOME = "Nome Completo";
        private static final String DATANASCIMENTO = "Data de Nascimento";
        private static final String NASCIONALIDADE = "Nascionalidade";
        private static final String CPF = "CPF";
        private static final String RG = "RG";
        private static final String PIS = "PIS";
        private static final String CARTEIRATRABALHO = "Carteira de Trabalho";
        private static final String EMAIL = "E-Mail";
        private static final String TELEFONE = "Telefone";
        private static final String CEP = "CEP";
        private static final String CIDADE = "Cidade";
        private static final String ESTADO = "Estado";
        private static final String BAIRRO = "Bairro";
        private static final String NRESIDENCIA = "Numero da Residencia";
        private static final String COMPLEMENTORESIDENCIA = "Complemento da residencia";
        private static final String LOGRADOURO = "Logradouro";
        private static final String BANCONOME = "Nome do banco";
        private static final String CODBANCO = "Codigo do banco";
        private static final String CONTABANCARIA = "Conta Bancaria";
        private static final String AGENCIA = "Agencia";
        private static final String TIPOCONTA = "Tipo de Conta";
        private static final String IMPOSTO = "Imposto";
        private static final String FGTS = "FGTS";
        private static final String INSS = "INSS";
        private static final String CARGAH = "Carga Horaria";
        private static final String DATAADMISSAO = "Data de Admissao";
        private static final String IDDEPARTAMENTO = "ID do Departamento";
        private static final String CARGO = "Cargo";
        private static final String SALARIO = "Salario";
        private static final String VT = "Valor VT";
        private static final String VR = "Valor VR";
        private static final String VA = "Valor VA";
        private static final int VERSAO = 1;

        public CriaBanco(Context context){
            super(context, NOME_BANCO,null,VERSAO);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            String sql = "CREATE TABLE"+TABELA+"("+ID+" integer primary key autoincrement,"+NOME+
                    " text,"+DATANASCIMENTO+
                    " text,"+NASCIONALIDADE+
                    " text,"+CPF+
                    " text,"+RG+
                    " text,"+PIS+
                    " text,"+CARTEIRATRABALHO+
                    " text,"+EMAIL+
                    " text,"+TELEFONE+
                    " text,"+CEP+
                    " text,"+CIDADE+
                    " text,"+ESTADO+
                    " text,"+BAIRRO+
                    " text,"+NRESIDENCIA+
                    " text,"+COMPLEMENTORESIDENCIA+
                    " text,"+LOGRADOURO+
                    " text,"+BANCONOME+
                    " text,"+CODBANCO+
                    " text,"+CONTABANCARIA+
                    " text,"+AGENCIA+
                    " text,"+TIPOCONTA+
                    " text,"+IMPOSTO+
                    " text,"+FGTS+
                    " text,"+INSS+
                    " text,"+CARGAH+
                    " text,"+DATAADMISSAO+
                    " text,"+IDDEPARTAMENTO+
                    " text,"+CARGO+
                    " text,"+SALARIO+
                    " text,"+VT+
                    " text,"+VA+
                    " text,"+VR+")";
                            db.execSQL(sql);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS" + TABELA);
            onCreate(db);
        }
    }

    public class BancoController {

        private SQLiteDatabase db;
        private CriaBanco banco;

        public BancoController(Context context){
            banco = new CriaBanco(context);
        }

        public String insereDado(String Nome, String Nascimento, String Nascionalidade, String CPF, String RG, String PIS, String Carteira,
                                 String Email, String Telefone, String CEP, String Cidade, String Estado, String Bairro, String Residencia,
                                 String Complemento, String Logradouro, String NomeBanco, String CodBanco, String ContaBancaria, String Agencia,
                                 String TipoConta, String Imposto, String FGTS, String INSS, String CargaH, String DataAdmissao, String IDdepartamento,
                                 String Cargo, String Salario, String VT, String VA, String VR){

            ContentValues valores;
            long resultado;

            db = banco.getWritableDatabase();
            valores = new ContentValues();
            valores.put(CriaBanco.NOME, Nome);
            valores.put(CriaBanco.DATANASCIMENTO, Nascimento);
            valores.put(CriaBanco.NASCIONALIDADE, Nascionalidade);
            valores.put(CriaBanco.CPF, CPF);
            valores.put(CriaBanco.RG, RG);
            valores.put(CriaBanco.PIS, PIS);
            valores.put(CriaBanco.CARTEIRATRABALHO, Carteira);
            valores.put(CriaBanco.EMAIL, Email);
            valores.put(CriaBanco.TELEFONE, Telefone);
            valores.put(CriaBanco.CEP, CEP);
            valores.put(CriaBanco.CIDADE, Cidade);
            valores.put(CriaBanco.ESTADO, Estado);
            valores.put(CriaBanco.BAIRRO, Bairro);
            valores.put(CriaBanco.NRESIDENCIA, Residencia);
            valores.put(CriaBanco.COMPLEMENTORESIDENCIA, Complemento);
            valores.put(CriaBanco.LOGRADOURO, Logradouro);
            valores.put(CriaBanco.BANCONOME, NomeBanco);
            valores.put(CriaBanco.CODBANCO, CodBanco);
            valores.put(CriaBanco.CONTABANCARIA, ContaBancaria);
            valores.put(CriaBanco.AGENCIA, Agencia);
            valores.put(CriaBanco.TIPOCONTA, TipoConta);
            valores.put(CriaBanco.IMPOSTO, Imposto);
            valores.put(CriaBanco.FGTS, FGTS);
            valores.put(CriaBanco.INSS, INSS);
            valores.put(CriaBanco.CARGAH, CargaH);
            valores.put(CriaBanco.DATAADMISSAO, DataAdmissao);
            valores.put(CriaBanco.IDDEPARTAMENTO, IDdepartamento);
            valores.put(CriaBanco.CARGO, Cargo);
            valores.put(CriaBanco.SALARIO, Salario);
            valores.put(CriaBanco.VT, VT);
            valores.put(CriaBanco.VA, VA);
            valores.put(CriaBanco.VR, VR);


            resultado = db.insert(CriaBanco.TABELA, null, valores);
            db.close();

            if (resultado ==-1)
                return "Erro ao inserir registro";
            else
                return "Registro Inserido com sucesso";

        }
    }

}