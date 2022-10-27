public class Telefon implements IIletisim{
    public void smsGonder(String telefon,String mesaj){
        System.out.println(telefon + " adresine " + mesaj + " gönderildi.");
    }
    @Override
    public void bilgiGonder(Kullanici kullanici, String mesaj) {
        smsGonder(kullanici.getTelefon(),mesaj);
    }
}
