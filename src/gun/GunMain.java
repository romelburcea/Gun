package gun;

public class GunMain {

    public static void main(String[] args) {
        Gun p = new Gun();
        Magazine inc = new Magazine(4);
        
        p.schimbaIncarcator(inc);
        
        
        
        p.scoatePiedica();
        
        p.trage();
        p.trage();
        p.punePiedica();
        p.stareIncarcator();
    }
}
