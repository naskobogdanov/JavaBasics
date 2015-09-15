public class FullHouse {
    public static void main(String[] args) {
        final String[] faces = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        final String[] suits = new String[] {"♣", "♦", "♥", "♠"};
        int counter = 0;

        for (int i = 0; i < faces.length; i++) {
            for (int j = 0; j < faces.length; j++) {
                if (i != j) {
                    for (int first = 0; first < suits.length; first++) {
                        for (int second = first + 1; second < suits.length; second++) {
                            for (int third = second + 1; third < suits.length; third++) {
                                for (int fourth = 0; fourth < suits.length; fourth++) {
                                    for (int fifth = fourth + 1; fifth < suits.length; fifth++) {

                                        System.out.print(faces[i]);
                                        System.out.print(suits[first]);
                                        System.out.print(faces[i]);
                                        System.out.print(suits[second]);
                                        System.out.print(faces[i]);
                                        System.out.print(suits[third]);

                                        System.out.print(faces[j]);
                                        System.out.print(suits[fourth]);
                                        System.out.print(faces[j]);
                                        System.out.print(suits[fifth]);
                                        System.out.print(" ");
                                        counter++;

                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.printf("Possible full houses: %s", counter);
    }
}
