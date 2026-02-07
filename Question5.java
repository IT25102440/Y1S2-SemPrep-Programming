class Calculator{
    public int add(int a, int b){
        int c = a + b;
        return c;
    }
    public int multiply(int a, int b){
        int c = a * b;
        return c;
    }
    public int square(int a){
        int b = a*a;
        return b;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int a = cal.square(cal.add(cal.multiply(3,4),cal.multiply(5,7)));
        System.out.println(a);
        int b = cal.add(cal.square(cal.add(4,7)),cal.square(cal.add(8,3)));
        System.out.println(b);
    }
}
