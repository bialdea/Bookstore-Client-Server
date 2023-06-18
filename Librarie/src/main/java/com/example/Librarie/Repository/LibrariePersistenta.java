package com.example.Librarie.Repository;
import com.example.Librarie.Model.Librarie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Librarie.DTO.CarteLibrarieDTO;
import java.util.List;

public interface LibrariePersistenta extends JpaRepository<Librarie, Long> {

   @Query("SELECT new com.example.Librarie.DTO.CarteLibrarieDTO(c.idCarteLibrarie, c.pret, c.disponibil, c.editura, c.idLibrarie, " +
           "ca.idCarte, ca.domeniu, ca.titlu, ca.autor) " +
           "FROM Librarie c " +
           "JOIN c.carte ca")
   List<CarteLibrarieDTO> findAllBooks();

}
