/**
 * 
 */
package uf2181;

/**
 * @author Alicia
 * 
 *
 */
public class FuncionesDGT {
 /** 
  * Calculo funciones para calcular la media de puntos
  * @param puntos int perdida de puntos
  * @return int suma de puntos
  */
	public double mediaPuntos(int puntos[]) {
		double suma = 0;
		
		for (int i = 0; i < puntos.length; i++) {
			suma = suma +puntos[i];
		}
		if (puntos.length==0) throw new ArrayIndexOutOfBoundsException();
		return suma/puntos.length;
	}
	/**
	 * funcion para saber la taxa maxima permitida
	 * @param tipoConductor String tipo de conductores ,ya se general,profesional o noveles
	 * @param aire boolean tasa de alcohol en aire
	 * @return  tasa doble la tasa permitida
	 */
	public double maximaTasaPermitida(String tipoConductor, boolean aire) {
		double tasa=0.25;
		if (tipoConductor.equalsIgnoreCase("General")) {
			if (aire) {
				tasa=0.25;
			} else {
				tasa=0.5;
			}
		} else {
			// profesionales y noveles
			if (aire) {
				tasa=0.15;
			} else {
				tasa=0.3;
			}
		}
		return tasa;
	}

	
}
