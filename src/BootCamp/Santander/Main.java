package BootCamp.Santander;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    private static double valor;
    private static Object parcelas;
    private static int hora;

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagens
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(  9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);

        //Emprestimos
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular( 1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular( 1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(  1000,  5);


    }
}
