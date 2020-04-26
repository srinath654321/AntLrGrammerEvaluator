public enum BinOp {
    PLUS ("+") {
        @Override
        public String getStringValue(Expr value1, Expr value2) {
            return value1.toString() + getOperator() + value2.toString();
        }

        @Override
        public Value evaluateIntegerExpression(int num1, int num2) {
            return new IntVal(num1 + num2);
        }

        @Override
        public Value evaluateBooleanExpression(boolean value1, boolean value2) {
            System.err.println("Invalid input for operator " + getOperator());
            return null;
        }
    },
    MINUS ("-") {
        @Override
        public String getStringValue(Expr value1, Expr value2) {
            return value1.toString() + getOperator() + value2.toString();
        }

        @Override
        public Value evaluateIntegerExpression(int num1, int num2) {
            return new IntVal(num1 - num2);
        }

        @Override
        public Value evaluateBooleanExpression(boolean value1, boolean value2) {
            System.err.println("Invalid input for operator " + getOperator());
            return null;
        }
    },
    TIMES ("*") {
        @Override
        public String getStringValue(Expr value1, Expr value2) {
            return value1.toString() + getOperator() + value2.toString();
        }

        @Override
        public Value evaluateIntegerExpression(int num1, int num2) {
            return new IntVal(num1 * num2);
        }

        @Override
        public Value evaluateBooleanExpression(boolean value1, boolean value2) {
            System.err.println("Invalid input for operator " + getOperator());
            return null;
        }
    },
    DIV ("/") {
        @Override
        public String getStringValue(Expr value1, Expr value2) {
            return value1.toString() + getOperator() + value2.toString();
        }

        @Override
        public Value evaluateIntegerExpression(int num1, int num2) {
            return new IntVal(num1 / num2);
        }

        @Override
        public Value evaluateBooleanExpression(boolean value1, boolean value2) {
            System.err.println("Invalid input for operator " + getOperator());
            return null;
        }
    },
    EQ ("=") {
        @Override
        public String getStringValue(Expr value1, Expr value2) {
            return value1.toString() + getOperator() + value2.toString();
        }

        @Override
        public Value evaluateIntegerExpression(int num1, int num2) {
            return new BoolVal(num1 == num2);
        }

        @Override
        public Value evaluateBooleanExpression(boolean value1, boolean value2) {
            System.err.println("Invalid input for operator " + getOperator());
            return null;
        }
    },
    LT ("<") {
        @Override
        public String getStringValue(Expr value1, Expr value2) {
            return value1.toString() + getOperator() + value2.toString();
        }

        @Override
        public Value evaluateIntegerExpression(int num1, int num2) {
            return new BoolVal(num1 < num2);
        }

        @Override
        public Value evaluateBooleanExpression(boolean value1, boolean value2) {
            System.err.println("Invalid input for operator " + getOperator());
            return null;
        }
    },
    AND ("&") {
        @Override
        public String getStringValue(Expr value1, Expr value2) {
            return value1.toString() + getOperator() + value2.toString();
        }

        @Override
        public Value evaluateIntegerExpression(int num1, int num2) {
            System.err.println("Invalid input for operator " + getOperator());
            return null;
        }

        @Override
        public Value evaluateBooleanExpression(boolean value1, boolean value2) {
            return new BoolVal(value1 & value2);
        }
    },
    OR ("|") {
        @Override
        public String getStringValue(Expr value1, Expr value2) {
            return value1.toString() + getOperator() + value2.toString();
        }

        @Override
        public Value evaluateIntegerExpression(int num1, int num2) {
            System.err.println("Invalid input for operator " + getOperator());
            return null;
        }

        @Override
        public Value evaluateBooleanExpression(boolean value1, boolean value2) {
            return new BoolVal(value1 | value2);
        }
    };

    private String operator;

    BinOp(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public abstract String getStringValue(Expr value1, Expr value2);

    public abstract Value evaluateIntegerExpression(int num1, int num2);

    public abstract Value evaluateBooleanExpression(boolean value1, boolean value2);
}
