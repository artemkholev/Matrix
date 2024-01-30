public class ComplexNum {
    private final double r, i;

    //constructors
    public ComplexNum() {
        r = 0;
        i = 0;
    };
    public ComplexNum(double x) {
        r = x;
        i = 0;
    };
    public ComplexNum(double x, double y) {
        r = x;
        i = y;
    };

    //print
    public String toString() {
        if (i == 0) return r + "";
        if (r == 0) return i + "i";
        if (i > 0) return r + " + " + i + "i";
        return r + " - " + (-i) + "i";
    }
    double r() {
        return r;
    }
    double i() {
        return i;
    }

    //operations
    public ComplexNum sum(ComplexNum secondNum) {
        ComplexNum firstNum = this;
        double newR = firstNum.r + secondNum.r;
        double newI = firstNum.i + secondNum.i;
        return new ComplexNum(newR, newI);
    }

    public ComplexNum sub(ComplexNum secondNum) {
        ComplexNum firstNum = this;
        double newR = firstNum.r - secondNum.r;
        double newI = firstNum.i - secondNum.i;
        return new ComplexNum(newR, newI);
    }

    public ComplexNum mul(ComplexNum secondNum) {
        ComplexNum firstNum = this;
        double newR = firstNum.r * secondNum.r + firstNum.i * secondNum.i;
        double newI = firstNum.r * secondNum.i + firstNum.i * secondNum.r;
        return new ComplexNum(newR, newI);
    }

    public ComplexNum  revCom() {
        double scale = r * r + i * i;
        return new ComplexNum(r / scale, -i / scale);
    }
    public ComplexNum d(ComplexNum secondNum) {
        ComplexNum firstNum = this;
        return firstNum.mul(secondNum.revCom());
    }
}
