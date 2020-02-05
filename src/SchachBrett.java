public class SchachBrett {
	
	static Spielfiguren[][] brett;	
	E_Farben s=E_Farben.S;
	E_Farben w=E_Farben.W;
	
	public SchachBrett(int gr) {
		brett  = new Spielfiguren[gr][gr];
	}
	
	public void befuellen(Spielfiguren f, int z,  int s) {
		if(belegt(z,s)==true) {
			System.out.println(z+"x"+s+" ist schon belegt");
		}else {
		brett[z][s]=f;
		//System.out.println("befüllt");
		}
	}
	
	public boolean belegt(int z, int s) {
		if (brett[z][s] == null) {
			return false;
		}else {
			return true;
		}
	}
	public int gesamtFiguren() {
		return gesamtFiguren(s) + gesamtFiguren(w);
	}
	public int gesamtFiguren(E_Farben f) {
		int anz = 0;
		for(int i=0;i<brett.length; i++) {
			for (int j=0;j<brett.length;j++) {
				if(brett[i][j] != null && brett[i][j].farbe == f) {
					anz++;
				}
			}
		}
		return anz;
	}
	static void create() {
		System.out.println("\n\t    SPIELFELD");
		System.out.println("---------------------------------");
			for (int i = 0; i < brett.length; i++) {
				for (int j =0; j < brett.length; j++) {
					try {
						System.out.print("| "+brett[i][j].figur+" "); //+brett[i][j].farbe+
					}
					catch (NullPointerException e) {
						System.out.print("|   ");	
					}
				}
				System.out.println("|");
				System.out.println("---------------------------------");
			}
	}
}