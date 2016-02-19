package curs;
import java.util.*;

public class ExempluArrayList {
    public static void main(String[] args){

        //Varianta 1 de creare array
        ArrayList a = new ArrayList();

        //Varianta 2 de creare array (varianta propusa)
        ArrayList<Instrument> b = new ArrayList<>();



        //adaugare obiect
        /*Instrument i1 = new Instrument();
        b.add(i1);*/

        //adaugare obiect
        b.add(new Instrument("do"));
        b.add(new Instrument("re"));
        b.add(new Instrument("si"));
        b.add(new Instrument("sol"));
        b.add(new Instrument("fa"));

        //parcurgere lisata

        for (int i=0; i<b.size();i++){

            //varianta 1
            /*Instrument z = b.get(i);
            z.canta();*/

            //varianta 2
            b.get(i).canta();

        }

        System.out.println("********");
        b.remove(2);

        for (int i=0; i<b.size();i++) {

            //varianta 1
            /*Instrument z = b.get(i);
            z.canta();*/

            //varianta 2
            b.get(i).canta();
        }

    }
}
