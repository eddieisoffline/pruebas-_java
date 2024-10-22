import com.aluracursos.Pelicula;
import com.aluracursos.Series;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Series theOffice = new Series();

        theOffice.setNombre("The Office");
        theOffice.setFechaDeLanzamiento(2005);
        theOffice.setIncluidoEnElPlan(true);
        theOffice.setTemporadas(9);
        theOffice.setEpisodiosPorTemporada(22);
        theOffice.setMinutosPorEpisodio(22);
        theOffice.muestraFichaTecnica();

    }
}