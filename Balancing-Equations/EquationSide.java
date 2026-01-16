import java.util.ArrayList;

public class EquationSide {

    private ArrayList<Compound> compounds = new ArrayList<Compound>();

    public EquationSide() {}

    public void addCompound(Compound c) {
        compounds.add(c);
    }

    public void addCompounds(Compound ... compoundAddList) {
        for (Compound compound : compoundAddList) {
            compounds.add(compound);
        }
    }

    public int getNumber() {
        int sum = 0;
        for (Compound c : compounds) {
            sum+=c.getNumber();
        }
        return sum;
    }

    public ArrayList<Compound> getCompounds() {
        return compounds;
    }

    public void sortCompounds() {
        compounds.sort(Comparator.comparingInt(Compound::getAtomNumber));
    }

    
}
