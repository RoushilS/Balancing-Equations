public class Equation {

    EquationSide products = new EquationSide();
    EquationSide reactants = new EquationSide();

    public Equation() {}

    public void addProducts(Compound... compoundList) {
        products.addCompounds(compoundList);
    }

    public void addReactants(Compound... compoundList) {
        reactants.addCompounds(compoundList);
    }

    public boolean checkMatches() {
        return products.getNumber()==reactants.getNumber();
    }


    public void solveEquation() {
        reactants.sortCompounds();
        products.sortCompounds();
        while (!checkMatches()) {
            ;
        }
    }
}