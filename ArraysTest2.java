import java.sql.SQLOutput;

public class ArraysTest2 {
    public static void main(String[] args) {
    //indian team score
        /*
                Array = group of variables/data of common type [ int is the common type here ]
                        stored in consecutive memory 89,69,79 and so on in consecutive memory
                        referred by common name [ indianCricketTeam ]

                        size of array is FIXED once it is issued
                        IT CANNOT CHANGE AT ANY POINT IN TIME,
                        NEITHER INCREASED NOR DECREASED

                can u think of arrays of objects ???

         */
                                // 0   1  2  3  4  5  6  7  8  9  10 = 0 to 10 = 11 values
        int indianCricketTeam[]= { 89, 69,79,39,89,18,19,19,17,13,10}; //length is 11
        int australianCricketTeam[]= { 59, 39,19,8,5,18,29,69,97,23,10}; //length is 11

        int totalScoreOfIndia =  0;
        int totalScoreOfAus = 0;

                //0  I <  11  MEANS 0 TO 10 = means total 11 time to run this loop
        for(int i=0; i < indianCricketTeam.length;i++) {
            System.out.println( (i+1) + " batsman : "+indianCricketTeam[i]);
            totalScoreOfIndia = totalScoreOfIndia + indianCricketTeam[i]; // 0 + 89
        }

        System.out.println("total score of india : "+ totalScoreOfIndia);

        System.out.println("=======================");

        //0  I <  11  MEANS 0 TO 10 = means total 11 time to run this loop
        for(int i=0; i < australianCricketTeam.length;i++) {
            System.out.println( (i+1) + " batsman : "+australianCricketTeam[i]);
            totalScoreOfAus = totalScoreOfAus + australianCricketTeam[i]; // 0 + 89
        }

        System.out.println("total score of australia : "+ totalScoreOfAus);

        System.out.println("India won by : "+( totalScoreOfIndia-totalScoreOfAus )+ " runs ");
    }
}



     /* System.out.println("1 batsman  : " + indianCricketTeam[0]);//physical 0 is logically first
        System.out.println("2 batsman  : " + indianCricketTeam[1]);
        System.out.println("3 batsman  : " + indianCricketTeam[2]);
        System.out.println("4 batsman  : " + indianCricketTeam[3]);
        System.out.println("5 batsman  : " + indianCricketTeam[4]);
        System.out.println("6 batsman  : " + indianCricketTeam[5]);
        System.out.println("7 batsman  : " + indianCricketTeam[6]);
        System.out.println("8 batsman  : " + indianCricketTeam[7]);
        System.out.println("9 batsman  : " + indianCricketTeam[8]);
        System.out.println("10 batsman  : " + indianCricketTeam[9]);
        System.out.println("11 batsman  : " + indianCricketTeam[10]);
*/