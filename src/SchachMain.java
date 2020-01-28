public class SchachMain {

	
	public static void main(String[] args) {
		    
		Figuren k = new Figuren(E_Schachfiguren.K, E_Farben.S);
		Figuren q = new Figuren(E_Schachfiguren.Q, E_Farben.W);
		Figuren l = new Figuren(E_Schachfiguren.L, E_Farben.S);
		Figuren s = new Figuren(E_Schachfiguren.S, E_Farben.W);
		Figuren b = new Figuren(E_Schachfiguren.B, E_Farben.S);
		Figuren t = new Figuren(E_Schachfiguren.T, E_Farben.S);
		
		E_Farben weiss = E_Farben.W;
		E_Farben schwarz = E_Farben.S;
		
		SchachBrett brett = new SchachBrett(8);
		brett.befuellen(k, 3, 5);
		k.ausgabe();
		brett.befuellen(q, 5, 3);
		q.ausgabe();
		brett.befuellen(l, 4, 6);
		l.ausgabe();
		brett.befuellen(s, 1, 6);
		s.ausgabe();
		brett.befuellen(b, 3, 4);
		b.ausgabe();
		brett.befuellen(t, 2, 8);
		t.ausgabe();
		
		System.out.println("Figuren am Brett: "+brett.gesamtFiguren());
		System.out.println("davon weiss: "+brett.gesamtFiguren(weiss));
		System.out.println("davon schwarz: "+brett.gesamtFiguren(schwarz));
	
	}
	
}
