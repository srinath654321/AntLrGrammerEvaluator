public class FunVal extends Value {
    private final Env env;
    private final String s;
    private final Expr ex;

    public FunVal(Env env, String s, Expr ex) {
        this.env = env;
        this.s = s;
        this.ex = ex;
    }

    public String toString() {
        return s;
    }

    public Env getEnv() {
        return env;
    }

    public String getS() {
        return s;
    }

    public Expr getEx() {
        return ex;
    }
}
