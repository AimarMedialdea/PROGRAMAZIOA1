public class TestMonster {
    public static void main(String[] args) {
        
        Monster m1 = new FireMonster("Hellbulla");
        Monster m2 = new WaterMonster("CumLoader");
        Monster m3 = new StoneMonster("Golum");

        System.out.println(m1.attack());
        
    }
}
