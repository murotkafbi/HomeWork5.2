import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] payments;
        payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц  составила " + sum + " рублей ");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int min = payments[0];
        int max = payments[0];
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > max) {
                max = (payments[i]);
            }
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Минимальная сумма трат за день составила " + min + " Рублей. Максимальная сумма трат за день составила " + max + " рублей");
        }

        java.util.Random random = new java.util.Random();

        {
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] payments;
        payments = generateRandomArray();
        System.out.println(Arrays.toString(payments));
        int sum = 0;
        for (int i = 0; i < payments.length; i++) {
            sum = sum + payments[i];
        }
        System.out.println("Сумма трат за месяц  составила " + (double) sum/ payments.length + " рублей ");
    }



    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1 ; i >= 0 ; i--) {
            System.out.print(reverseFullName[i]);
            System.out.println();
        }
    }
    public static int[] generateRandomArat() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }
    }

