  public class Computer {
    
    //Dit zijn de eigenschappen van de klasse.
    //Dit heet "fields"
    private String merk;
    private double prijs;
    private String kleur;
   
    //Dit is een no-argument constrcutor; je maakt een object aan maar geeft geen data mee.
    public Computer() {
    }
    
    //Dit is een constructor; je maakt een object aan en geeft data mee.
    public Computer(String merk, double prijs, String kleur) {
      this.merk = merk;
      this.prijs = prijs;
      this.kleur = kleur;
    }
    
    //Get methode: haal iets op (in dit geval het merk)
    public String getMerk() {
      return this.merk;
    }
    
    //Set methode: update data (in dit geval het merk)
    public void setMerk(String merk) {
      this.merk = merk;
    }
    
    //Override geeft aan dat je je eigen implementatie van deze method gebruikt, in plaats van de standaard
    @Override
    public String toString() {
      return merk + " " + prijs + "euro";
    }
    
    public void startOp() {
      System.out.println("Ik start op");
    }
  }
