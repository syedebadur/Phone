public interface Telephone {

    void powerOn();
    void dial(String phoneNo);
    void answer();
    boolean receivePhone(String phoneNo);
    boolean isRinging();
}
