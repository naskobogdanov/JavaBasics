import java.util.ArrayList;
import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputOne = scanner.nextLine();
        String inputTwo = scanner.nextLine();

        ArrayList<Character> listOne = new ArrayList<Character>();
        ArrayList<Character> finalList = new ArrayList<Character>();
        for (char c : inputOne.toCharArray()) {
            if (c != ' '){
                listOne.add(c);
                finalList.add(c);
            }
        }

        ArrayList<Character> listTwo = new ArrayList<Character>();
        for (char c : inputTwo.toCharArray()) {
            if (c != ' '){
                listTwo.add(c);
            }
        }

        for (int i = 0; i < listTwo.size(); i++) {
            if (!listOne.contains(listTwo.get(i))) {
                finalList.add(listTwo.get(i));
            }
        }

        for (int i = 0; i < finalList.size(); i++) {
            System.out.printf("%s ", finalList.get(i));
        }

    }
}
