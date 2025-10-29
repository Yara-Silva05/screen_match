package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class MainComListas {
    public static void main(String[] args) {

        Filme primeiroFilme = new Filme("O pianista", 2002);
        Filme segundoFilme = new Filme("ELA", 2013);
        Filme terceiroFilme = new Filme("Ta chovendo hamburguer", 2009);
        Serie theWalkingDead = new Serie("The walking dead",2009 );

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(primeiroFilme);
        listaDeTitulos.add(segundoFilme);
        listaDeTitulos.add(terceiroFilme);
        listaDeTitulos.add(theWalkingDead);
        System.out.println("Tamanho da lista: " + listaDeTitulos.size());

        for (Titulo item: listaDeTitulos) {
            System.out.println(item);
        }
    }
}