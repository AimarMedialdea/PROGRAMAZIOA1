package random;

import random.Zatikia;

public class test {
    public static void main(String[] args) {
        Zatikia zat1 = new Zatikia(5, 9);
        Zatikia zat2 = new Zatikia(6, 9);

        Zatikia zat6 = new Zatikia(5,6);

        System.out.println( Zatikia.biderkatu(zat1, zat2));

        zat1.getIzendatzailea();

        zat6.sinplifikatu1();
        System.out.println(zat6);



   


    }
    


}
