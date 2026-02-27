package com.TaxesCalculator;

public class TaxesCalculator {
	private static final double Descuento_Casado = 0.95;
	private static final double Ratio_Alto = 0.25;
	private static final double Ratio_Medio = 0.15;
	private static final double Ratio_Bajo = 0.10;
	private static final int Base_Alta = 6500;
	private static final int Tasa_Maxima = 50000;
	private static final int Tasa_Minima = 20000;
	private static final int Base_Media = 2000;
	
	
    public double calcularImpuesto(double ingreso, String categoria, boolean casado) {
        double impuesto = 0;
        if (categoria.equals("A")) {
           
			if (ingreso < Tasa_Minima) {
                impuesto = ingreso * Ratio_Bajo;
            } else if (ingreso < Tasa_Maxima) {
                impuesto = Base_Media + (ingreso - Tasa_Minima) * Ratio_Medio;
            } else {
                impuesto = Base_Alta + (ingreso - 50000) * Ratio_Alto;
            }
        } else if (categoria.equals("B")) {
            impuesto = ingreso * 0.20;
        }
        
        if (casado) {
            impuesto = impuesto * Descuento_Casado;
        }
        
        return impuesto;
    }
}

