package com.example.Librarie.Repository;

import com.example.Librarie.Model.CarteLibrarie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;
import java.util.List;


public interface CarteLibrariePersistenta extends JpaRepository<CarteLibrarie, Long> {
    List<CarteLibrarie> findByOrderByAutorAsc();
    List<CarteLibrarie> findByIdLibrarieOrderByAutorAsc(int idLibrarie);


    default List<CarteLibrarie> filterBooks(String criteria, String value) {
        List<CarteLibrarie> allLibraries = findAll();
        List<CarteLibrarie> filteredLibraries = new ArrayList<>();
        for (CarteLibrarie library : allLibraries) {
            switch (criteria) {
                case "domeniu":
                    if (library.getDomeniu().toLowerCase().contains(value.toLowerCase())) {
                        filteredLibraries.add(library);
                    }
                    break;
                case "disponibil":
                    if (Integer.toString(library.getDisponibil()).equals(value)) {
                        filteredLibraries.add(library);
                    }
                    break;
                case "editura":
                    if (library.getEditura().toLowerCase().contains(value.toLowerCase())) {
                        filteredLibraries.add(library);
                    }
                    break;
                case "autor":
                    if (library.getAutor().toLowerCase().contains(value.toLowerCase())) {
                        filteredLibraries.add(library);
                    }
                    break;
                case "pret":
                    if (Float.toString(library.getPret()).equals(value)) {
                        filteredLibraries.add(library);
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Invalid criteria: " + criteria);
            }
        }
        return filteredLibraries;
    }
    @Query("SELECT c.domeniu, COUNT(c) FROM CarteLibrarie c GROUP BY c.domeniu")
    List<Object[]> countByDomeniu();

    @Query("SELECT c.editura, COUNT(c) FROM CarteLibrarie c GROUP BY c.editura")
    List<Object[]> countByEditura();

}