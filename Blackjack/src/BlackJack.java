import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {

        afficherMenu();
    }

    public static void afficherMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("Menu\n");
            System.out.println("1. Commencer à jouer");
            System.out.println("2. Consulter mon solde de jetons");
            System.out.println("3. Quitter");

            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Début du jeu...");
                    jouer();
                    break;
                case 2:
                    consulterSoldeJetons();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez sélectionner une option valide.");
            }
        } while (choix != 3);
    }

    public static void jouer() {
        //  commencer à jouer au Blackjack
        System.out.println("Bienvenue au jeu Blackjack !");

        afficherMenuJeu();
    }

    public static void consulterSoldeJetons() {
        //  le solde de jetons du joueur
        System.out.println("Votre solde de jetons est : 200");
    }

    public static void afficherMenuJeu() {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.println("\nMenu de jeu\n");
            System.out.println("1. Hit (Tirer une nouvelle carte)");
            System.out.println("2. Stand (Rester avec la main actuelle)");
            System.out.println("3. Quitter la partie");

            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    //  le choix "Hit"
                    System.out.println("Tirer une nouvelle carte...");
                    break;
                case 2:
                    // le choix "Stand"
                    System.out.println("Rester avec la main actuelle...");
                    break;
                case 3:
                    System.out.println("Partie terminée !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez sélectionner une option valide.");
            }
        } while (choix != 3);
    }
}
