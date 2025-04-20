import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem002
{

    public static void main(String[] args)
    {
        File dataFile = new File("data/problem002.dat");
        int safeReports = 0;    // final answer
        ArrayList<Integer> currentReport = new ArrayList<>();

//        boolean numbersIncreasingTrue = allNumbersIncreasing(currentReport);
//        boolean numbersDecreasingTrue = allNumbersDecreasing(currentReport);
//        boolean noneGreaterThanTwo = notGreaterThanTwo(currentReport);
//        System.out.println(numbersIncreasingTrue);
//        System.out.println(numbersDecreasingTrue);
//        System.out.println(noneGreaterThanTwo);

        try
        {
            Scanner reportScanner = new Scanner(dataFile);

            while (reportScanner.hasNext())
            {
                String numberString = reportScanner.nextLine();
                String regex = " ";
                String[] currentReportStringArray = numberString.split(regex);

                for (String s : currentReportStringArray)
                {
                    int stringAsNumber = Integer.parseInt(s);
                    currentReport.add(stringAsNumber);    // step thru and reset working
                }
                /* safe report check logic here*/

                if ((allNumbersIncreasing(currentReport) ||
                    allNumbersDecreasing(currentReport)) &&
                    (notGreaterThanThree(currentReport)))
                {
                    safeReports++;
                }

                currentReport = new ArrayList<>();
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("can't read file");
            System.out.println(e.getMessage());
        }

        System.out.println("There are " + safeReports + " SAFE reports in the data.");

    }

    // method to check if numbers are all increasing and return true
    public static boolean allNumbersIncreasing(ArrayList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size() - 1; i++)
        {
            if (numbers.get(i) >= numbers.get(i + 1))
            {
                return false;
            }
        }

        return true;
    }

    // method to check if numbers are all decreasing and return true
    public static boolean allNumbersDecreasing(ArrayList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size() - 1; i++)
        {
            if (numbers.get(i) <= numbers.get(i + 1))
            {
                return false;
            }
        }

        return true;
    }

    // method to check if all numbers are less than 3 in difference and return true
    public static boolean notGreaterThanThree(ArrayList<Integer> numbers)
    {
        for (int i = 0; i < numbers.size() - 1; i++)
        {
            int difference = Math.abs(numbers.get(i) - numbers.get(i + 1));

            if (difference > 3)
            {
                return false;
            }
        }

        return true;
    }
}
