package Pack3.partie2.src.partie2;
import java.util.Scanner;

public class Test {
	
	public static Liste CreationListe(Liste L) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entrer le nombre d'elements de la liste: ");
		int nb = s.nextInt();
		
		if(nb==0) {
			return L.listeVide();
		}else {
			for(int i=0;i<nb;i++) {
				System.out.println("Entrer l'element n : "+i);
				Element e = new Element(s.nextInt());
				L = L.inserer(L,null,e);	
			}
			return L;
		}
	}
	
	public static void AffichageListe(Liste L) {
		
		Liste pt = L;
			while(pt!=null) {
				System.out.println(L.acces(L, pt));
				pt = pt.Suiv;
			}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******************Partie 1*************************");
		
		Liste liste1 = new Liste();
		liste1 = liste1.listeVide();
		
		CreationListe(liste1);
		
		if(liste1.est_Vide(liste1)) {
			System.out.println("La liste est vide");
		}else {
			System.out.println("Les elements de la liste sont : ");
			AffichageListe(liste1);
		}
		
		
		System.out.println("*******************Partie 2*************************");
		
		System.out.println("Entrer la valeur de l'element a chercher : ");
		Scanner input =  new Scanner(System.in);
		Element e1 = new Element(input.nextInt());
		
		if(liste1.est_Vide(liste1)) {
			System.out.println("La liste est vide, la recherche est impossible");
		}else {
			Liste res = liste1.rechercher(liste1, e1);
			if(liste1.est_Vide(res)) {
				System.out.println("l’élément e1 n’existe pas dans la liste");
			}else {
				System.out.println("l’élément e1 existe dans la liste");
			}
		}
		
		System.out.println("*****************Partie 3*************************");
		
		Liste L2 = new Liste();
		L2 = L2.listeVide();
		
		CreationListe(L2);
		
		if (L2.est_Vide(L2)) {
			System.out.println("La liste est vide!");
		}else {
			System.out.println("Les elements de la liste sont:");
			AffichageListe(L2);
		}
		
		if (liste1.est_Vide(liste1) && L2.est_Vide(L2)) {
			System.out.println("les deux listes sont vide! ");
		}else {
			if (liste1.est_Vide(liste1)) {
				System.out.println("la différence entre L1 et L2 est :");
				AffichageListe(L2);
			}
			else {
				if (L2.est_Vide(L2)) {	
					System.out.println("la différence entre L1 et L2 est :");
					AffichageListe(liste1);
				}
				else {
					System.out.println("la différence entre L1 et L2 est :");
					AffichageListe(L2.difference(liste1, L2));
				}
				
			}
		}
		
	}

}
