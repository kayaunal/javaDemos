public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean sonuc = false;

        for (int i = 0; i <= sayilar.length; i++) {
            if (aranacak == i) {
                sonuc = true;
                break;
            }
        }
        if (sonuc == true) {
            System.out.println(aranacak + " sayısı dizi içerisinde mevcuttur");
        } else {
            System.out.println("Mevcut değildir");
        }
    }
}