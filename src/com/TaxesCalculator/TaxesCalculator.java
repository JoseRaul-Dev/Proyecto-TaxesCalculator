package com.TaxesCalculator;

public class TaxesCalculator {

    public double calcularImpuesto(double ingreso, String categoria, boolean casado) {
        double impuesto = 0;
        if (categoria.equals("A")) {
            if (ingreso < 20000) {
                impuesto = ingreso * 0.10;
            } else if (ingreso < 50000) {
                impuesto = 2000 + (ingreso - 20000) * 0.15;
            } else {
                impuesto = 6500 + (ingreso - 50000) * 0.25;
            }
        } else if (categoria.equals("B")) {
            impuesto = ingreso * 0.20;
        }
        
        if (casado) {
            impuesto = impuesto * 0.95;
        }
        
        return impuesto;
    }
}

