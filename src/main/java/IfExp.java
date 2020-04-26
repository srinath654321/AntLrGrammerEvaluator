public class IfExp extends Expr {

    private Expr value1;
    private Expr value2;
    private Expr value3;

    public IfExp(Expr value1, Expr value2, Expr value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public Value eval(Env e) throws EvalError {

        if (value1 instanceof BinExp) {
            return value1.eval(e);
        }

        return value3.eval(e);
    }

    public String toString() {
        return "If " + value1.toString() + "=" + value2.toString() + " returns " + value3.toString();
    }
}
