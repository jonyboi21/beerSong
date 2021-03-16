public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"Owl", "Leader", "know", "build", "cater", "house", "fog", "suspect", "social", "laborer", "ferry", "limit", "abridge"};
        String[] wordListTwo = {"white","auditor", "result","first-hand", "agree", "software", "cheap", "Hardship", "file", "Put", "doctor", "throat", "theft"};
        String[] wordListThree = {"convict", "take", "far", "teacher", "worm", "floor", "fly", "talkative", "cassette", "notion", "piano", "performer", "fill"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListTwo.length;


        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * oneLength);
        int rand3 = (int) (Math.random() * oneLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];


        System.out.println("Why can't we find a " + phrase);

    }


}




