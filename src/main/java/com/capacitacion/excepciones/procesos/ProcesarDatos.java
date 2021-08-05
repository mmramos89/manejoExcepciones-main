package com.capacitacion.excepciones.procesos;

import com.capacitacion.excepciones.TipoExcepciones;

import javax.swing.*;
import java.io.*;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProcesarDatos {
	
	public int division(String numero1,String numero2) {
		int resultado = 0;

		try {
			resultado = Integer.valueOf(numero1) / Integer.valueOf(numero2);

		} catch (ArithmeticException e) {
			System.out.println("no se puede dividir por cero");

		}
		catch (NumberFormatException e){

			System.out.println("No se pudo convertir la cadena a entero");
		}
		return resultado;
	}

	public void arreglo(String[] lista) {
		try {

			for (int i = 0; i <= 5; i++) {
				System.out.println(lista[i]);
			}
		}

			catch(ArrayIndexOutOfBoundsException e ) {

						System.out.println(" el tamanio de la lista es menor");
					}


		}



	
	public void fecha(String input) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date   date  = format.parse(input );
			date.toString();
			System.out.println("la fecha es : "+date);

		} catch (ParseException error) {
			System.out.println("el valor ingresado no cumple con el formato fecha requerido: "+error.getMessage()+
					"  el formato requerido es: yyyy-MM-dd");




	}

}
    ArrayList<Profesionales> arrayProfesionales = new ArrayList<>();
	ArrayList<Profesionales>arrayMuestra= new ArrayList<>();
	    public void leerArchivo() throws IOException {

            try {

                File file = new File("src/main/java/com/capacitacion/excepciones/datos/data.txt");

                Scanner data = new Scanner(file);
                //Scanner data = new Scanner(new File("src/main/resources/data.txt"));
                while (data.hasNextLine()) {
                    String[] estData = data.nextLine().split(";");

                    Profesionales profesional = new Profesionales();
                    profesional.setNombre(estData[0]);
                    profesional.setCiudad(estData[1]);
                    profesional.setProfesion(estData[2]);

                    arrayProfesionales.add(profesional);

                }
				data.close();


                for (int i = 0; i < arrayProfesionales.size(); i++) {

                    System.out.println(arrayProfesionales.get(i).getNombre() +
                            arrayProfesionales.get(i).getCiudad() +
                            arrayProfesionales.get(i).getProfesion());
                }

            } catch (FileNotFoundException ex) {
				TipoExcepciones javaExeption=new TipoExcepciones();
				System.out.println( javaExeption.getCausa());
				System.out.println(javaExeption.getTipoFalla());

            }
            for (int i=0; i<arrayProfesionales.size();i++){

            	Profesionales profesion=new Profesionales();
            	profesion.setNombre(arrayProfesionales.get(i).getNombre());
            	profesion.setProfesion(arrayProfesionales.get(i).getProfesion());
            	arrayMuestra.add(profesion);



			}



        }
    public void  escribirArchivo(){


            try {
                FileWriter wr=new FileWriter("src/main/java/com/capacitacion/excepciones/datos/data2.txt");
				// para generar el error usar  tamaño del arrayMuestra >7 ejemplo :
				//for(int i=0;i<8;i++)  en este caso se generaria un error de tipo IndexOutOfBoundsException por el tamano del array
                for (int i=0;i<arrayMuestra.size();i++){
                	wr.write(arrayMuestra.get(i).getNombre()+";"+arrayMuestra.get(i).getProfesion()+"\n");


                }
                wr.close();





            } catch (IndexOutOfBoundsException | IOException e) {
                System.out.println("Errror "+e.getMessage());

            }

    }

    }





