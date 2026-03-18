import java.util.Scanner;

public class nota_fiscal {
    public static void main(String[] args){
        System.out.println("Bem-vindo ao Sistema de Imposto Fiscal.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite o valor do salário: R$ ");
        float salario = scanner.nextFloat();

        System.out.println("\n=========================\n\n ");
        System.out.println("NOTA FISCAL");
        System.out.println("\n\n=========================\n\n ");

        if (salario <= 2000) {
            System.out.println("SALARIO:\nR$ " + salario);
            System.out.println("\n\nIMPOSTO:\nISENTO");
            System.out.println("\n\nSALARIO LIQUIDO:\nR$ " + salario);
        }
        else if ( 2000 < salario && salario <= 3500){
            System.out.println("SALARIO:\nR$ " + salario);
            System.out.println("\n\nIMPOSTO:\n8%");
            System.out.println("\n\nSALARIO LIQUIDO:\nR$ " + (salario - (1 * 0.08)));
        }
        else if ( 3500 < salario && salario <= 5000){
            System.out.println("SALARIO:\nR$ " + salario);
            System.out.println("\n\nIMPOSTO:\n15%");
            System.out.println("\n\nSALARIO LIQUIDO:\nR$ " + (salario - (1 * 0.15)));
        }
        else{
            System.out.println("SALARIO:\nR$ " + salario);
            System.out.println("\n\nIMPOSTO:\n27%");
            System.out.println("\n\nSALARIO LIQUIDO:\nR$ " + (salario - (1 * 0.27)));
        }
   
        System.out.println("\n\n=========================\n\n ");
    }
}
