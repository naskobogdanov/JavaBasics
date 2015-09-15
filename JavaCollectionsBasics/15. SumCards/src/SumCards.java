import java.util.*;

public class SumCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        ArrayList<Integer> cardFaces = new ArrayList<Integer>();
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].substring(0, 1).equals("1")){
                cardFaces.add(10);
            } else if (inputArr[i].substring(0, 1).equals("J")){
                cardFaces.add(12);
            } else if (inputArr[i].substring(0, 1).equals("Q")){
                cardFaces.add(13);
            } else if (inputArr[i].substring(0, 1).equals("K")){
                cardFaces.add(14);
            } else if (inputArr[i].substring(0, 1).equals("A")){
                cardFaces.add(15);
            } else {
                cardFaces.add(Integer.parseInt(inputArr[i].substring(0, 1)));
            }
        }

        ArrayList<Integer> temp = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < cardFaces.size(); i++) {

            temp.add(cardFaces.get(i));

            if (i != cardFaces.size() - 1){
                if (!cardFaces.get(i).equals(cardFaces.get(i + 1))){
                    if (temp.size() > 1){
                        for (int j = 0; j < temp.size(); j++) {
                            sum += temp.get(j) * 2;
                        }
                    } else {
                        sum += temp.get(0);
                    }
                    temp = new ArrayList<Integer>();
                }
            } else {
                if (temp.size() > 1){
                    for (int j = 0; j < temp.size(); j++) {
                        sum += temp.get(j) * 2;
                    }
                } else {
                    sum += temp.get(0);
                }
                temp = new ArrayList<Integer>();
            }
        }
        System.out.println(sum);
    }
}
