package budgetMaster;

import java.time.LocalDate;

public class Depense {
    private String description;
    private double montant;
    private CategorieDepense categorie;
    private LocalDate date;

    public Depense(String description, double montant, CategorieDepense categorie, LocalDate date) {
        this.description = description;
        this.montant = montant;
        this.categorie = categorie;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public CategorieDepense getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieDepense categorie) {
        this.categorie = categorie;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
