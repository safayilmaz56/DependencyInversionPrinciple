import java.util.ArrayList;

public class Haber {
    private Mail mail;
    private Bildirim bildirim;
    private Telefon telefon;
    private ArrayList<IIletisim> iIletisimListesi;
    public Haber(){
        iIletisimListesi = new ArrayList<>();
        mail = new Mail();
        bildirim = new Bildirim();
        telefon = new Telefon();
        iIletisimListesi.add(bildirim);
        iIletisimListesi.add((IIletisim) mail);
        iIletisimListesi.add(bildirim);
    }
    public void bilgilendir(Kullanici kullanici,String mesaj){
        for (IIletisim iIletisim : iIletisimListesi){
            iIletisim.bilgiGonder(kullanici,mesaj);
        }
    }
}
