import java.util.Scanner;

public class Compte {
    private double solde;
    private int code;
    private Compte proprietaire;
    private static int codeCounter=0;
    public Compte(double solde){
        this.solde = solde;
        this.code = ++codeCounter;
    }
    public double getSolde(){
        return this.solde;
    }
    public int getCode(){
        return this.code;
    }
    public void displayAllAccounts(){
        System.out.println("Le nombre de comptes crées: "+ this.code);
    }
    public void crediter(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Donner le montant à déposer");
        double somme = userInput.nextDouble();
        this.solde = this.solde + somme ;
        System.out.println("Opération bien effectuée");
        userInput.close();
    }
    public void debiter(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Donner le montant à retirer");
        double somme = userInput.nextDouble();
        this.solde = this.solde - somme ;
        System.out.println("Opération bien effectuée");    
        userInput.close();}
}
