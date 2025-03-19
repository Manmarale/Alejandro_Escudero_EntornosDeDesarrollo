/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author alejandro.escudero
 */
public class AEO_Circulo {
     private int id;
   private Double radio;
   private String color; //comentario para el commit

   public AEO_Circulo(int par, int par1, String verde){}
   public AEO_Circulo(Integer id, Double radio, String color){
        this.id = id;
        this.radio = radio;
        this.color = color;
    }
    //getters y setters
    public Integer getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public Double getRadio(){
        return radio;
    }
    public void setRadio(){
        this.radio = radio;
    }
    public String getColor(){
        return color;

    }
    public void setColor(){
        this.color = color;
    }
    public void areaCirculo(Double radio1){
        double area2 = radio1 * 3.14;
    }
    @Override //esto lo hago ya que en todos los toString se incorpora //metodo to String 
    public String toString(){
        return "id del circulo" + id + ";" + "de radio" + radio + "y de color" + color;
    }  
}
