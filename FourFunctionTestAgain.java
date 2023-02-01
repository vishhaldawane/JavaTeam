public class FourFunctionTestAgain {
    public static void main(String[] args) {
        Banking bank = new Banking();

        bank.calculateSimpleInterest1(); //always 1450.0
        bank.calculateSimpleInterest2(7000,10,8.5f);
        bank.calculateSimpleInterest2(8000,15,3.5f);

        float ans = bank.calculateSimpleInterest3(5000,10,10.5f);
        System.out.println("ans is "+ans);

        float ans2 = bank.calculateSimpleInterest4();
        System.out.println(" ans2 is : "+ans2);

    }
}

class Banking
{
    //NO return               NO argument
    void calculateSimpleInterest1()
    {
        int p=5000; // the capital amount - OWN value
        int n=5; // number of years - OWN value
        float r=5.8F; // rate of interest - OWN value
        float si = (p * n * r)/100; // simple interest - OWN value
        System.out.println("si : "+si);
    }

    //NO return                  with argument p,n, r
    void calculateSimpleInterest2(int p, int n, float r)
    {
        float si = (p*n*r)/100;
        System.out.println(" si : "+si);
    }
    //WITH RETURN                   with argument p,n,r
    float calculateSimpleInterest3(int p, int n, float r)
    {
        float si = (p*n*r)/100;
        return si; //returning this value to main method
    }

    //WITH RETURN              NO ARGUMENT
    float calculateSimpleInterest4()
    {
        float si = (5000*5*5.8f)/100;
        return si;
    }
}


class Teacher
{ // THOUGHT + FEELING = ACTION + RESULT
    void eraseWhiteBoard()
    {
        //erasing everything / whole thing
    }
    void eraseWhiteBoard2(int rows, int column)
    {
        //erasing only certain portion of the whiteboard
    }
                    //20                20
    int eraseWhiteBoard3(int rows, int column) {
        int howManyCells = rows * column;
        return howManyCells; // 400 cells
    }

    int eraseWhiteBoard4() {
        int howMany = 10 * 5;
        return howMany;
    }
}







