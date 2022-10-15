public class Main {
    public static void main(String[] args) {
        char harf = 'B';
        if (harf == 'A' || harf == 'E' || harf == 'I' || harf == 'İ' || harf == 'O' || harf == 'Ö' || harf == 'U' || harf == 'Ü') {
            System.out.println("Sesli harftir");
        } else {
            System.out.println("Sesli harf değildir.");
        }
    }
}