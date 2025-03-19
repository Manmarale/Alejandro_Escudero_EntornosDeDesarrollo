/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.examen;

 /**
  *
  * @author alejandro.escudero// comentario de autor version 1.0
  */
 public class Main {
 
     public static void main(String[] args) {
         //Instanciamos un cuadrado y un circulo
         AEO_Circulo AEO_Circulo = new AEO_Circulo(1, 3, "verde");
         AEO_Rectángulo cuadrado1 = new AEO_Rectángulo(3, 3, "rojo");
         //Calcula area cuadrado LadoA * LadoB
         double ladoA = cuadrado1.getLadoA();
         double ladoB = cuadrado1.getLadoB();
         double area1 = ladoA*ladoB;
         System.out.println("Area cuadrado: " + area1);
         //Calcula area circulo pi*R2
         double radio1 = AEO_Circulo.getRadio();
         double area2 = radio1 * 3.14;
         System.out.println("area del circulo: " + area2);
         //Diferencia entre areas de cuadrado y circulo
         double diferencia = area1 - area2;
         System.out.println("Diferencia areas: " + diferencia);
         //Imprimir datos
         System.out.println("Cuadrado" + cuadrado1);
         System.out.println("Circulo" + AEO_Circulo);
         System.out.println("Diferencia:" + diferencia );
     }
     public void areaCuadrado(Double ladoA, Double ladoB){
         double area1 = ladoA*ladoB;
         System.out.println("Area cuadrado: " + area1);
     }
     public void areaCirculo(Double radio1){
         double area2 = radio1 * 3.14;
     }
     public void diferenciaMetodo(area1, area2){
         double diferencia = area1 - area2;
     }
 }
 