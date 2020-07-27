public class RemSpace {

    public static void main(String[] args) {
        String sentence = "He    llo    D    e  ar    W  or  l  d.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}