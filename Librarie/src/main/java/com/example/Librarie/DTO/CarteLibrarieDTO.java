package com.example.Librarie.DTO;

public class CarteLibrarieDTO {
    private final float pret;
    private final int disponibil;
    private final String editura;
    private final int idLibrarie;
    private final int idCarte;
    private final String domeniu;
    private final String titlu;
    private final String autor;

    public CarteLibrarieDTO(int idCarteLibrarie, float pret, int disponibil, String editura, int idLibrarie, int idCarte, String domeniu, String titlu, String autor) {
        this.pret = pret;
        this.disponibil = disponibil;
        this.editura = editura;
        this.idLibrarie = idLibrarie;
        this.idCarte = idCarte;
        this.domeniu = domeniu;
        this.titlu = titlu;
        this.autor = autor;
    }
}
