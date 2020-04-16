package model;

public class VarExp extends Expr {
    private final String var;

    public VarExp(String var) {
        this.var = var;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        return e.lookup(var);
    }

    @Override
    public String toString() {
        return var;
    }

}
