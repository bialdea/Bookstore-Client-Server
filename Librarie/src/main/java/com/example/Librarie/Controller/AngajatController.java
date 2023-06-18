package com.example.Librarie.Controller;
import com.example.Librarie.Model.Carte;
import com.example.Librarie.Model.CarteLibrarie;

import com.example.Librarie.Service.LibrarieService;
import com.example.Librarie.Service.CarteLibrarieService;
import com.example.Librarie.Service.UtilizatorService;
import com.example.Librarie.Service.CarteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Librarie.DTO.CarteLibrarieDTO;


import java.util.List;

@RestController
public class AngajatController {
    @Autowired
    private LibrarieService cartelService;
    @Autowired
    private CarteLibrarieService librarieService;
    @Autowired
    private UtilizatorService userService;
    @Autowired
    private CarteService carteService;

    @GetMapping("/getCartiLibrarie")
    @ResponseBody
    public List<CarteLibrarieDTO> getAllCartiLibrarie() {
        return this.cartelService.findAll();
    }
    @GetMapping("/getCarti")
    @ResponseBody
    public List<CarteLibrarie> getAllCarti() {
        return this.librarieService.findAll();
    }
    @GetMapping("/getCartiS")
    @ResponseBody
    public List<Carte> getAllCartiS() {
        return this.carteService.findAll();
    }
    @GetMapping("/getCartiAngajat/{libraryId}")
    @ResponseBody
    public List<CarteLibrarie> getAllCartiAngajat(@PathVariable("libraryId") int idLibrarie) {
        return this.librarieService.findAllAngajat(idLibrarie);
    }
    @DeleteMapping("/deleteBook/{id_cartelibrarie}")
    @ResponseBody
    public String deleteBook(@PathVariable("id_cartelibrarie") Long idCarteLibrarie){
        return this.librarieService.deleteBook(idCarteLibrarie);
    }
    @PostMapping("/createBook")
    @ResponseBody
    public String createBook(@RequestBody CarteLibrarie librarie) {
        return this.librarieService.createBook(librarie);
    }

    @PutMapping("/updateBook")
    @ResponseBody
    public CarteLibrarie updateBook(@RequestBody CarteLibrarie librarie){

        return this.librarieService.updateBook(librarie);
    }
    @PutMapping("/updateBookAvailability/{id}")
    @ResponseBody
    public void updateBookAvailability(@PathVariable("id") Long idCarteLibrarie) {
        this.librarieService.updateBookAvailability(idCarteLibrarie);
    }


    @GetMapping("/getLibraryID/{username}/{password}")
    @ResponseBody
    public Long getLibraryId(@PathVariable("username") String username, @PathVariable("password") String password) {
        return this.userService.getUserIdLibrarie(username, password);
    }
}


