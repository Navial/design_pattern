public class MachineACafe {

public enum Etat{
	IDLE{
		public void entrerMonnaie(Piece piece, MachineACafe mc){
			// Changer l'état si montant en cours > prix
			if(mc.boisson.getPrix() > mc.montantEnCours){
				mc.etatCourant = Etat.PAS_ASSEZ;
				mc.afficherPasAssez(mc.boisson);
			}else{
				mc.etatCourant = Etat.COLLECTE;
			}
		}
	},
	COLLECTE,
	PAS_ASSEZ{
		public void entrerMonnaie(Piece piece, MachineACafe mc){
			// Changer l'état si montant en cours > prix
			if(mc.montantEnCours >= mc.boisson.getPrix()){
				mc.etatCourant = Etat.COLLECTE;
				mc.montantEnCours -= mc.boisson.getPrix();
				mc.afficherBoisson(mc.boisson);
				mc.boisson = null;
				mc.afficherMontant();
				if (mc.montantEnCours == 0)
					mc.etatCourant = Etat.IDLE;
			}else{
				mc.afficherPasAssez(mc.boisson);
			}
		}
	};


	public void entrerMonnaie(Piece piece, MachineACafe mc){
		if(mc.boisson.getPrix() > mc.montantEnCours){
			mc.etatCourant = Etat.PAS_ASSEZ;
			mc.afficherPasAssez(mc.boisson);
		}else {
			mc.montantEnCours -= mc.boisson.getPrix();
			mc.afficherBoisson(mc.boisson);
			mc.boisson = null;
			mc.afficherMontant();
			if (mc.montantEnCours == 0)
				mc.etatCourant = Etat.IDLE;
			else
				mc.etatCourant = Etat.COLLECTE;
		}
	}

}
	// public final int idle = 0;
	public final int collecte = 1;
	public final int pasAssez = 2;
	
	private int montantEnCours = 0;
	private Etat etatCourant = Etat.IDLE;
	private ToucheBoisson boisson = null;
	
	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
		
	}
	public void entrerMonnaie(Piece piece) {
		montantEnCours += piece.getValeur();
		afficherMontant();
		etatCourant.entrerMonnaie(piece, this);
	}

	//public void entrerMonnaie(Piece piece) {
	//	 montantEnCours += piece.getValeur();
	//	 afficherMontant();

	//	 if ( etatCourant != Etat.PAS_ASSEZ)
	//		 etatCourant = collecte;

	//	else if (boisson.getPrix() > montantEnCours) {
	//			afficherPasAssez(boisson);
	//	}
	//
	//	else {
	//		montantEnCours -= boisson.getPrix();
	//		afficherBoisson(boisson);
	//		boisson = null;
	//		afficherMontant();
	//		if (montantEnCours == 0)
	//			etatCourant =  idle;
	//		else
	//			etatCourant =  collecte;
	//	}
	//}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		if (etatCourant == pasAssez)
			throw new IllegalStateException();
		if (etatCourant == idle) {
			afficherPasAssez(toucheBoisson);
			return;			
		}
		if (toucheBoisson.getPrix() > montantEnCours) {
			boisson = toucheBoisson;
			afficherPasAssez(boisson);
			boisson = toucheBoisson;
			etatCourant =  pasAssez;
			return;
		}
		montantEnCours -= toucheBoisson.getPrix();
		afficherBoisson(toucheBoisson);
		afficherMontant();
		if (montantEnCours == 0)
			etatCourant = idle;
		else
			etatCourant = collecte;
	}
	
	public void rendreMonnaie() {
		if (etatCourant != idle) {
			afficherRetour();
			montantEnCours = 0;
			boisson = null;
		}
		etatCourant = idle;
	}
}
