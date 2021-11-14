package Model;

import javax.persistence.*;

@Entity

@Table(name = "List des adherant")
public class Adherant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "Nom")
    private String Nom;
    @Column (name = "Prénom")
    private String Prenom;
    @Column(name = "Date de Naissance")
    private String Date_Naissance;
    @Column(name = "Lieu de Naissance")
    private String Lieu;
    @Column(name = "Reidence actuelle")
    private String Residence;

    public Adherant() {
    }

    public Adherant(String nom, String prenom, String date_Naissance, String lieu, String residence) {
        this.Nom = nom;
        this.Prenom = prenom;
        this.Date_Naissance = date_Naissance;
        this.Lieu = lieu;
        this.Residence = residence;
    }

    public String getNom() {
        return Nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        this.Prenom = prenom;
    }

    public String getDate_Naissance() {
        return Date_Naissance;
    }

    public void setDate_Naissance(String date_Naissance) {
        this.Date_Naissance = date_Naissance;
    }

    public String getLieu() {
        return Lieu;
    }

    public String getResidence() {
        return Residence;
    }

    public void setResidence(String residence) {
        Residence = residence;
    }

    public void setLieu(String lieu) {
       this. Lieu = lieu;
    }
}
