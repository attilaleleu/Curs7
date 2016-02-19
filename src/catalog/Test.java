package catalog;

/**
 * Created by leleluattila on 25/01/16.
 */
public class Test {
    public static void main(String[] args){
        CatalogMaterie m1 = new CatalogMaterie("Programare");
        Elev e1 = new Elev("Adi",9);
        Elev e2 = new Elev("Adi",7);
        Elev e3 = new Elev("Dan",9);

        m1.adaugaElev(e1);
        m1.adaugaElev(e2);
        m1.adaugaElev(e3);

        m1.afiseazaCatalog();

    }
}
