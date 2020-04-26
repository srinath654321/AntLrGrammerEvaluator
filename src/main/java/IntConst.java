public class IntConst extends Expr {
    private final int value;

    public IntConst(int value) {
        super();
        this.value = value;
    }

    public Value eval(Env e) throws EvalError {
        return new IntVal(value);
    }

    public String toString() {
        return String.valueOf(value);
    }
}
