/*
        90 - 100 A - awesome
        75 - 89  B - brilliant
        60 - 74  C - charasmatic
        45 - 59  D - deadly
        35 - 44  E - excellent
        1  - 34  F - fantastic

 */
public class GradeTest2 {

    public static void main(String[] args) {

           Student studentObj1 = new Student();
           Student studentObj2 = new Student();
           Student studentObj3 = new Student();

           studentObj1.setStudent("Sandeep",94.00f);
           studentObj2.setStudent("Jack",64.4f);
           studentObj3.setStudent("Janet",73.4f);

           studentObj1.calculateGrade(); //internally invokes printGradeCard();
           studentObj2.calculateGrade();
           studentObj3.calculateGrade();


    }
}

class Student
{
    char yourGrade; //must be surrounded by single quotes
    String yourName; // must be surrounded by double quotes
    float yourMarks;

    void setStudent(String yn, float ym) { //mutation on name and marks
        System.out.println("setting the initial name and marks for the student....");
        yourName=yn;
        yourMarks=ym;
    }
    //no return     no argument
    void calculateGrade() //mutation to the grade
    {
        if(yourMarks >=1 && yourMarks <35) // 34.99999999999999999 is included, but not 35
            yourGrade='F';
        else if(yourMarks >=35 && yourMarks <45)
            yourGrade='E';
        else if(yourMarks >=45 && yourMarks <65)
            yourGrade='D';
        else if(yourMarks >=65 && yourMarks <75)
            yourGrade='C';
        else if(yourMarks >=75 && yourMarks <90)
            yourGrade='B';
        else if(yourMarks >=90 && yourMarks <=100)
            yourGrade='A';

        printGradeCard(); //no need of .(dot) here ...
    }
    void printGradeCard() //non-mutator
    {
        System.out.println(yourName+", your marks are :"+yourMarks+" hence your grade is : "+yourGrade);
    }
}
