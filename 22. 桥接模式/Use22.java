public class Use22 {

    public static void main(String[] args){

        PhoneA phoneA = new PhoneA();
        phoneA.setPhoneFunc(new PhoneFuncGame());
        phoneA.operate();

        phoneA.setPhoneFunc(new PhoneFuncConnect());
        phoneA.operate();

        PhoneB phoneB = new PhoneB();
        phoneB.setPhoneFunc(new PhoneFuncConnect());
        phoneB.operate();

        phoneB.setPhoneFunc(new PhoneFuncGame());
        phoneB.operate();

    }

}
