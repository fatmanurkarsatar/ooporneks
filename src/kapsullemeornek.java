public class kapsullemeornek {
    private String name;
    private String last_name;
    private int no;
    private String ogrenci_bilgileri;

    public String ogrenci_bilgileri(){

        return ogrenci_bilgileri;
    }

    public void setOgrenci_bilgileri(String ogrenci_bilgileri){
        this.ogrenci_bilgileri= ogrenci_bilgileri;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getLast_name(){
        return last_name;
    }
    public void setlast_name(String last_name){
        this.last_name=last_name;
    }
    public int getno(){
        return no;
    }
    public void setno(int no){
        this.no=no;
    }

    public static void main(String[] args) {
        kapsullemeornek ko = new kapsullemeornek();

        ko.setname("nur");
        ko.setlast_name("karsatar");
        ko.setno(19896532);

        System.out.println("adı = " + ko.getname());
        System.out.println("soyadı = " + ko.getLast_name());
        System.out.println("numarası = " + ko.getno());
    }
}

