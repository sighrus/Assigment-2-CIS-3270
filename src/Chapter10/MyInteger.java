package Chapter10;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
        if (value == 1 || value == 2) {
            return true;
        }
        else {
            for (int i = 2; i < value; i++) {
                if (i % value == 0)
                    return false;
            }
        }
        return true;
    }

    public static boolean isEven(int MyInteger) {
        return MyInteger % 2 == 0;
    }

    public static boolean isOdd(int MyInteger) {
        return MyInteger % 2 == 1;
    }

    public static boolean isPrime(int MyInteger) {
        if (MyInteger == 1 || MyInteger == 2) {
            return true;
        }
        else {
            for (int i = 2; i < MyInteger; i++) {
                if (i % MyInteger == 0)
                    return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger MyInteger) {
        return MyInteger.isEven();
    }

    public static boolean isOdd(MyInteger MyInteger) {
        return MyInteger.isOdd();
    }

    public static boolean isPrime(MyInteger MyInteger) {
        return MyInteger.isPrime();
    }

    public boolean equals(int value) {
        if (value == this.value)
            return true;
        return false;
    }

    public boolean equals(MyInteger MyInteger) {
        if (MyInteger.value == this.value)
            return true;
        return false;
    }

    public static int parseInt(char[] value) {
        int num = 0;
        for (int i = 0; i < value.length; i++) {
            num = 10 * num + (int) (value[i] - '0');
        }
        return num;
    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }
}
