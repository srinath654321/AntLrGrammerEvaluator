public class BoolConst extends Expr {

    private final boolean boolValue;

    public BoolConst(boolean boolValue) {
        this.boolValue = boolValue;
    }

    public Value eval(Env e) throws EvalError {
        return new BoolVal(boolValue);
    }

    public String toString() {
        return String.valueOf(boolValue);
    }
}
