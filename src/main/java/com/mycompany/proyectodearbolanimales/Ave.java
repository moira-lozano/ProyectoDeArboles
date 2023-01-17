/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectodearbolanimales;

/**
 *
 * @author Moira
 */
public class Ave {
    
    private String especie;
    private double peso;
    private String region;

    public Ave(String especie, double peso, String region) {
        this.especie = especie;
        this.peso = peso;
        this.region = region;
    }
    public Ave(){
      this.especie = "";
        this.peso =0.0;
        this.region ="";
    }
    
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    public String mostrar() {
        String dataAve = "";
        dataAve += "Especie: " + this.getEspecie() + "\n";
        dataAve += "Edad: " + this.getPeso() + "\n";
        dataAve += "Región: " + this.getRegion() + "\n";
        return dataAve;
    }
}
