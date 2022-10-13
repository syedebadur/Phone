public class Main {

    public static void main(String[] args) {

        DeskPhone d1 = new DeskPhone("1234567");

        DeskPhone d2 = new DeskPhone("123");

        d1.powerOn();
        d2.powerOn();

        boolean callHoPayi = d1.receivePhone("1234567");

        if (callHoPayi == true){
            System.out.println("call hogayi hai");
        }
        else {
            System.out.println("Galat Jawaab");
        }
        d1.answer();

        MobilePhone m1 = new MobilePhone("1234");

        m1.powerOn();

        m1.dial("1234");

        m1.receivePhone("1234");
    }
}
