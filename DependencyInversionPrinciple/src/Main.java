public class Main {
    public static void main(String[] args) {
        Kullanici kullanici = new Kullanici("muhammedsafayilmaz56@gmail.com","192.1.1.1","05055444286","safa yılmaz");
        Haber haber = new Haber();

        haber.bilgilendir(kullanici,"deneme mesajı");
    }
}