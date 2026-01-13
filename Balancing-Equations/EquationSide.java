public class EquationSide {

    private ArrayList<Compound> compounds = new ArrayList<Compound>();

    public EquationSide() {}

    public void addCompound(Compound c) {
        compounds.add(c);
    }

    public void addCompounds(Compound ... compoundAddList) {
        for (Compound compound : compoundAddList) {
            compounds.add(compound)
        }
    }

    public int getNumber() {
        sum = 0
        for (Compound c : compounds) {
            sum+=c.getNumber;
        }
    }

    public ArrayList<Compound> getCompounds() {
        return compounds;
    }

    
}
