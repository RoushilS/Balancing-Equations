public class Atom {
    String name;

    int amount = 1;


    public Atom() {}

    public Atom(String name) {
        this.name=name;
    }

    public Atom(String name, int amount) {
        this.name=name;
        this.amount = amount;
    }

}
