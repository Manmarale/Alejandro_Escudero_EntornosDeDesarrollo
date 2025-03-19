/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author alejandro.escudero
 */
public class AEO_Rectángulo {

    public AEO_Rectángulo(int par, int par1, String rojo) {
    }
  private int id;
    private double ladoA;
    private double ladoB;
    private String color;
    public AEO_Rectángulo{}
    public AEO_Rectánguloteger id, Double ladoA, Double ladoB, String color){
        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    } //Getters y Setters
    public Integer getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public Double getLadoA(){
        return ladoA;
    }
    public void setLadoA(){
        this.ladoA = ladoA;
    }
    public Double getLadoB(){
        return ladoB;
    }
    public void setLadoB(){
        this.ladoB = ladoB;
    }
    public String getColor(){
        return color;
    }
    public void setColor(){
        this.color = color;
    }
    public void areaCuadrado(Double ladoA, Double ladoB){
        double area1 = ladoA*ladoB;
        System.out.println("Area cuadrado: " + area1);
    }
    @Override//metodo toString 
    public String toString(){
        return "id del circulo" + id + "lado A" + ladoA + "lado B" + ladoB + "color" + color;
    }
}
