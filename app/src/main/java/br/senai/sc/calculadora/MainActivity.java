package br.senai.sc.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.tv_display);
    }
    public void onClickBotao1(View v) {
        atualizarDisplay("1");
    }

    public void onClickBotao2(View v) {
        atualizarDisplay("2");
    }

    public void onClickBotao3(View v) {
        atualizarDisplay("3");
    }

    public void onClickBotao4(View v) {
        atualizarDisplay("4");
    }

    public void onClickBotao5(View v) {
        atualizarDisplay("5");
    }

    public void onClickBotao6(View v) {
        atualizarDisplay("6");
    }

    public void onClickBotao7(View v) {
        atualizarDisplay("7");
    }

    public void onClickBotao8(View v) {
        atualizarDisplay("8");
    }

    public void onClickBotao9(View v) {
        atualizarDisplay("9");
    }

    public void onClickBotao0(View v) {
        atualizarDisplay("0");
    }

    public void onClickAdicao(View v) {
    atualizarDisplay("+");
    }

    private void atualizarDisplay(String texto) {
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }
}
