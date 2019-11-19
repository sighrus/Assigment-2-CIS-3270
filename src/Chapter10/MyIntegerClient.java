package Chapter10;

public class MyIntegerClient {
    public static void main(String[] args) {
        MyInteger int1 = new MyInteger(37);
        MyInteger int2 = new MyInteger(16);
        MyInteger int3 = new MyInteger(16);

        System.out.println(int1.getValue() + " is prime? " + int1.isPrime());
        System.out.println(int2.getValue() + " is prime? " + int2.isPrime());

        System.out.println(int1.getValue() + " is even? " + int1.isPrime());
        System.out.println(int2.getValue() + " is even? " + int2.isPrime());

        System.out.println("is 17 odd? " +  MyInteger.isOdd(93));

        System.out.println("Does " + int2.getValue() + " equal to " + int3.getValue() + "? " + int2.equals(int3));

        System.out.println(MyInteger.parseInt(new char[] {'5', '1', '3'}));
        System.out.println(MyInteger.parseInt("454"));
    }
}
