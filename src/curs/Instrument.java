package curs;

/**
 * Created by leleluattila on 25/01/16.
 */
public class Instrument {
    String nota;

    public Instrument(String nota){
        this.nota = nota;
    }

    void canta(){
        System.out.println(nota);

    }
}
