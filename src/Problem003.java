import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem003
{
    private static int multiplyNumbers(int x, int y) {
        return x * y;
    }

    // method to extract the multiplier pattern from string of text
    static ArrayList<String> multipliersInString(String str) {
        ArrayList<String> multiplierList = new ArrayList<>();
        Matcher matcher = Pattern.compile("mul").matcher(str);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }

    // convert extracted multipliers into array of multipliers


    public static void main(String[] args)
    {
        String testString = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";

        String[] multipliers = multipliersInString(testString);
        System.out.println(Arrays.toString(multipliers));

    }
}
