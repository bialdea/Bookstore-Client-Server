package com.example.Librarie.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "cartelibrarie_app")
public class Librarie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartelibrarie")
    private int idCarteLibrarie;

    @Column(name = "pret")
    private float pret;

    @Column(name = "disponibil")
    private int disponibil;

    @Column(name = "editura")
    private String editura;

    @Column(name = "id_librarie")
    private int idLibrarie;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carte")
    private Carte carte;


    public Librarie() {}

    public Librarie(float pret, int disponibil, int idCarteLibrarie, String editura, int idLibrarie) {
        this.pret = pret;
        this.disponibil = disponibil;
        this.idCarteLibrarie = idCarteLibrarie;
        this.editura = editura;
        this.idLibrarie = idLibrarie;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public int getDisponibil() {
        return disponibil;
    }

    public void setDisponibil(int disponibil) {
        this.disponibil = disponibil;
    }

    public int getIdCarteLibrarie() {
        return idCarteLibrarie;
    }

    public void setIdCarteLibrarie(int idCarteLibrarie) {
        this.idCarteLibrarie = idCarteLibrarie;
    }

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public int getIdLibrarie() {
        return idLibrarie;
    }

    public void setIdLibrarie(int idLibrarie) {
        this.idLibrarie = idLibrarie;
    }

    @Override
    public String toString() {
        return "CarteLibrarie{" +
                "pret=" + pret +
                ", disponibil=" + disponibil +
                ", idCarteLibrarie=" + idCarteLibrarie +
                ", idLibrarie=" + idLibrarie +
                ", editura='" + editura + '\'' +
                '}';
    }
}
