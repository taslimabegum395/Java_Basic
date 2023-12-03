package Java_Basic;

public class ArrayDuplicateCharacter {
    public static void main(String[] args) {
        String x = "I hate  java";
        int[] charCount = new int[128]; // assuming ASCII characters only

        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            charCount[c]++;
        }

        int duplicateCount = 0;
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                duplicateCount += charCount[i] - 1;
            }
        }

        System.out.println("Number of duplicate characters: " + duplicateCount);
    }
}
