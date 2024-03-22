public class Universita {
    private Docente[] docenti;

    public Universita(Docente[] docenti) {
        this.docenti = docenti;
    }
    public Docente[] getDocenti() {
        return docenti;
    }
    public String etaMin() {
        Docente docenteEtaMin = docenti[0];
        for (Docente docente : docenti) {
            if (docente.getEta() < docenteEtaMin.getEta()) {
                docenteEtaMin = docente;
            }
        }
        return "Il docente con l'età minima è: " + docenteEtaMin.getNome() + " " + docenteEtaMin.getCognome() + ", " + docenteEtaMin.getEta() + " anni";
    }

}
