import edu.duke.FileResource;

import java.util.Random;

public class RandomSimulator {

    public void simpleSimulate(int rolls) {
        Random rand = new Random();

        int twos = 0;
        int twelves = 0;

        for(int k = 0; k < rolls; k++) {
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;

            if(d1 + d2 == 2) {
                twos ++;
            } else if (d1 + d2 == 12){
                twelves ++;
            }
        }

        System.out.println("2\'s = \t" + twos + "\t" +100.0 * twos/rolls);
        System.out.println("12\'s = \t" + twelves + "\t" + 100.0 * twelves/rolls);
    }


    public void simulateDice(int rolls) {

        Random rand = new Random();

        int[] counts = new int[13];


        for(int k = 0; k < rolls; k++) {
            int d1 = rand.nextInt(6) + 1;
            int d2 = rand.nextInt(6) + 1;

            System.out.println("roll is " + d1  + " + " + d2 + " = " + (d1 + d2));

            counts[d1 + d2]++;
        }
//
            for(int j=2; j <=12; j++) {
                System.out.println(j + "'s=\t" + counts[j] + "\t" + 100.0 * counts[j]/rolls);
        }
    }

    public void countWords(String[] words, int[] count){

    }


}
