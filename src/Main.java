public class Main {
    public static void main(String[] args) {

        Landline l1 = new Landline("1111");
        Landline l2 = new Landline("222");
        l1.callNumber("1111");
        l2.receiveCall("1111");
        System.out.println(l2.answerCall());
    }

}