package com.TaxesCalculator;

public class TaxConstants {
	/** Esta clase contiene las constantes utilizadas para el cálculo de impuestos. */
	
	
	/** Descuento aplicado si la persona está casada. */
	public static final double DESCUENTO_CASADO = 0.95;
	
	/** Ratio de impuesto alto. */
	public static final double RATIO_ALTO = 0.25;
	
	/** Ratio de impuesto medio. */
	public static final double RATIO_MEDIO = 0.15;
	
	/** Ratio de impuesto bajo */
	public static final double RATIO_BAJO = 0.10;
  
	/** Base fija para ingresos altos. */
	public static final int BASE_ALTA = 6500;
	
	/** Límite máximo de la tasa */

	public static final int TASA_MAXIMA = 50000;
	
	/** Limite mínimo de la tasa. */
	public static final int TASA_MINIMA = 20000;
	
	/** Base fija para ingresos medios. */
	public static final int BASE_MEDIA = 2000;
	
	
	/** Este Constructor privado nos sirve para evitar que esta clase pueda instanciarse */
	private TaxConstants() {
	
	}
	
	
}
