package com.capacitacion.excepciones;

public class TipoExcepciones extends Exception {

    String causa ="Archivo no encontrado";
    String tipoFalla=" FileNotFoundExceptio";


    public String getCausa() {
        return causa;
    }
    public String getTipoFalla() {
        return tipoFalla;
    }


}
