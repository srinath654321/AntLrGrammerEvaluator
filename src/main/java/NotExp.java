public class NotExp extends Expr {
    public final Expr expr;

    public NotExp(Expr _arg) {
        expr = _arg;
    }

    public Value eval(Env e) throws EvalError {
        if (expr instanceof BoolConst) {
            return new BoolVal(!((BoolVal)expr.eval(e)).value);
        } else {
            throw new EvalError("Not expression evaluation error incompatible input " + expr.eval(e).toString());
        }
    }

    public String toString() {
        return "!" + expr.toString();
    }
}
