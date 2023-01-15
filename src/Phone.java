public interface Phone {

    boolean powerOn();
    void callNumber(String phoneNumber);
    void receiveCall(String phoneNumber);
    boolean answerCall();
    boolean isRinging();

}
