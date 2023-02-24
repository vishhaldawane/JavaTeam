public class ArraysOfObjectTest {
    public static void main(String[] args) {

       /*
        Cricketer cricketer1 = new Cricketer(1,"Sachin","India",89); //look at round brackets at ctor call
        Cricketer cricketer2 = new Cricketer(2,"Virat","India",85);
        Cricketer cricketer3 = new Cricketer(3,"Sehvag","India",95);
        Cricketer cricketer4 = new Cricketer(4,"Dhoni","India",112);
        Cricketer cricketer5 = new Cricketer(5,"Yuvraj","India",79);
      */
        Cricketer cricketTeam[] = new Cricketer[11]; //IInd way - 5 references are created
        try {
            // 0 1 2 3 4 5 6 7 8 9 10
            // i i n i i i n n n i n  = 5 are null and 6 are intialized

            cricketTeam[4] = new Cricketer(1,"Sachin","India",89,50.5f);
            cricketTeam[0] = new Cricketer(2,"Virat","India",85,45.6f);
            cricketTeam[1] = new Cricketer(3,"Sehvag","India",95,90.5f);
            cricketTeam[5] = new Cricketer(4,"Dhoni","India",112,99.5f);
            cricketTeam[9] = new Cricketer(5,"Yuvraj","India",79,78.5f);

        //there is no room for this new 6th object

            cricketTeam[3] = new Cricketer(6, "Jack", "Some", 74, 48.5f);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Handler : "+e); //e means exception name + msg
        }

       // try {
            for (int i = 0; i < cricketTeam.length; i++) {
                if (cricketTeam[i] != null) {
                    System.out.println(cricketTeam[i].getPlayerName() + " from " + cricketTeam[0].getCountry() + " made " + cricketTeam[0].getCurrentScore() + " runs whose strike rate is " + cricketTeam[i].getStrikeRate());
                }
            }
        //}
        /*catch(NullPointerException e) {
            System.out.println("Object is null");
        }*/
    }
}

class Cricketer
{
    int rank;
    String playerName;
    String country;
    int currentScore;
    float strikeRate;

    public Cricketer(int rank, String playerName, String country, int currentScore, float strikeRate) {
        this.rank = rank;
        this.playerName = playerName;
        this.country = country;
        this.currentScore = currentScore;
        this.strikeRate = strikeRate;
    }

    public float getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(float strikeRate) {
        this.strikeRate = strikeRate;
    }

    @Override
    public String toString() {
        return "Cricketer{" +
                "rank=" + rank +
                ", playerName='" + playerName + '\'' +
                ", country='" + country + '\'' +
                ", currentScore=" + currentScore +
                '}';
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }
}


/*

  System.out.println(cricketer1.getPlayerName()+" cricketer1 : "+cricketer1.getCurrentScore());
        System.out.println(cricketer2.getPlayerName()+" cricketer2 : "+cricketer2.getCurrentScore());
        System.out.println(cricketer3.getPlayerName()+" cricketer3 : "+cricketer3.getCurrentScore());
        System.out.println(cricketer4.getPlayerName()+" cricketer4 : "+cricketer4.getCurrentScore());
        System.out.println(cricketer5.getPlayerName()+" cricketer5 : "+cricketer5.getCurrentScore());


 */


   /*
            int score1[] = { 10,20,30,40,50 }; // max range is 5   Ist way

            int score2[] = new int [ 11 ];     // max range is 11  IInd way

        //        0  1  2  3  4  5  6  7  8  9  10
          //      78 0  18 66 0  0  0  58 28 75 0

        //random assignment done below, not necessary to set in order
            score2[0]=78;
            score2[8]=28;
            score2[2]=18;
            score2[7]=58;
            score2[9]=75;
            score2[3]=66;

            for (int i=0;i<score2.length;i++) {
                System.out.println("score : "+score2[i]);
            }
         */