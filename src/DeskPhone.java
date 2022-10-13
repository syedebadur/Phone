public class DeskPhone implements Telephone{

    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
        this.isRinging = false;
    }

    @Override
    public void powerOn() {

        System.out.println("DeskPhone is always On");
    }

    @Override
    public void dial(String phoneNo) {

        System.out.println("Dialing the phoneNo: " + phoneNo);
    }

    @Override
    public void answer() {
        if (isRinging()==true){
            System.out.println("Answer the Phone");
            isRinging = false;
        }
        else {
            System.out.println("No phone is coming");
        }
    }

    @Override
    public boolean receivePhone(String phoneNo) {
        if (phoneNo == myNumber){
            isRinging = true;
            System.out.println("Phone is Ringing/ Called");
        }
        else {
            isRinging = false;
            System.out.println("Wrong No. and phone is not Ringing");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
