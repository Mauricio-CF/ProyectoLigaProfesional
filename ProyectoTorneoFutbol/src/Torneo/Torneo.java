package Torneo;

import Excepciones.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Torneo {
    List<Equipo> equipos;
    String archivo;
    String etapaActual;
    int etapa;

    public Torneo(String archivo) {
        equipos = new ArrayList<>();
        this.archivo = archivo;
    }

    // Inicia el torneo permitiendo seleccionar la etapa inicial
    public void iniciarTorneo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la etapa requerida:");
        System.out.println("1. Octavos de final:");
        System.out.println("2. Cuartos de final:");
        System.out.println("3. Semifinal:");
        System.out.println("4. Final:\n");
        try {
            etapa = Integer.parseInt(scanner.nextLine());
            switch (etapa) {
                case 1:
                    crearEquipos(16);
                    break;
                case 2:
                    crearEquipos(8);
                    break;
                case 3:
                    crearEquipos(4);
                    break;
                case 4:
                    crearEquipos(2);
                    break;
                default:
                    throw new EtapaInvalidaException();
            }
            jugarEtapa(equipos.size());
        }catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar solo valores enteros.");
        } catch (EtapaInvalidaException e) {
            System.out.println("Error: Etapa inválida.");
        } catch (EquipoVacioException e) {
            System.out.println("Error: No puede haber equipos sin nombre.");
        } catch (EquipoRepetidoException e) {
            System.out.println("Error: No puede haber equipos repetidos.");
        }
    }

    // Creación de equipos
    private void crearEquipos(int numEquipos) throws EquipoVacioException, EquipoRepetidoException {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numEquipos; i++) {
            System.out.print("Ingrese el nombre del equipo " + (i + 1) + ": ");
            String nombre = scanner.nextLine().trim();
            if (nombre.isEmpty()){
                throw new EquipoVacioException();
            }
            if (equipos.stream().anyMatch(e -> e.nombre.equals(nombre))){
                throw new EquipoRepetidoException();
            }
            equipos.add(new Equipo(nombre));
        }
    }

    private void jugarEtapa(int numEquipos) {
        List<Equipo> clasificados = new ArrayList<>();
        while (equipos.size() > 1) {
            clasificados = new ArrayList<>();
            switch (numEquipos) {
                case 16:
                    etapaActual = "Octavos de Final";
                    break;
                case 8:
                    etapaActual = "Cuartos de Final";
                    break;
                case 4:
                    etapaActual = "Semifinal";
                    break;
                case 2:
                    etapaActual = "Final";
                    break;
            }
            
            // Mezcla el orden de los equipos ingresados
            Collections.shuffle(equipos);
            
            //Generación de partidos utilizando recursividad            
            System.out.println("\nEtapa: " + etapaActual);
            for (int i = 0; i < equipos.size(); i += 2) {
                Partido partido = new Partido(equipos.get(i), equipos.get(i + 1));
                Equipo ganador = partido.simularPartido();
                clasificados.add(ganador);
                escribirEnArchivo("Fin del Torneo" + "\n¡El campeón es: " + ganador.nombre + "!");
            }
            equipos = clasificados;
            numEquipos = numEquipos / 2;
        }
        System.out.println("\n¡El campeón es: " + equipos.get(0).nombre + "!");
    }

    // Almacena la información en archivo de texto 
    private void escribirEnArchivo(String archivo) {
        try (FileWriter writer = new FileWriter("archivo.txt")) {
            writer.write(archivo + "\n");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }
}
