package iPhone;

import navegador.NavegadorInternet;

import musicas.ReprodutorMusica;

import telefone.Telefone;

public class iPhone implements ReprodutorMusica, Telefone, NavegadorInternet {


    public void ligar() {
        System.out.println("LIGANDO VIA IPHONE");    
    }

    public void atender() {
        System.out.println("ATENDENDO VIA IPHONE");
    }

    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ VIA IPHONE");
    }

    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA VIA IPHONE");
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA VIA IPHONE");
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA VIA IPHONE");
    }

    public void tocar() {
        System.out.println("TOCANDO PAGINA VIA IPHONE");
    }

    public void pausar() {
        System.out.println("PAUSANDO VIA IPHONE");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA VIA IPHONE");
    }
}