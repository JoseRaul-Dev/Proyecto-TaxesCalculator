package com.TaxesCalculator;

import static com.TaxesCalculator.TaxConstants.*;

public class TaxesCalculator {
	
	/**
     * Aplica las tasas correspondientes según la categoría y el tramo de ingresos.
     * @param ingreso   Ingreso anual.
     * @param categoria Categoría de la persona ("A" o "B").
     * @param casado    Estado civil en el que se encuentra.
     * @return Importe del impuesto tras aplicar tasas y descuentos.
     */

    public double calcularImpuesto(double ingreso, String categoria, boolean casado) {
        double impuesto = 0;
        impuesto = calculoTasas(ingreso, categoria, casado, impuesto);
        
        return impuesto;
    }

    

	private double calculoTasas(double ingreso, String categoria, boolean casado, double impuesto) {
		if (categoria.equals("A")) {
           
			if (ingreso < TASA_MINIMA) {
                impuesto = ingreso * RATIO_BAJO;
            } else if (ingreso < TASA_MAXIMA) {
                impuesto = BASE_MEDIA + (ingreso - TASA_MINIMA) * RATIO_MEDIO;
            } else {
                impuesto = BASE_ALTA + (ingreso - TASA_MAXIMA) * RATIO_ALTO;
            }
        } else if (categoria.equals("B")) {
            impuesto = ingreso * 0.20;
        }
        
        if (casado) {
            impuesto = impuesto * DESCUENTO_CASADO;
        }
		return impuesto;
	}
}
