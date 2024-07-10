public class Task42 {
    public class SmashWords {

        public static String smash(String... words) {
            String sentence = "";
            for (String word : words) {
                sentence += word + " ";
            }
            return sentence.trim();
        }
    }

}
