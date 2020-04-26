public class WhileExp extends Expr {
    private final Expr expr1;
    private final Expr expr2;

    public WhileExp(Expr expr1, Expr expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public Value eval(Env e) throws EvalError {

        boolean boolValue = ((BoolVal)expr1.eval(e)).value;

        if (expr1.eval(e).getClass()== BoolVal.class) {
            if (boolValue) {
                expr2.eval(e);
            }
        }
        return new BoolVal(false);
    }

    public String toString() {
        return "while "+ expr1.toString() + "do "+ expr2.toString();
    }
}
