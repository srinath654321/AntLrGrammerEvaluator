public class SeqExp extends Expr {

    private final Expr expr1;
    private final Expr expr2;

    public SeqExp(Expr expr1, Expr expr2) {
        super();
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public Value eval(Env e) throws EvalError {
        return expr2.eval(e);
    }

    public String toString() {
        return "{" + expr1.toString() + ";" + expr2.toString() + "}";
    }
}
