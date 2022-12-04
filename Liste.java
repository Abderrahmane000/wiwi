package Pack3.partie2.src.partie2;

public class Liste {
	protected Element Info;
	protected Liste Suiv;
	
	public Liste listeVide() {
		Liste L = new Liste() ;
		L.Info = null;
		L.Suiv = null;
		return L;
	}
	
	public Liste inserer(Liste L, Liste p , Element e) {
		Liste Nouv, Pt;
		Nouv = new Liste();
		Nouv.Info = e;
		Nouv.Suiv = p;
		
		if(p == L) {
			L = Nouv;
		}else {
			Pt = L;
			while(Pt.Suiv != p) {
				Pt = Pt.Suiv;
			}
			Pt.Suiv = Nouv;
		}
		return L;
	}
	
	public Liste supprimer(Liste L, Liste p) {
		Liste pt1, pt2;
		
		if(p==L) {
			return (L.Suiv);
		}else {
			pt1 = L;
			pt2 = L.Suiv;
			while(pt2 != p) {
				pt1 = pt1.Suiv;
				pt2 = pt2.Suiv;
			}
			pt1.Suiv = pt2.Suiv;
			return L;
		}
	}
	
	public Liste suivant(Liste L) {
		return (L.Suiv);
	}
	
	public Element acces(Liste L, Liste p) {
		return p.Info;
	}
	
	public boolean egale(Liste L1, Liste L2) {
		Liste pt1,pt2;
		pt1 = L1;
		pt2 = L2;
		
		while (pt1 != listeVide() && pt2 != listeVide()) {
			if(pt1.Info == pt2.Info) {
				pt1 = pt1.Suiv;
				pt2 = pt2.Suiv;
			}else {
				return false;
			}
		}
		
		if(pt1 != listeVide() || pt2 != listeVide()) {
			return false;
		}else {
			return true;
		}
		
	}
	
	public int Longueur_Iter(Liste L) {
		int co=0;
		Liste pt = L;
		while(pt != null) {
			co = co +1;
			pt = pt.Suiv;
		}
		return co;
	}
	
	public boolean est_Vide(Liste L) {
		if(L.Info == null && L.Suiv == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public Liste rechercher(Liste L, Element e) {
		Liste pt = L;
		while(pt != null) {
			if(pt.Info == e) {
				return pt;
			}
			pt = pt.Suiv;
		}
		return listeVide();
	}
	
	public Liste difference(Liste L1, Liste L2) {
		Liste pt = L1;
		Liste resultat = new Liste();
		
		do {
			Liste e = rechercher(L2, pt.Info);
			if (est_Vide(e)) {
				resultat = inserer(resultat, null , pt.Info);
			}
			pt=pt.Suiv;
		} while (pt != null);
		
		return resultat;

	}
	
	
}
