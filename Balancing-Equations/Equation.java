public class Equation {

    EquationSide products = new EquationSide();
    EquationSide reactants = new EquationSide();

    public Equation() {}

    public void addProducts(Compounds... compoundList) {
        products.addCompounds(compoundList);
    }

    public void addReactants(Compounds... compoundList) {
        reactants.addCompounds(compoundList);
    }

    public boolean checkMatches() {
        return products.getNumber==reactants.getNumber;
    }

    public void solveEquation() {
        
    }

}
