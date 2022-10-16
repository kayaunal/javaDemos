public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();
        System.out.println("Hello world!");

        GameCalculator gameCalculator = new WomanGameCalculator();
    }
}