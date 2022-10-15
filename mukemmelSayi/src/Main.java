public class Main {
    public static void main(String[] args) {
        int number = 28;
        int sonuc = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sonuc = sonuc + i;
            }
        }
        if (sonuc == number) {
            System.out.println("Mükemmel sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir");
        }
    }
}