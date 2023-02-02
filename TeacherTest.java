public class TeacherTest {
    public static void main(String[] args) {

        Camera myCam = new Camera();
        myCam.click1();
        myCam.click2(30);
        myCam.click3(20,3);
        int pics=myCam.click4(); //dont know how many clicks...
        System.out.println("total pics "+pics);
    /*
        Teacher teacherObj = new Teacher();
        teacherObj.teach();
        teacherObj.giveAssignments();
        teacherObj.checkAssignments();

        teacherObj.eraseWhiteBoard1(); //no arguments

        teacherObj.eraseWhiteBoard2(10,30); //arguments

        int erased1=teacherObj.eraseWhiteBoard3(12,18); //arguments
        System.out.println("characters erased1 : "+erased1);

        int erased2=teacherObj.eraseWhiteBoard4(); // no arguments
        System.out.println("characters erased2 : "+erased2);
*/

    }
}
class Camera
{
    String model;
    int totalPicturesClicked;
    String lensType;
    int x;
    int y;
    void deletePics() {

        System.out.println("x is "+x);
        System.out.println("y is "+y);
        totalPicturesClicked--;
    }
    void click1() {

        System.out.println("x is "+x);
        System.out.println("y is "+y);
        System.out.println("Camera is clicked...");
        totalPicturesClicked++;
    }

    void click2(int pictures) {
        System.out.println("camera clicked "+pictures+" Pics");
    }

    void click3(int pictures, int lightEffect) {
        System.out.println("camera clicked "+pictures+ " pics in "+lightEffect+" Light Effect");
    }
    int click4() { // total pictured clicked
        System.out.println("camera is always clicking 10 pics");
        return 10;
    }
}
class Teacher
{
    //no return no arg
    void eraseWhiteBoard1() {
        System.out.println("Erasing the white board....");
    }

    //no return        with arguments
    void eraseWhiteBoard2(int r,int c) {
        System.out.println("Erasing the white board for " + r + " Lines and " + c + " Columns");
    }

    //with return          with arguments
    int eraseWhiteBoard3(int rows, int columns)
    {
        System.out.println("Erasing the white board for " + rows + " Lines and " + columns + " Columns");
        int totalCharactersErased = rows * columns;
        return totalCharactersErased; //int is returned here
    }

    //with return          without arguments
    int eraseWhiteBoard4()
    {
        System.out.println("Erasing the white board ");
        int totalCharactersErased = 20 * 50;// 1000
        return totalCharactersErased; //int is returned here
    }

    //no return no arg
    void teach() {
        System.out.println("Teacher is teaching...");
    }

    //no return no arg
    void giveAssignments() {
        System.out.println("Teacher is giving assignments..");
    }

    //no return no arg
    void checkAssignments() {
        System.out.println("teacher is checking assignments..");
    }
}
/*
    Naming convention in Java

    ClassName - every word's first letter to be capitalized
                e.g.,
                Player, BankAccount, DriverManager

    methodName - except the first word, all the successive
                 word's initial letter to be capitalized

                 playerShoeSize(), setLookAndFeel()
                 openMyBankAccount(), clearTheScreen()

    variable name - rule is same as of methodName

                rollNumber, accountNumber
                socialSecurityNumber



 */