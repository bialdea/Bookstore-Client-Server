package com.example.Librarie.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "carte_app")
public class Carte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carte")
    private int idCarte;

    @Column(name = "domeniu")
    private String domeniu;

    @Column(name = "titlu")
    private String titlu;

    @Column(name = "autor")
    private String autor;
    @OneToMany(mappedBy = "carte", cascade = CascadeType.ALL)
    private List<Librarie> cartiLibrarie;

    public Carte() {
    }

    public Carte(String domeniu, String titlu, String autor) {
        this.domeniu = domeniu;
        this.titlu = titlu;
        this.autor = autor;
    }
    public Carte(int idCarte, String domeniu, String titlu, String autor) {
        this.idCarte = idCarte;
        this.domeniu = domeniu;
        this.titlu = titlu;
        this.autor = autor;
    }


    @Override
    public String toString() {
        return "Carte{" +
                "idCarte=" + idCarte +
                ", domeniu='" + domeniu + '\'' +
                ", titlu='" + titlu + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
