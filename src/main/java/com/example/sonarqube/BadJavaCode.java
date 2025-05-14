public class BadJavaCode {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = a / b; // division by zero - will cause runtime exception
        System.out.println("Result: " + c);

        String x = "Hello";
        String y = "Hello";
        if (x == y) { // using == instead of .equals() for strings
            System.out.println("Same");
        }

        int[] arr = new int[5];
        for (int i = 0; i < 10; i++) { // array index out of bounds
            arr[i] = i;
        }

        int d = 100;
        int e = 200;
        int f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        if (true) {
            if (true) {
                if (true) {
                    System.out.println("Too deep!");
                }
            }
        }

        int g = 0; // unused variable
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    int temp = i * j * k;
                    // does nothing with temp
                }
            }
        }

        int h = 5;
        int i = 10;
        int result = h + i;
        int result2 = h + i;
        int result3 = h + i;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
