public class NeuLangile {
    public static void main(String[] args) {
        Langilea l1 = new Langilea("Aimar", "Medialdea", "aimar@gmail.com", 1200);
        System.out.println("Nire langile datuak igoera aurretik: ");
        System.out.println(l1);

        l1.setSoldata(1800);
        System.out.println(l1);
    }
}
