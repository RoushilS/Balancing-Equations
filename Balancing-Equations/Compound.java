import java.util.ArrayList;

public class Compound {

    private ArrayList<Atom> atoms = new ArrayList<Atom>();

    private int coefficient = 1;

    public Compound() {}

    public int getCoefficient() {
        return coefficient;
    }

    public void addAtom(Atom atom) {
        atoms.add(atom);
    }

    public void addAtoms(Atom ... atomAddList) {
        for (Atom atom : atomAddList) {
            atoms.add(atom);
        }
    }

    public int getNumber() {
        int sum = 0;
        for (Atom a : atoms) {
            sum+=a.getNumber();
        }
        return sum;
    }

    public ArrayList<Atom> getAtoms() {
        return atoms;
    }

    public int getAtomNumber() {
        return atoms.size();
    }

    public boolean applyCoefficient(double f) {
        for (Atom a : atoms) {
            if (!a.applyFactorWorks(f)) {
                return false;
            }
        }
        for (Atom a : atoms) {
            a.applyFactor(f);
        }
        coefficient = (int) (coefficient*f);
        return true;
    }

    
}
