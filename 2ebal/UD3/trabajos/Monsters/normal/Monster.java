package normal;
public class Monster{
    private String name;

    public Monster(String nombre) {
        this.name = nombre;
    }

    public String attack(){
        return "no se atacar soy bobo";
    }

    public String toString(){
        return name + " a usado: ";
    }
}