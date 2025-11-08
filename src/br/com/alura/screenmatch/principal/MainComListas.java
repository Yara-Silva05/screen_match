package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class MainComListas {
    public static void main(String[] args) {

        Filme primeiroFilme = new Filme("O pianista", 2002);
        primeiroFilme.avalia(6);
        primeiroFilme.avalia(8.5);
        primeiroFilme.avalia(9);

        Filme segundoFilme = new Filme("ELA", 2013);
        segundoFilme.avalia(9.8);
        segundoFilme.avalia(9);
        segundoFilme.avalia(7);

        Filme terceiroFilme = new Filme("Ta chovendo hamburguer", 2009);
        terceiroFilme.avalia(10);
        terceiroFilme.avalia(7.5);
        terceiroFilme.avalia(8);

        Serie theWalkingDead = new Serie("The walking dead",2009 );

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(primeiroFilme);
        listaDeTitulos.add(segundoFilme);
        listaDeTitulos.add(terceiroFilme);
        listaDeTitulos.add(theWalkingDead);
        System.out.println("Tamanho da lista: " + listaDeTitulos.size());
        System.out.println("");

        Collections.sort(listaDeTitulos);

        System.out.println(listaDeTitulos);
        
        for (Titulo item: listaDeTitulos) {
            System.out.println(item);

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}