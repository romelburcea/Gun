package gun;

import java.util.Random;
import java.lang.Math;

public class Gun {

    private boolean piedica;
    private Magazine inc;

    public Gun() {
        this(true);
    }

    public Gun(boolean piedica) {
        this.piedica = piedica;

    }

    public void schimbaIncarcator(Magazine i) {
        inc = i;
    }

    public void punePiedica() {
        piedica = true;
        System.out.println("ai pus piedica");

    }

    public void scoatePiedica() {
        piedica = false;
        System.out.println("ai scos piedica");

    }

    public void trage() {
        if (piedica == true) {
            System.out.println("nu pot trage pt ca e pusa piedica");
            return;
        }
        if (inc.livreazaGlont()) {
            String[] a = {"ai nimerit", "ai ratat"};
            Random random = new Random();

            int select = random.nextInt(a.length);
            System.out.println("ai tras un glont si " + a[select]);
        } else {
            inc.eGol();

        }

    }

    public void stareIncarcator() {
        System.out.println(piedica == false ? "piedica este scoasa" : "piedica este pusa");
        if(piedica == false){
            inc.gloanteRamase();
            inc.eGol();
        }
    }

}
