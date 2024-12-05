public class Client {
    private String CIN;
    private String nom;
    private String prenom;
    private String tel;

    public Client(String CIN,String nom,String prenom,String tel){
        this.CIN=CIN;
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
    }
    public Client(String CIN,String nom,String prenom){
        this.CIN=CIN;
        this.nom=nom;
        this.prenom=prenom;
    }
    public void displayClientData(){
        System.out.println("Welcome "+ getNom()+" "+getPrenom()+ ", your cin number is "+getCIN()+" & your phone number is "+getTel());
    }
    
    public String getCIN(){
        return this.CIN;
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public String getTel(){
        return this.tel;
    }
    

}
