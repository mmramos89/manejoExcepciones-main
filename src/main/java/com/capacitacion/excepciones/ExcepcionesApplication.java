package com.capacitacion.excepciones;


import com.capacitacion.excepciones.procesos.ProcesarDatos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ExcepcionesApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ExcepcionesApplication.class, args);


        caso1();
        //caso2();
        //caso3();
        // caso4();
        //caso5();


    }


    public static void caso1() {
        ProcesarDatos datosDivision = new ProcesarDatos();
        System.out.println("el resultado es: " + datosDivision.division("48", "0"));
        System.out.println("el resuldato es: " + datosDivision.division("15.8", "30"));

        // cree una instancia de la clase ProcesarDatos y use el metodo division.
        //envie   los valores ("48", "0") - division por cero
        //en el metodo division capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola  desde  el catch StackTrace,Cause,Message;
        // haga lo mismo para los valores ("15.8", "30")

    }

    public static void caso2() {
        String lista[] = {"30", "10", "30"};
        ProcesarDatos ConArreglo = new ProcesarDatos();
        ConArreglo.arreglo(lista);

        System.out.println("el resultado es: " + ConArreglo.division(lista[0], lista[1]));

        //cree una instancia de la clase ProcesarDatos y use el metodo division. y use metodo arreglo
        //envie al metodo arry de string  de 3 valores para que se genere una excepcion.
        //capture e identifique la excepcion que se genera (no la excepcion general de java Exception) e imprima en consola   StackTrace,Cause,Message del error;

    }

    public static void caso3() {
        ProcesarDatos procesarFecha = new ProcesarDatos();
        procesarFecha.fecha("2020/09/09");
        //// cree una instancia de la clase ProcesarDatos y use el metodo fecha.
        //envie al metodo una fecha con el formato "yyyy/mm/dd".
        //capture e identifique la excepcion que se genera (no la excepcion general de java Exception)
        // Re-lance la excepcion y capturela aqui en el metodo case3 e imprima en consola StackTrace,Cause,Message del error;


    }

    public static void caso4() throws IOException {
        ProcesarDatos deprofecionales = new ProcesarDatos();
        deprofecionales.leerArchivo();


    }

    public static void caso5() throws IOException {
        ProcesarDatos escribirDatos = new ProcesarDatos();
        escribirDatos.leerArchivo();
        escribirDatos.escribirArchivo();


    }

}
