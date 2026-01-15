public class Atom {
    private String name;

    private int amount = 1;


    public Atom() {}

    public Atom(String name) {
        this.name=name;
    }

    public Atom(String name, int amount) {
        this.name=name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return amount;
    }

    public boolean applyFactorWorks(double f) {
        return amount*f%1==0;
    }

    public void applyFactor(double f) {
        amount*=f;
    }

}
