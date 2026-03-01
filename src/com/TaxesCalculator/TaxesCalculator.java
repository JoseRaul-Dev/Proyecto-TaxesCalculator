package com.TaxesCalculator;

import static com.TaxesCalculator.TaxConstants.*;

/** 
 * Esta clase es la encargada de calcular los impuestos según los ingresos, la categoría y el estado civil.
 */
public class TaxesCalculator {
	
	/**
     * Este método se utiliza para calcular el impuesto que se debe realizar en función del ingreso, la categoría y el estado civil.
     * @param ingreso   Ingreso anual.
     * @param categoria Categoría de la persona ("A" o "B").
     * @param casado    Estado civil en el que se encuentra.
     * @return Importe del impuesto tras aplicar tasas y descuentos.
     */

    public double calcularImpuesto(double ingreso, String categoria, boolean casado) {
    	return calculoTasas(ingreso, categoria, casado);    
    }

    /**
     * Este método interno indica el impuesto calculado después de aplicar las tasas correspondientes según el ingreso, la categoría y el estado civil que se hayan proporcionado.
     *
     * @param ingreso   Ingreso anual.
     * @param categoria Categoría que se haya definido previamente.
     * @param casado    Estado civil.
     * @return Importe calculado tras aplicar tasas y descuentos.
     */

	private double calculoTasas(double ingreso, String categoria, boolean casado) {
		double impuesto = 0;
		
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

	/** Constructor por defecto de la clase TaxesCalculator.
	 * No sirve para nada en especial.
	 */
	public TaxesCalculator() {
	}
}


