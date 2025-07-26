import Phones.Iphone;
import Phones.Nokia3310;
import Phones.Phone;

public class Main {
    public static void main(String[] args) {
        // Call the Phones

//        Phone phone = new Phone();
//        phone.features();
//
//        Nokia3310 nokia = new Nokia3310();
//        nokia.features();
//
//        Iphone iphone = new Iphone();
//        iphone.features();


        //     Best Approch to calling     //
        Phone phone; //*** This is the refference
        phone = new Phone();
        phone.features();

    }
}