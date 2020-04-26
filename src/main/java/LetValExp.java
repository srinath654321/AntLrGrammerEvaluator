public class LetValExp extends Expr {

    private final String s;
    private final Expr expr1;
    private final Expr expr2;

    public LetValExp(String s, Expr expr1, Expr expr2) {
        this.s = s;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public Value eval(Env e) throws EvalError {
        return expr2.eval(e.addBinding(s, expr1.eval(e)));
    }

    // let val a= 2 in a+4
    public String toString() {
        return "let val"+ s + ":=" + expr1.toString() + "in" + expr2.toString() + "end";
    }
}
