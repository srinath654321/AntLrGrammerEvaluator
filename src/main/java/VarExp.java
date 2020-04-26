public class VarExp extends Expr {
    private final String var;

    public VarExp(String var) {
        this.var = var;
    }

    public Value eval(Env e) throws EvalError {
        return e.lookup(var);
    }

    public String toString() {
        return var;
    }

}
