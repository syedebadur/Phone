public class MobilePhone implements Telephone{

    private String myNumber;
    private boolean isRinging;
    boolean powerOn;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
        this.powerOn = false;
    }

    @Override
    public void powerOn() {

        this.powerOn = true;
        System.out.println("DeskPhone is always On");
    }

    @Override
    public void dial(String phoneNo) {

        if (powerOn == true)
        System.out.println("Dialing the phoneNo: " + phoneNo);
        else {
            System.out.println("Power is not On");
        }
    }

    @Override
    public void answer() {
        if (isRinging()==true && powerOn == true){
            System.out.println("Answer the Phone");
            isRinging = false;
        }
        else {
            System.out.println("No phone is coming Or Power if Off");
        }
    }

    @Override
    public boolean receivePhone(String phoneNo) {
        if (phoneNo == myNumber && powerOn == true){
            isRinging = true;
            System.out.println("Phone is Ringing/ Called");
        }
        else {
            isRinging = false;
            System.out.println("Wrong No. and phone is not On");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
