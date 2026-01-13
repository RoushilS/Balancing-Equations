import java.util.ArrayList;

public class Compound {

    ArrayList<Atom> atoms = new ArrayList<Atom>();

    public Compound() {}

    public void addAtom(Atom atom) {
        atoms.add(atom);
    }

    public int getNumber() {
        sum = 0
        for (Atom a : atoms) {
            sum+=a.getNumber
        }
        return sum;
    }

    public boolean applyFactor(double f) {
        for (Atom a : atoms) {
            if (!a.applyFactorWorks(f)) {
                return false;
            }
        }
        for (Atom a : atoms) {
            a.applyFactor(f);
        }
        return true;
    }

    
}
