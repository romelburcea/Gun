package gun;

import java.lang.Math;

public class Magazine {

    private int capacitate;
    private int nrGloante;

    public Magazine(int Capacitate) {
        capacitate = Capacitate;
        nrGloante = capacitate;

    }

    public boolean livreazaGlont() {
        if (nrGloante > 0) {
            System.out.println("ai livrat un glont");
            nrGloante--;
            return true;
        } else {
            System.out.println("nu mai pot livra gloante");
            return false;
        }
    }

    public void eGol() {
        if(nrGloante == 0){
            System.out.println("nu mai sunt gloante");
        }else{
            System.out.println("inca mai sunt gloante");
        }
    }
    public void gloanteRamase(){
        if(nrGloante > 0){
            System.out.println("mai sunt " + nrGloante + "ramase");
        }
    }
}
