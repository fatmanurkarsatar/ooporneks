public class abstract_class_ornek {
    abstract class user{

        abstract void showInfo();

        void calculatePrice(){
            System.out.println("indirim hesapla");
        }

    }

    class PremiumUser extends user{

        @Override
        void showInfo() {
            System.out.println("kullanıcı bilglerini göster");

        }

        @Override
        void calculatePrice(){
            super.calculatePrice();
            System.out.println("indirim hesapla ek işlemler");
        }
    }
public class Main {
    public void main(String[] args) {

        PremiumUser pUser = new PremiumUser();

        pUser.showInfo();

        pUser.calculatePrice();
    }

}


}
