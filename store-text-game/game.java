import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose language | Escolha o Idioma");
        System.out.println("1 English");
        System.out.println("2 Português");
        int chose = scanner.nextInt();
        
        if (chose != 1 && chose != 2){
            System.out.println("\n====Unknown number, try again! | Número desconhecido, tente novamente!====");
            System.out.println("\nChose language | Escolha o Idioma");
            System.out.println("1 English");
            System.out.println("2 Português");
            chose = scanner.nextInt();
        }
        
        if (chose == 1){
            language.setLanguage("en");
        }
        else{
            language.setLanguage("pt");
        }
        
         System.out.println("\n" + language.get("hello"));
        System.out.print(language.get("gold"));
        int gold = scanner.nextInt();
        if (gold < 25){ 
            System.out.println(language.get("end_1"));
            scanner.close();
            return;
        }
        
        System.out.println("\n================================");
        System.out.println("               ...\n" + language.get("in_1") + "\n               ...\n");
        System.out.println(language.get("in_2"));
        System.out.print("\n" + language.get("in_condit"));
        String logic = scanner.next();
        
        if (!logic.equalsIgnoreCase("sim") && !logic.equalsIgnoreCase("s") && !logic.equalsIgnoreCase("yes") && !logic.equalsIgnoreCase("y")){
            System.out.print("\n" + language.get("out_condit"));
            String logic2 = scanner.next();
            if (logic2.equalsIgnoreCase("sim") || logic2.equalsIgnoreCase("s") || logic2.equalsIgnoreCase("yes") || logic2.equalsIgnoreCase("y")){
                logic = logic2;
            }
                else{
                System.out.println("\n"+ language.get("end_2"));
            }
            }

        int swordQty = 0;  
        int shieldQty = 0;
        int potionQty = 0;
        
        while (logic.equalsIgnoreCase("sim") || logic.equalsIgnoreCase("s") || logic.equalsIgnoreCase("y") || logic.equalsIgnoreCase("yes")) {
            int sword = 100;  // products
            int shield = 80;
            int potion = 25;
            
            if (swordQty > 0 || shieldQty > 0 || potionQty > 0){ //inventory
                System.out.println("\n" + language.get("inventory"));
                if (swordQty > 0){
                    System.out.println(language.get("sword") + ": " + swordQty);
                }
                if (shieldQty > 0){
                    System.out.println(language.get("shield") + ": " + shieldQty);
                }
                if (potionQty > 0){
                    System.out.println(language.get("potion") + ": " + potionQty);
                }
            }
            
            System.out.println("\n==========================="); //Sotre
            System.out.println("GENERIC STORE");
            System.out.println(language.get("sword") + ": " + sword + " " + language.get("golds"));
            System.out.println(language.get("shield") + ": " + shield + " " +  language.get("golds"));
            System.out.println(language.get("potion") + ": " + potion + " " +  language.get("golds"));
            System.out.println("===========================");
            System.out.print(language.get("gold") + gold);

            System.out.print("\n\n" + language.get("condit_choice"));
            String buy = scanner.next();
            int qty = 0;
            if (buy.equalsIgnoreCase(language.get("sword"))){ //sword choice
                System.out.println("\n" + language.get("condit_sword"));
                qty = scanner.nextInt();
                if (qty * sword <= gold){
                    gold -= qty * sword;
                    swordQty += qty;
                    System.out.println(language.get("buy_ok"));
                    qty = 0;
                    System.out.print(language.get("condit_affter_buy"));
                    logic = scanner.next();
                }
                else{
                    System.out.println(language.get("no_gold"));
                    qty = 0;
                    System.out.print(language.get("condit_affter_no_gold"));
                    logic = scanner.next();
                }
            }
            else if (buy.equalsIgnoreCase(language.get("shield"))){ //shield choice
                System.out.println("\n" + language.get("condit_shield"));
                qty = scanner.nextInt();
                if (qty * shield <= gold){
                    gold -= qty * shield;
                    shieldQty += qty;
                    System.out.println(language.get("buy_ok"));
                    qty = 0;
                    System.out.print(language.get("condit_affter_buy"));
                    logic = scanner.next();
                }
                else{
                    System.out.println(language.get("no_gold"));
                    qty = 0;
                    System.out.print(language.get("condit_affter_no_gold"));
                    logic = scanner.next();
                }
            }
            else if (buy.equalsIgnoreCase(language.get("potion")) || buy.equalsIgnoreCase("pocao")){ //potion choise
                System.out.println("\n" + language.get("condit_potion"));
                qty = scanner.nextInt();
                if (qty * potion <= gold){
                    gold -= qty * potion;
                    potionQty += qty;
                    System.out.println(language.get("buy_ok"));
                    qty = 0;
                    System.out.print(language.get("condit_affter_buy"));
                    logic = scanner.next();
                }
                else{
                    System.out.println(language.get("no_gold"));
                    qty = 0;
                    System.out.print(language.get("condit_affter_no_gold"));
                    logic = scanner.next();
                }
            }
            else{ //Produto digitado errado
                System.out.println("\n" + language.get("no_product"));
                System.out.print(language.get("condit_affter_no_product"));
                logic = scanner.next();
            }
        }

        System.out.println("\n"); //final inventory, game conclusion!
        if (swordQty > 0 || shieldQty > 0 || potionQty > 0){ //inventory
            System.out.println("\n" + language.get("inventory_final"));
            if (swordQty > 0){
                System.out.println(language.get("sword") + ": " + swordQty);
                }
            if (shieldQty > 0){
                System.out.println(language.get("shield") + ": " + shieldQty);
                }
            if (potionQty > 0){
                System.out.println(language.get("potion") + ": " + potionQty);
                }
        }
        System.out.println(language.get("gold_final") + gold);
        System.out.println("\n\n" + language.get("end_final") +"\n\n");
        scanner.close();
    }
    
}



