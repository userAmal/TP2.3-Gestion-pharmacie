package tp_gestiondunepharmacie;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Patient {
	private String nom;
    private Set<String> ordonnance;

    public Patient(String n) {
        nom = n; 
        ordonnance = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public Set<String> ordonnanceVide() {
        return ordonnance;
    }

    public void ajoutMedicament(String m) {
        ordonnance.add(m)
        ;}

    public void affiche() {
        System.out.println("nom: " + nom);
        System.out.println("ordonnance : " + ordonnance);
    }

    public boolean contientMedicament(String m) {
        return ordonnance.contains(m);
    }

    public void trieOrdonnace() {
        Set<String> s = new TreeSet<>(ordonnance); 
        ordonnance = s;
    }

}
