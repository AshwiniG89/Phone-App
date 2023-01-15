public class Landline implements Phone{

    private String myPhoneNo;
    private boolean isRinging;
    private boolean isPowerOn;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        isRinging = false;
        isPowerOn =true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    @Override
    public boolean powerOn() {
        return false;
    }

    @Override
    public void callNumber(String phoneNumber) {
        if(isPowerOn == true){
            System.out.println("You are dialing the number: "+phoneNumber);
        }
        else{
            System.out.println("Your landline is off");
        }
    }

    @Override
    public void receiveCall(String phoneNumber) {
        if(isPowerOn && myPhoneNo.equals((phoneNumber))){
            this.isRinging = true;
            System.out.println("You are receiving call from"+phoneNumber+"number");
        }else{
            System.out.println(" Power off");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging == true){
            System.out.println("Call answered");
            this.isRinging = false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
