/*
        90 - 100 A - awesome
        75 - 89  B - brilliant
        60 - 74  C - charasmatic
        45 - 59  D - deadly
        35 - 44  E - excellent
        1  - 34  F - fantastic

 */
public class GradeTest {

    public static void main(String[] args) {
        //hard work
            char yourGrade='U'; //must be surrounded by single quotes
            String yourName="Sandeep"; // must be surrounded by double quotes
            float yourMarks=74.50f;

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

        System.out.println(yourName+", your marks are :"+yourMarks+" hence your grade is : "+yourGrade);
    }
}
