package com.example.Librarie.Model;

import jakarta.persistence.*;
@Entity
@Table(name="utilizator_app")
public class Utilizator {

    @Id
    @Column(name = "id_utilizator")
    private Long idUtilizator;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "parola", nullable = false)
    private String parola;

    @Column(name = "tip", nullable = false)
    private String tip;
    @Column(name = "id_librarie")
    private Long idLibrarie;
    public Utilizator() {}

    public Utilizator(Long idUtilizator, String username, String parola, String tip, Long idLibrarie) {
        this.idLibrarie = idLibrarie;
        this.idUtilizator = idUtilizator;
        this.username = username;
        this.parola = parola;
        this.tip = tip;
    }


    public Long getIdUtilizator() {
        return idUtilizator;
    }

    public void setIdUtilizator(Long idUtilizator) {
        this.idUtilizator = idUtilizator;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Long getIdLibrarie() {
        return idLibrarie;
    }

    public void setIdLibrarie(Long idLibrarie) {
        this.idLibrarie = idLibrarie;
    }

}