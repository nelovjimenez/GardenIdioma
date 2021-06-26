/**package com.example.jardin;

import java.io.Serializable;

public class Municipio  implements Serializable {
    static String nombreMunicipio;
    static int fotoMunicipio;

    public Municipio(String nombreMunicipio, int fotoMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
        this.fotoMunicipio = fotoMunicipio;
    }


    public static String getNombreMunicipio() {return nombreMunicipio;}



    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public static int getFotoMunicipio() {
        return fotoMunicipio;
    }

    public void setFotoMunicipio(int fotoMunicipio) {
        this.fotoMunicipio = fotoMunicipio;
    }
}
 */
package com.example.jardin;

import java.io.Serializable;

public class Municipio implements Serializable {


    //ATRIBUTOS
    String nombreMunicipio;
    String descripcionMunicipio;
    int fotoMunicipio;

    //CONSTRUCTOR
    public Municipio(String nombreMunicipio, int fotoMunicipio, String descripcionMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
        this.fotoMunicipio = fotoMunicipio;
        this.descripcionMunicipio = descripcionMunicipio;
    }

    //METODOS
    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getFotoMunicipio() {
        return fotoMunicipio;
    }

    public void setFotoMunicipio(int fotoMunicipio) {this.fotoMunicipio = fotoMunicipio;

    }

    public String getDescripcionMunicipio(){
        return descripcionMunicipio;
    }
    public void setDescripcionMunicipio(String descripcionMunicipio){
        this.descripcionMunicipio = descripcionMunicipio;
    }
}