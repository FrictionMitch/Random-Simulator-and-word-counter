import edu.duke.FileResource;

import java.io.File;

public class WordLengths {
    public void countWordLengths(FileResource resource, int[] counts) {
        for(String word : resource.words()) {
            counts[word.length()]++;
            System.out.println("Word " +  "\"" + word + "\"  is " + word.length() + " characters long");
        }
        for(int i = 0; i < counts.length; i++) {
            System.out.println("Words with " + i + " characters's=\t" + counts[i]);
        }

    }


//    public void countWordLengths(FileResource resource, int[] counts) {
//        int index = 0;
//        for(String word : resource.words()) {
//
//            int countLetters = 0;
//            for(int i =0; i < word.length(); i++) {
//                char ch = word.charAt(i);
//                if(Character.isLetter(ch)){
//                    countLetters++;
//                }
//            }
//            counts[index] = countLetters;
//            System.out.println("Counts index " + index + " number of letters " + countLetters);
//            index++;
//        }
//    }

    public void testCountWords() {
        FileResource fr = new FileResource("data/small.txt");
        int index = 0;
        for(String word : fr.words()){
            index++;
        }
        int[] count = new int[index];
        countWordLengths(fr, count);

    }
}
