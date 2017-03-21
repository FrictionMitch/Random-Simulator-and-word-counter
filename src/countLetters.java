public class countLetters {

    public void countLetters(String message) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int[] counts = new int[26];
        for(int j = 0; j < message.length(); j++) {
            char ch = Character.toLowerCase(message.charAt(j));
            int dex = alphabet.indexOf(ch);
            if(dex != -1) {
                counts[dex] ++;
            }
        }

    }
}
