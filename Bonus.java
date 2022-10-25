import java.util.Scanner;

class Bonus {
    static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String caractère;
        int nombre;

        System.out.println("Choisir un caractère");
        caractère = keyboard.nextLine();

        System.out.println("Choisir un nombre");
        nombre = keyboard.nextInt();

        System.out.println( "Vous avez choisi:"  + caractère + nombre );
    }
    
        
    }
}
