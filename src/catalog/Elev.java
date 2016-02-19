package catalog;

/**
 * Created by leleluattila on 25/01/16.
 */
public class Elev {
    public String nume;
    private int nota;

    public Elev(String nume, int nota){
        this.nume = nume;
        this.nota = nota;

    }

    void afiseaza(){
        System.out.println("Elevul: " + nume + ". " + "Nota: " + nota);

    }


}
