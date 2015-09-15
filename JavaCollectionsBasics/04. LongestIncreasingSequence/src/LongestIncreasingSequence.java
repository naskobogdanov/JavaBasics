import java.util.ArrayList;
import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArray = scanner.nextLine().split(" ");
        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }

        ArrayList<ArrayList<Integer>> listOLists = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> singleList = new ArrayList<Integer>();

        for (int i = 0; i < intArray.length; i++) {
            if (i < intArray.length - 1 && intArray[i] < intArray[i + 1]){
                singleList.add(intArray[i]);
            } else {
                singleList.add(intArray[i]);
                listOLists.add(singleList);
                singleList = new ArrayList<Integer>();
            }
        }

        int counter = 0;
        int positionOfLongest = 0;
        for (int i = 0; i < listOLists.size(); i++) {
            if (listOLists.get(i).size() > counter) {
                counter = listOLists.get(i).size();
                positionOfLongest = i;
            }
        }

        for (int i = 0; i < listOLists.size(); i++) {
            for (int j = 0; j < listOLists.get(i).size(); j++) {
                System.out.printf("%d ", listOLists.get(i).get(j));
            }
            System.out.println();
        }

        System.out.print("Longest: ");
        for (Integer s : listOLists.get(positionOfLongest)) {
            System.out.printf("%d ", s);

        }
    }
}