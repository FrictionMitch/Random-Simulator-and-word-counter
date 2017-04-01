import edu.duke.FileResource;

public class Main {

    public static void main(String[] args) {

        RandomSimulator rand = new RandomSimulator();
//        rand.simpleSimulate(10000);
//        rand.simulateDice(10);
        CommonWords words = new CommonWords();
//        words.countShakespear();
        WordLengths wordLengths = new WordLengths();
//        wordLengths.countWordLengths(FileResource("data/small.txt"));
        wordLengths.testCountWords();
    }
}


