import java.util.Scanner;

public class game {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Idioma / Language:");
        System.out.println("1 - Português");
        System.out.println("2 - English");
        int choice = scanner.nextInt();

        while (choice != 1 && choice != 2){
            System.err.println("\nDigite um valor válido! / Enter a valid value!");
            System.out.println("1 - Português");
            System.out.println("2 - English");
            choice = scanner.nextInt();
        }

        if (choice == 1){
            language.setLanguage("pt");
        }
        else{
            language.setLanguage("en");
        }
        System.out.println("=====================================\n=====================================\n");
        System.out.println(language.get("hello"));
        int score = 0;
        System.out.println(language.get("score") + score);
        
        System.out.print("\n" + language.get("count-1"));
        int enimies = scanner.nextInt();
        int points;
        
        while (enimies > 0) {
            points = 0;
            points = enimies * 50;
            System.out.println("\n=====================================");
            if (enimies >= 10 && enimies < 20) {
                score += points + 500;
                System.out.println("+" + points + " " + language.get("points"));
                System.out.println("+500 " + language.get("bonus"));
                System.out.println(language.get("score") + score);
                System.out.println("=====================================");
                System.out.print("\n" + language.get("count-2"));
                enimies = scanner.nextInt();
            }
            else if (enimies >= 20) {
                score += points + 1000;
                System.out.println("+" + points + " " + language.get("points"));
                System.out.println("+1000 " + language.get("bonus"));
                System.out.println(language.get("score") + score);
                System.out.println("=====================================");
                System.out.print("\n" + language.get("count-2"));
                enimies = scanner.nextInt();
            }
            else {
                score += points;
                System.out.println("+" + points + " " + language.get("points"));
                System.out.println(language.get("score") + score);
                System.out.println("=====================================");
                System.out.print("\n" + language.get("count-2"));
                enimies = scanner.nextInt();
            }
        }

        System.out.println("\n=====================================\n=====================================");
        if (score <= 0){
            
            System.out.println  (language.get("score-none"));
            System.out.println("\nGAME OVER!!\n" + language.get("game-over"));
        }
        else {
            System.out.println(language.get("score-final") + score);
            System.out.println("\nGAME OVER!!\n" + language.get("game-over"));
        }
    System.out.println("=====================================\n=====================================");
    scanner.close();
    }
}