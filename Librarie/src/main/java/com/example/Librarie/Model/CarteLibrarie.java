package com.example.Librarie.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "carti_app")
public class CarteLibrarie {

    @Id
    @Column(name = "id_cartelibrarie")
    private int idCarteLibrarie;

    @Column(name = "pret")
    private float pret;

    @Column(name = "disponibil")
    private int disponibil;

    @Column(name = "editura")
    private String editura;
    @Column(name = "domeniu")
    private String domeniu;

    @Column(name = "titlu")
    private String titlu;

    @Column(name = "autor")
    private String autor;
    @Column(name = "id_librarie")
    private int idLibrarie;

    public CarteLibrarie() {
    }
    public CarteLibrarie(int idLibrarie) {
        this.idLibrarie=idLibrarie;
    }
    public CarteLibrarie(int idCarteLibrarie, float pret, int disponibil, String editura, String domeniu, String titlu, String autor) {
        this.idCarteLibrarie = idCarteLibrarie;
        this.pret = pret;
        this.disponibil = disponibil;
        this.editura = editura;
        this.domeniu = domeniu;
        this.titlu = titlu;
        this.autor = autor;
    }

    public int getIdCarteLibrarie() {
        return idCarteLibrarie;
    }

    public void setIdCarteLibrarie(int idCarteLibrarie) {
        this.idCarteLibrarie = idCarteLibrarie;
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

    public String getEditura() {
        return editura;
    }

    public void setEditura(String editura) {
        this.editura = editura;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIdLibrarie() {
        return idLibrarie;
    }

    public void setIdLibrarie(int idLibrarie) {
        this.idLibrarie = idLibrarie;
    }


}
