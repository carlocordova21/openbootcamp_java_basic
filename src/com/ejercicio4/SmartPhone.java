package com.ejercicio4;

public class SmartPhone extends SmartDevice{
    private Float pulgadas;
    private String sistemaOperativo;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, Float precio, Float pulgadas, String sistemaOperativo) {
        super(marca, modelo, color, precio);
        this.pulgadas = pulgadas;
        this.sistemaOperativo = sistemaOperativo;
    }

    public Float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Float pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pulgadas=" + pulgadas +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                "} " + super.toString();
    }
}
