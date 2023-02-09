public class PhoneTest {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        //every numerical value is of int type

        //byte short int long

        byte x=9;
        long mobile=9820443464L; //push L as to say long value
        byte cc=91;
        myPhone.dial("Sailee");
        myPhone.dial(x);
        myPhone.dial(mobile);
        myPhone.dial();
        myPhone.dial(cc,mobile);
        myPhone.dial(mobile,cc);

    }
}
/*

    Function overloading
    -------------------------

    It is possible to write "multiple functions"
    having "same name", and they can be "differentiated "
    based on their

    1. type of arguments
    2. number of arguments
    3. sequence of arguments

 */
class Phone
{
    void dial() { //no return - no argument
        System.out.println("dialing nowhere...");
    }

    void dial(String herName) {
        System.out.println("dial(String) : dialing to..."+herName);
    }

    void dial(byte speedDialCode) {
        System.out.println("dial(byte) : dialing to speed dial : "+speedDialCode);
    }

    void dial(long mobileNumber) {
        System.out.println("dial(long) : dialing to mobile number : "+mobileNumber);
    }

    void dial(byte countryCode, long mobileNumber) {
        System.out.println("dial(byte,long) : dialing to country code : "+countryCode+" mobile number : "+mobileNumber);
    }
    void dial(long mobileNumber, byte countryCode) {
        System.out.println("dial(long,byte) : dialing to country code : "+countryCode+" mobile number : "+mobileNumber);
    }
}
