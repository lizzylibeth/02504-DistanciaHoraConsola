/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Calendar
        Calendar cal = Calendar.getInstance();

        //Variables
        int h = cal.get(Calendar.HOUR_OF_DAY);
        int m = cal.get(Calendar.MINUTE);
        int s = cal.get(Calendar.SECOND);

        //Mensaje
        try {
            //Pedir Datos al Usuario
            System.out.print("Hora inicio ......: ");
            int horasinicio = SCN.nextInt();
            SCN.nextLine();
            System.out.print("Minuto inicio ....: ");
            int minutosinicio = SCN.nextInt();
            SCN.nextLine();
            System.out.print("Segundo inicio ...: ");
            int segundosinicio = SCN.nextInt();
            SCN.nextLine();

            //Pasar los datos introducidos a segundos para compararlos
            int tiempoInicio = horasinicio * 3600 + minutosinicio * 60 + segundosinicio;
            int tiempoActual = h * 3600 + m * 60 + s;

            //Calcular la distancia entre horas
            int distancia = tiempoActual - tiempoInicio;

            //Pasar la distancia calculada a horas, minutos y segundos
            int distanciaSegundos = distancia % 60 % 60;
            int distanciaMinutos = distancia / 60 % 60;
            int distanciaHoras = distancia / 3600;

            //Sacar Resultados por pantalla
            System.out.printf("Hora actual ......: %02d:%02d:%02d%n", h, m, s);
            System.out.printf("Hora inicio ......: %02d:%02d:%02d%n", horasinicio, minutosinicio, segundosinicio);
            System.out.printf("Tiempo de clase ..: %02d:%02d:%02d%n", distanciaHoras, distanciaMinutos, distanciaSegundos);

        } catch (Exception e) {

            System.out.println("Error, Valor Incorrecto");

        } finally {

            SCN.nextLine(); //Borrar buffer     
        }

    }//main

}//class
