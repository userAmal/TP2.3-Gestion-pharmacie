package tp_gestiondunepharmacie;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DossierPharmacie pharmacie = new DossierPharmacie("ph");
        pharmacie.nouveauPatient("amal", new String[]{"doliprane", "panadole"});
        pharmacie.nouveauPatient("meryem", new String[]{"panadole"});
        pharmacie.affiche();
        pharmacie.ajoutMedicament("amal", "vitamine D");
        pharmacie.affichePatient("amal");

    }


}
