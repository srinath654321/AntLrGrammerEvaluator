public class LetFunExp extends Expr {
    private final String s1;
    private final String s2;
    private final Expr expr1;
    private final Expr expr2;

    public LetFunExp(String s1, String s2, Expr expr1, Expr expr2) {
        this.s1 = s1;
        this.s2 = s2;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public Value eval(Env e) throws EvalError {
        IntVal intVal = new IntVal(0);
        Env env1=e.addBinding(s1, intVal);
        FunVal fv=new FunVal(env1, s2, expr1);
        env1.updateBinding(s1, fv);
        Value v= expr2.eval(env1);
        return v;
    }

    @Override
    public String toString() {
        return "let fun" + s1 + "(" + s2 + ")" + expr1.toString() + "in" + expr2.toString() + "end";
    }

}
