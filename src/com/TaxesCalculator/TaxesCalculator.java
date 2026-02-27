package com.TaxesCalculator;

public class TaxesCalculator {

    private static final double Descuento_casado = 0.95;
	private static final double Ratio_Alto = 0.25;
	private static final double Ratio_Medio = 0.15;
	private static final double Ratio_Bajo = 0.10;

	public double calcularImpuesto(double ingreso, String categoria, boolean casado) {
        double impuesto = 0;
        if (categoria.equals("A")) {
            if (ingreso < 20000) {
                impuesto = ingreso * Ratio_Bajo;
            } else if (ingreso < 50000) {
                impuesto = 2000 + (ingreso - 20000) * Ratio_Medio;
            } else {
                impuesto = 6500 + (ingreso - 50000) * Ratio_Alto;
            }
        } else if (categoria.equals("B")) {
            impuesto = ingreso * 0.20;
        }
        
        if (casado) {
            impuesto = impuesto * Descuento_casado;
        }
        
        return impuesto;
    }
}

