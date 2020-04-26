public class AssnExp extends Expr {

    private final Expr expr;

    public AssnExp(Expr expr) {
        this.expr = expr;
    }

    public Value eval(Env e) throws EvalError {
        return null;
    }

    public String toString() {
        return null;
    }
}
