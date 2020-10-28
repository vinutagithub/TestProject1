public class Calculator_class {
    int a;
    int b;

    public Calculator_class(){}

    public Calculator_class(int a, int b){

        this.a = a;
        this.b = b;

    }

    private float multiplication(int a, int b) {
        new Calculator_class(a,b);
        return (a*b);
    }

    private int subtraction(int a, int b) {
        new Calculator_class(a,b);
        return(a-b);
    }

    public int addition(int a, int b) {
        new Calculator_class(a,b);
        return(a+b);
    }
}
