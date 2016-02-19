package catalog;
import java.util.*;


/**
 * Created by leleluattila on 25/01/16.
 */
public class CatalogMaterie {
    String materie;
    ArrayList<Elev> catalog = new ArrayList<>();

    public CatalogMaterie(String materie){
        this.materie = materie;
    }

    void adaugaElev(Elev e){
        catalog.add(e);

    }

    void afiseazaCatalog(){
        //varianta de for. se numeste: "for each"
        for(Elev e:catalog){
            e.afiseaza();
        }
    }

}
