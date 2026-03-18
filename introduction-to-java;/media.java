import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à sua calculadora de média de notas!");
        System.out.println("\nPor favor, digite as notas para calcular a média: ");
        System.out.println("\n=========================\n");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPROVA 1: ");
        float prova1 = scanner.nextFloat();
        System.out.println("\n=========================\n");

        System.out.print("\nPROVA 2: ");
        float prova2 = scanner.nextFloat();
        System.out.println("\n=========================\n");

        System.out.print("\nPROVA 3: ");
        float prova3 = scanner.nextFloat();
        System.out.println("\n=========================\n");

        System.out.print("\nTRABALHO: "); 
        float trabalho = scanner.nextFloat();
        System.out.println("\n=========================\n");

        float media = (prova1 *2 + prova2 * 2 + prova3 * 3 + trabalho * 3) / 10f;
        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("\nAprovado. Parabens, continue assim!!\n\n");
        }
        else if (media >= 5 && media < 7){
            System.out.println("\nRecuperaçao! Tera uma segunda chance, estude mais!!\n\n");
        }
        else{
            System.out.println("\nReprovado! Boa sorte na proxima!!\n\n");
        }
    }   
}
