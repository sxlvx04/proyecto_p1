/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sistema_final;

/**
 *
 * @author byron y salvador
 */
import java.util.ArrayList;

import java.util.Scanner;

public class Sistema_final {
    
    public static Scanner entrada = new Scanner (System.in);

    public static void main(String[] args) {
        ArrayList<String> listaHuespedes = new ArrayList();
        String thabitacion = "";
        boolean  desc_edad =false;
        char r = 's';
        while (r == 's' || r == 'S') {
            String[] tipoHabitacion = {"Sencilla", "Doble", "Triple", "King"};
            String[] servicios ={"Restaurante","Gimnasio","Canchas Deportivas"};
            
            System.out.println("-------------------------------------------------");
            System.out.println("Ingrese su nombre: ");
            String nom = entrada.next();
            System.out.println("Ingrese su edad: ");
            int edad = entrada.nextInt();
            System.out.println("Bienvenido al sistema de reserva de hotel! " + nom);
            System.out.println("Tipos de habitaciones disponibles: ");
            ImpArr(tipoHabitacion);
            System.out.println("Sencilla: Habitacion con espacio para una persona, dispone de una cama y un baño");
            System.out.println("Doble: Habitacion con espacio para dos personas,dispone de dos camas,baño,y un televisor");
            System.out.println("Triple: Habitacion con espacio para tres personas, dispone de tres camas,baño,televisor, y jacuzzi");
            System.out.println("King: Habitacion con espacio para cinco personas, dispone de 5 camas");
            System.out.println("Porfavor " + nom + " ingrese el digito del tipo de habitacion que desea reservar: ");
            int tipo_hab = entrada.nextInt();
            if (tipo_hab == 1) {
                thabitacion = "Sencilla";
            } else if (tipo_hab == 2) {
                thabitacion = "Doble";
            } else if (tipo_hab == 3) {
                thabitacion = "Triple";
            } else if (tipo_hab == 4) {
                thabitacion = "King";
            }

            double tot_pag = 0.0;
            int acum_serv;
            int dias;
            int p=0;
            listaHuespedes.add(nom);
            int cont_serv;

            int serv;
            String resp = "";

            switch (tipo_hab) {
                case 1: {
                    System.out.println(nom + " ha elegido la habitacion sencilla");
                    System.out.println("Ingrese el numero de dias a reservar la habitacion: ");
                    dias = entrada.nextInt();
                    ImpArr(servicios);
                    System.out.println("Ingrese si hara uso de los servicios listados [s/n]: ");
                    resp = entrada.next();

                    tot_pag = 1500 * dias;

                    if (resp.equals("s") || resp.equals("S")) {
                        System.out.println("De cuantos usos hara servicio: ");
                        cont_serv = entrada.nextInt();
                        for (int i = 1; i <= cont_serv; i++) {
                            System.out.println("Ingrese el digito del servicio a usar: ");

                            serv = entrada.nextInt();

                            if (serv == 1) {
                                tot_pag += 400 * dias;

                            } else if (serv == 2) {
                                tot_pag += 50 * dias;

                            } else if (serv == 3) {
                                tot_pag += 30 * dias;

                            }
                        }

                    }

                }//fin case 1
                break;
                case 2: {
                    System.out.println(nom + " ha elegido la habitacion doble");
                    System.out.println("Ingrese el numero de dias a reservar la habitacion: ");
                    dias = entrada.nextInt();
                    ImpArr(servicios);
                    System.out.println("Ingrese si hara uso de los servicios listados [s/n]: ");
                    resp = entrada.next();
                    
                    tot_pag = 2000 * dias;
                    
                    if (resp.equals("s") || resp.equals("S")) {
                        System.out.println("De cuantos usos hara servicio: ");
                        cont_serv = entrada.nextInt();
                        for (int i = 1; i <= cont_serv; i++) {
                            System.out.println("Ingrese el digito del servicio a usar: ");
                            serv = entrada.nextInt();
                            tot_pag = 2000 * dias;
                            if (serv == 1) {
                                tot_pag += 500 * dias;

                            } else if (serv == 2) {
                                tot_pag += 60 * dias;

                            } else if (serv == 3) {
                                tot_pag += 35 * dias;

                            }
                        }

                    }

                }//fin case 2
                break;
                case 3: {
                   System.out.println(nom + " ha elegido la habitacion triple");
                    System.out.println("Ingrese el numero de dias a reservar la habitacion: ");
                    dias = entrada.nextInt();
                    ImpArr(servicios);
                    System.out.println("Ingrese si hara uso de los servicios listados [s/n]: ");
                    resp = entrada.next();
                    
                    tot_pag = 2500 * dias;
                    
                    if (resp.equals("s") || resp.equals("S")) {
                        System.out.println("De cuantos usos hara servicio: ");
                        cont_serv = entrada.nextInt();
                        for (int i = 1; i <= cont_serv; i++) {
                            System.out.println("Ingrese el digito del servicio a usar: ");
                            serv = entrada.nextInt();

                            if (serv == 1) {
                                tot_pag = tot_pag = +550 * dias;

                            } else if (serv == 2) {
                                tot_pag = (tot_pag = +70 * dias);

                            } else if (serv == 3) {
                                tot_pag = (tot_pag = +40 * dias);

                            }

                        }
                    }

                }//fin case 3
                break;
                case 4: {
                   System.out.println(nom + " ha elegido la habitacion king");
                    System.out.println("Ingrese el numero de dias a reservar la habitacion: ");
                    dias = entrada.nextInt();
                    ImpArr(servicios);
                    System.out.println("Ingrese si hara uso de los servicios listados [s/n]: ");
                    resp = entrada.next();
                    
                    tot_pag = 3500 * dias;
                    
                    if (resp.equals("s") || resp.equals("S")) {
                        System.out.println("De cuantos usos hara servicio: ");
                        cont_serv = entrada.nextInt();
                        for (int i = 1; i <= cont_serv; i++) {
                            System.out.println("Ingrese el digito del servicio a usar: ");
                            serv = entrada.nextInt();

                            if (serv == 1) {
                                tot_pag = tot_pag += 600 * dias;

                            } else if (serv == 2) {
                                tot_pag = (tot_pag += 75 * dias);

                            } else if (serv == 3) {
                                tot_pag = (tot_pag += 45 * dias);

                            }
                        }

                    }//fin case 4
                }
                break;

                default: {
                    System.out.println("Tipo de habitacion ingresada no fue encontrada, ingrese nuevamente al sistema");
                }//fin default

            }//fin switch
            if (edad > 60) {
                 tot_pag = (tot_pag * 0.75);

            } else if (edad < 18) {
                System.out.println("Tiene que ser mayor de edad!");
            }
            double imp=impuesto(tot_pag);
            System.out.println("El impuesto es de:" + imp +" Lps");
            tot_pag = tot_pag+imp;

            int desc =descuento(edad,tot_pag,p);
            System.out.println("El descuento es de:" + desc +" Lps");
            tot_pag = tot_pag-desc;
            
            System.out.println(
                    "El total a pagar es:" + tot_pag + " Lps");
            System.out.println(nom
                    + " Gracias por utlizar el sistema de reserva");

            System.out.println(
                    "Desea ingresar un nuevo usuario[s/n]: ");
            r = entrada.next().charAt(0);

        }//fin while
        ImpListaH(listaHuespedes);
        
    }//fin main  

    public static void ImpListaH(ArrayList<String> lh) {
        System.out.println("Su Lista de Huespedes es: ");
        for (int i = 0; i < lh.size(); i++) {

            System.out.println(lh.get(i));
        }
    }//fin metodo para imprimir lista

    public static void ImpArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " " + arr[i] + "\n");
        }
    }//fin metodo para imprimr arraylist
    
   public static double impuesto(double tot_pag){
       double impuesto =tot_pag*0.15;
       return impuesto;
       
   }
   
    static int descuento(int edad,double tot_pag,int p){
       if(edad>=60){
       int desc =(int)tot_pag;
       return desc;
       }
     return p;
   }
   
   
}//fin clase

