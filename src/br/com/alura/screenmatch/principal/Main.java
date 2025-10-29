package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme primeiroFilme = new Filme("O pianista", 2002);
        primeiroFilme.setDuracaoEmMinutos(150);
        primeiroFilme.exibeFichaTecnica();
        System.out.println("Duração do filme em minutos: " + primeiroFilme.getDuracaoEmMinutos());
        primeiroFilme.avalia(6);
        primeiroFilme.avalia(8.5);
        primeiroFilme.avalia(9);
        System.out.println("Total de avaliações: " + primeiroFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + primeiroFilme.mediaFormatada());
        System.out.println("");

        Filme segundoFilme = new Filme("ELA", 2013);
        segundoFilme.setDuracaoEmMinutos(126);
        segundoFilme.exibeFichaTecnica();
        System.out.println("Duração do filme em minutos: " + segundoFilme.getDuracaoEmMinutos());
        segundoFilme.avalia(9.8);
        segundoFilme.avalia(9);
        segundoFilme.avalia(7);
        System.out.println("Total de avaliações: " + segundoFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + segundoFilme.mediaFormatada());
        System.out.println("");

        Filme terceiroFilme = new Filme("Ta chovendo hamburguer", 2009);
        terceiroFilme.setDuracaoEmMinutos(90);
        terceiroFilme.exibeFichaTecnica();
        System.out.println("Duração do filme em minutos: " + terceiroFilme.getDuracaoEmMinutos());
        terceiroFilme.avalia(10);
        terceiroFilme.avalia(7.5);
        terceiroFilme.avalia(8);
        System.out.println("Total de avaliações: " + terceiroFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + terceiroFilme.mediaFormatada());
        System.out.println("");

        Serie theWalkingDead = new Serie("The walking dead",2009 );
        theWalkingDead.setTemporadas(11);
        theWalkingDead.setEpisodioPorTemporada(16);
        theWalkingDead.setMinutosPorEpisodio(50);
        theWalkingDead.exibeFichaTecnica();
        System.out.println("Duração para maratonar The walking dead: " + theWalkingDead.getDuracaoEmMinutos());
        System.out.println("");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(primeiroFilme);
        calculadora.inclui(segundoFilme);
        calculadora.inclui(terceiroFilme);
        calculadora.inclui(theWalkingDead);
        System.out.println("O total em minutos para maratonar todos os titulos é de : " + calculadora.getTempoTotal());
        System.out.println("");

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(primeiroFilme);
        listaDeTitulos.add(segundoFilme);
        listaDeTitulos.add(terceiroFilme);
        listaDeTitulos.add(theWalkingDead);
        System.out.println("Tamanho da lista: " + listaDeTitulos.size());

    }
}