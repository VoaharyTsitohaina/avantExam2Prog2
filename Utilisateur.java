package budgetMaster;

import java.time.LocalDate;
import java.util.List;

public class Utilisateur {
    private String nom;
    private double budgetMensuel;
    private List<CategorieDepense> listDepense;

    public Utilisateur(String nom, double budgetMensuel, List<CategorieDepense> listDepense) {
        this.nom = nom;
        this.budgetMensuel = budgetMensuel;
        this.listDepense = listDepense;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getBudgetMensuel() {
        return budgetMensuel;
    }

    public void setBudgetMensuel(double budgetMensuel) {
        this.budgetMensuel = budgetMensuel;
    }

    public List<CategorieDepense> getListDepense() {
        return listDepense;
    }

    public void setListDepense(List<CategorieDepense> listDepense) {
        this.listDepense = listDepense;
    }

    public void ajouterDepense (String description, int montant, CategorieDepense categorie, LocalDate date) {
        Depense depense = new Depense(description, montant, categorie, date);
        
    }
}