package tech.getarrays.AnnonceManager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Annonce implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nomComplet;
    private String Domaine;
    private String adresse;
    private String numTele;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String description;

    public Annonce() {}

    public Annonce(String nomComplet, String Domaine, String adresse, String numTele, String imageUrl, String description) {
        this.nomComplet = nomComplet;
        this.Domaine = Domaine;
        this.adresse = adresse;
        this.numTele = numTele;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnomComplet() {
        return nomComplet;
    }

    public void setnomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getDomaine() {
        return Domaine;
    }

    public void setDomaine(String Domaine) {
        this.Domaine = Domaine;
    }

    public String getadresse() {
        return adresse;
    }

    public void setadresse(String adresse) {
        this.adresse = adresse;
    }

    public String getnumTele() {
        return numTele;
    }

    public void setnumTele(String numTele) {
        this.numTele = numTele;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Annonce{" +
                "id=" + id +
                ", nomComplet='" + nomComplet + '\'' +
                ", Domaine='" + Domaine + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numTele='" + numTele + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description +
                '}';
    }
}
