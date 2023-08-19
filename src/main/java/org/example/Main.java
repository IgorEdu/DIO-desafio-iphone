package org.example;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.setModelo("iPhone");
        iPhone.setAnoFabricacao(2007);
        iPhone.setNumeroSerie("asin124t23");
        iPhone.setTamanhoTela(5.4);

        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
