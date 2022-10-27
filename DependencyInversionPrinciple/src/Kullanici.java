public class Kullanici {
    private String mail;
    private String ip;
    private String telefon;
    private String isim;

    public String getMail() {
        return mail;
    }

    public Kullanici(String mail, String ip, String telefon, String isim) {
        setMail(mail);
        setIsim(isim);
        setIp(ip);
        setTelefon(telefon);
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
