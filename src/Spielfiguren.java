public abstract class Spielfiguren {
	 E_Farben farbe;
	 E_Schachfiguren figur;
	
	 public Spielfiguren(E_Schachfiguren figur, E_Farben farbe){
		 this.farbe = farbe;
		 this.figur = figur;
	 }
	 public void ausgabe() {
		 System.out.println("Figur: "+figur+"\nFarbe: "+ farbe);
	 }
}
