package tp_gestiondunepharmacie;

import java.util.HashMap;

public class DossierPharmacie {
    private String nom;
    private HashMap<String, Patient> patients;

    public DossierPharmacie(String n) {
        nom = n;
        patients = new HashMap<>();
    }

    public void nouveauPatient(String nom, String[] ord) {
        if (!patients.containsKey(nom)) {
            Patient patient = new Patient(nom);
            for (String medicament : ord) {
                patient.ajoutMedicament(medicament);
            }
            patients.put(nom, patient);
        }
    }

    public boolean ajoutMedicament(String nom, String m) {
        Patient patient = patients.get(nom);
        if (patient != null) {
            patient.ajoutMedicament(m);
            return true;
        }
        return false;
    }

    public void affichePatient(String nom) {
        Patient patient = patients.get(nom);
        patient.affiche();
        
    }

    public void affiche() {
        System.out.println("nom pharmacie : " + nom);
        for (Patient patient : patients.values()) {
            patient.affiche();
        }
    }

}
