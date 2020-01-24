package edu.escuelaing.arem.ASE.app;

import java.util.List;

public class Operaciones {
	
	public static double mean(List<Double> datos) {
        double cont = 0;
        for (double n : datos) {
            cont += n;
        }
        double promedio = cont /= datos.size();
        return promedio;
    }

    /**
     * @param datos
     * @return
     */
    public static double stdDev(List<Double> datos) {
        int size = datos.size();
        double cont = 0;

        for (double n : datos) {
            cont += Math.pow((n - mean(datos)), 2);
        }
        cont /= (size - 1);
        return Math.sqrt(cont);
    }
}
