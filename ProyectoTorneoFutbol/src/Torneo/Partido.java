package Torneo;

import java.util.Random;

public class Partido {
    // Variables de tipo Equipo
    Equipo local;
    Equipo visitante;
    int golesLocal;
    int golesVisitante;


    // Constructor
    public Partido(Equipo local, Equipo visitante) {
        this.local = local;
        this.visitante = visitante;
    }

    // Genera goles entre 1 y 4 de manera aleatoria
    public int goles() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

    // Simula el partido entre local y visitante y muestra un ganador
    public Equipo simularPartido() {
         golesLocal = goles();
         golesVisitante = goles();

        // Partidos con empate vuelve a generar los goles para el local y visitante y obtener un ganador
        while (golesLocal == golesVisitante) {
            golesLocal = goles();
            golesVisitante = goles();
        }
        System.out.print(local.nombre +"     "+ golesLocal + "   VS   " + golesVisitante +"     "+ visitante.nombre);
        if(golesLocal > golesVisitante) {
            System.out.println("       El ganador es: " + local.nombre);
            return local;
        }else {
            System.out.println("       El ganador es: " + visitante.nombre);
            return visitante;
        }
    }
}