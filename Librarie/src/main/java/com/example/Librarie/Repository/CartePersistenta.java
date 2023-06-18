package com.example.Librarie.Repository;
import com.example.Librarie.Model.Carte;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartePersistenta extends JpaRepository<Carte, Long> {
    List<Carte> findByOrderByAutorAsc();


}
