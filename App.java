class App {
  public static void main(String[] args) {
    String merk = "ASUS";
    double prijs = 500;
    String kleur = "geel";
    
    //Maak het object aan met het merk, prijs en kleur
    Computer c = new Computer(merk, prijs, kleur);
    System.out.println(c);
    
    //Toon het merk
    System.out.println(c.getMerk());
    
    String nieuwMerk ="Apple";
    
    //Verander het merk
    c.setMerk(nieuwMerk);
    
	//Toon het merk
    System.out.println(c.getMerk());
    
    //Start de computer op
    c.startOp();
  }
     
}
