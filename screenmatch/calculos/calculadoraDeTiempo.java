package calculos;

import com.aluracursos.Pelicula;

public class calculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Pelicula p){
        tiempoTotal += p.getDuracionEnMinutos();
    }
}
