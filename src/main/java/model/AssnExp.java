package model;

public class AssnExp extends Expr {

    private final Expr value;

    public AssnExp(Expr value) {
        super();
        this.value = value;
    }

    public Value eval(Env e) throws EvalError {
        return null;
    }

    public String toString() {
        return null;
    }
}
