public class EquationSide {

    ArrayList<Compound> compounds = new ArrayList<Compound>();

    public EquationSide() {}

    public void addCompound(Compound c) {
        compounds.add(c)
    }

    public int getNumber() {
        sum = 0
        for (Compound c : compounds) {
            sum+=c.getNumber;
        }
    }
}
