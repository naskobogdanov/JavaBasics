import java.util.ArrayList;
import java.util.Scanner;

public class LargestSequenceОfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
        ArrayList<String> singleList = new ArrayList<String>();

        for (int i = 0; i < input.length; i++) {
            if (i < input.length - 1 && input[i].equals(input[i + 1])){
                singleList.add(input[i]);
            } else {
                singleList.add(input[i]);
                listOLists.add(singleList);
                singleList = new ArrayList<String>();
            }
        }

        int counter = 0;
        int position = 0;
        for (int i = 0; i < listOLists.size(); i++) {
            if (listOLists.get(i).size() > counter) {
                counter = listOLists.get(i).size();
                position = i;
            }
        }

        for (String s : listOLists.get(position)) {
            System.out.printf("%s ", s);
        }
    }
}
