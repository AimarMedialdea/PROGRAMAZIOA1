package normal;

public class TestMonster {
    public static void main(String[] args) {
        
        Monster m1 = new FireMonster("Hellbulla");
        Monster m2 = new WaterMonster("CumLoader");
        Monster m3 = new StoneMonster("Golum");

        System.out.println(m1.toString() + "\n" + m1.attack());
        System.out.println(m2.toString() + "\n" + m2.attack());
        System.out.println(m3.toString() + "\n" + m3.attack());
        
    }
}
