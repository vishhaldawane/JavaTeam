public class UncheckedExceptionTest {
    public static void main(String[] args) {
        System.out.println("Begin of main");

        try {        //             11
                     //   012345678901
                     //   ||||||||||||
            String str = "I LiKe Nepal";

            System.out.println("str : " + str);
            System.out.println("str : " + str.substring(2, 6)); // 6-1
            System.out.println("str : " + str.toUpperCase());
            System.out.println("str : " + str.charAt(17));
            System.out.println("str : " + str.toLowerCase());
            System.out.println("End of main");
        }
        catch(NullPointerException e) {
            System.out.println("string is null...");
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("Please check the string's index lower and upper limits..");

        }
    }

}
