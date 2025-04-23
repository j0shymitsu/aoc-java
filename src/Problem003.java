import java.util.ArrayList;

public class Problem003
{
    private static int multiplyNumbers(int x, int y) {
        return x * y;
    }

    static ArrayList<Character> stringToArray(String str) {
        ArrayList<Character> characterList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            characterList.add(str.charAt(i));
        }

        return characterList;
    }

    // unfinished (testing) -  remove valueOf only removes first instance
    static ArrayList<Character> cleanInput(ArrayList<Character> charList) {
        charList.remove(Character.valueOf('m'));
        return charList;
    }

    public static void main(String[] args)
    {
        String testString = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";
        ArrayList<Character> stringAsList = stringToArray(testString);
        cleanInput(stringAsList);

        for (Character c : stringAsList) {
            System.out.print(c);
        }

    }
}
