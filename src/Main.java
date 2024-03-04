public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);

        n = n * 3;

        n += Integer.parseInt("10101", 2); // Add binary number 10101 to the result
        n += Integer.parseInt("FF", 16);   // Add hexadecimal number FF to the result
        n *= 6;

        System.out.println(n);

        while(n > 9)
            n = sumOfDigits(n);

        System.out.println(n);

        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);

    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

