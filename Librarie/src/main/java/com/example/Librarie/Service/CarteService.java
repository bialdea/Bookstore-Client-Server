package com.example.Librarie.Service;
import com.example.Librarie.Model.Carte;
import com.example.Librarie.Repository.CartePersistenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteService {
    @Autowired
    private CartePersistenta carteRepo;

    public List<Carte> findAll(){
        return this.carteRepo.findByOrderByAutorAsc();
    }
}
