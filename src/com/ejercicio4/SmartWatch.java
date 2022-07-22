package com.ejercicio4;

public class SmartWatch extends SmartDevice {
    private String materialCorrea;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String color, Float precio, String materialCorrea) {
        super(marca, modelo, color, precio);
        this.materialCorrea = materialCorrea;
    }

    public String getMaterialCorrea() {
        return materialCorrea;
    }

    public void setMaterialCorrea(String materialCorrea) {
        this.materialCorrea = materialCorrea;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "materialCorrea='" + materialCorrea + '\'' +
                "} " + super.toString();
    }
}
