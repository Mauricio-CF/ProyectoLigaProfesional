package Simulador;

import Torneo.Torneo;

public class Main {

    public static void main (String[] args) {

        Torneo torneo = new Torneo("Archivo.txt");
        torneo.iniciarTorneo();
}
}
