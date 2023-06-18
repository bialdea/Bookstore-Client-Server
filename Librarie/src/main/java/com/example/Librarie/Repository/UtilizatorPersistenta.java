package com.example.Librarie.Repository;

import com.example.Librarie.Model.Utilizator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UtilizatorPersistenta extends CrudRepository<Utilizator, Long> {
    Utilizator findByUsernameAndParola(String username, String parola);

}
