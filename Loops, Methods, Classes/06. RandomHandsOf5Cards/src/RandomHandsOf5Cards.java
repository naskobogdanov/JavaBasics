import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.Scanner;

public class RandomHandsOf5Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String[] cards = new String[] {
             "2♣", "3♣", "4♣", "5♣", "6♣", "7♣", "8♣", "9♣", "10♣", "J♣", "Q♣", "K♣", "A♣",
             "2♦", "3♦", "4♦", "5♦", "6♦", "7♦", "8♦", "9♦", "10♦", "J♦", "Q♦", "K♦", "A♦",
             "2♥", "3♥", "4♥", "5♥", "6♥", "7♥", "8♥", "9♥", "10♥", "J♥", "Q♥", "K♥", "A♥",
             "2♠", "3♠", "4♠", "5♠", "6♠", "7♠", "8♠", "9♠", "10♠", "J♠", "Q♠", "K♠", "A♠"};

        System.out.print("Enter the number of hands you want: ");
        int n = scanner.nextInt();
        int numberOfCards = 5;
        int[] nums = new int[numberOfCards];

        Random rnd = new Random(numberOfCards);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numberOfCards; j++) {
                int randomNum = rnd.nextInt(cards.length + 1);
                nums[j] = randomNum;

                if(j>0){
                    for(int c = 0; c < j; c++){
                        if(nums[c] == nums[j]){
                            j--;
                        }
                    }
                }
            }

            for(int num : nums){
                System.out.printf("%s ", cards[num]);
            }
            System.out.println();
        }

    }
}
