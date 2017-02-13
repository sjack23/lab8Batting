import java.util.Scanner;

/**

 * Created by Sharron on 2/10/2017.
 */
public class Lab8 {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Welcome to the Batting Average Calculator! ");

        //Ask user to enter number of bats
        System.out.println("Enter number of at bats");

        //get user input - number of at bats
        int atBats = scan.nextInt();

        //ask user for the number of bases earned
        System.out.println("Enter number of bases earned? ");
        double[] atBatsArray = new double[atBats];
        //get user input - number of bases earned
        for (int i = 0; i < atBats; i++) {

            atBatsArray[i] = scan.nextInt();
        }

        //stub out: implement method and insert code

        //Display batting average - create a method - to create a variable you need datatype - calculate avg
        double batAvg = calculateBatAverage (atBatsArray);          //Calling the method
        System.out.println("batting average is " + batAvg);

        //Display slugging percentage
        double slugPercent = calculateSlugPercent(atBatsArray);//this is a method
        System.out.println("slugging percentage is " + slugPercent);

        //place a while or do while here if needed

    }
    /*
       This method calculates the slug percent
     */
    public static double calculateSlugPercent(double[] atBatsArray) {
        int Total = 0;
        for(int i=0; i < atBatsArray.length; i++){//use this to get percentage
            Total += atBatsArray[i];
        }
        System.out.println("Percent is: ");
        double slugPercent= (double) Total / atBatsArray.length;


        return slugPercent;
    }

    /*
    This method calculates batting avg
     */
    public static double calculateBatAverage(double[] atBatsArray) {

        int Total = 0;
        for(int i=0; i < atBatsArray.length; i++){//use this to get percentage


            if (atBatsArray[i] > 0){

            Total = Total + 1;
            }

        }
        System.out.println("Percent is: ");
        double batAverage = (double) Total / atBatsArray.length;

        return batAverage;
        }



        }
