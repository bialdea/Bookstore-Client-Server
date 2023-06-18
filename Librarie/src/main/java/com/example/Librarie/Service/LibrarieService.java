package com.example.Librarie.Service;
import com.example.Librarie.Repository.LibrariePersistenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Librarie.DTO.CarteLibrarieDTO;

import java.util.List;


@Service
public class LibrarieService {

        @Autowired
        private LibrariePersistenta cartelRepo;

    public List<CarteLibrarieDTO> findAll(){
        return this.cartelRepo.findAllBooks();
        }



}
