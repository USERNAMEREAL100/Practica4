import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст. Речення повинні закінчуватись крапкою, знаком оклику та знаком питання:");
        String text = scanner.nextLine();

        int sentenceCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                sentenceCount++;
            }
        }

        System.out.println("Кількість речень: " + sentenceCount);

        scanner.close();
    }
}