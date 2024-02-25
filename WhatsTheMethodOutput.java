package week7;
/*
public class WhatsTheMethodOutput {
    public static void main(String[] args) {
        short CENTURY;
        int thisYear;
        int nextYear;
        int thisMonth;
        int february;
        double twentyNine;

        CENTURY = 20; // Set breakpoint here
        thisYear = 2024; // Set breakpoint here
        nextYear = thisYear + 1; // Set breakpoint here
        thisMonth = 2; // Set breakpoint here
        february = 28; // Set breakpoint here
        twentyNine = 29.0; // Set breakpoint here
        thisYear = 2025; // Set breakpoint here
    }
}
*/

//=================================================================================================
public class WhatsTheMethodOutput {
    //-------------------------------------------------------------------------------------------------
    private static final short CENTURY = 2000;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int thisYear = 2010;
        int nextYear;
        int thisMonth;

        nextYear = ++thisYear + CENTURY % 333;

        thisMonth = leap(nextYear,28);
        System.out.println(thisYear + " " + nextYear + " " + thisMonth);
    }
    //-------------------------------------------------------------------------------------------------
    private static int leap(int february,double twentyNine) {

        double thisYear;

        thisYear = february + twentyNine/8;
        february = 2;
        System.out.println((thisYear + twentyNine));
        return((int)thisYear + february + (short)twentyNine);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================


/*
short CENTURY       2000
int thisYear        2010    2011
int nextYear        0       2013
int thisMonth       0
int february        2013    2
double twentyNine   28.0
double thisYear     2016.5



 */
