package com.TaxesCalculator;

public class TaxesCalculator {
	
	private static final int Base_Alta = 6500;
	private static final int Tasa_Maxima = 50000;
	private static final int Tasa_Minima = 20000;
    private static final int Base_Media = 2000;
	
	
    public double calcularImpuesto(double ingreso, String categoria, boolean casado) {
        double impuesto = 0;
        if (categoria.equals("A")) {
         
			if (ingreso < Tasa_Minima) {
                impuesto = ingreso * 0.10;
            } else {
				if (ingreso < Tasa_Maxima) {
				
					impuesto = Base_Media + (ingreso - Tasa_Minima) * 0.15;
				} else {
				    impuesto = Base_Alta + (ingreso - Tasa_Maxima) * 0.25;
				}
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

