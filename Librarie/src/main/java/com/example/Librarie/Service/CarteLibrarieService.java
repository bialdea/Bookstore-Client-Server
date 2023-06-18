package com.example.Librarie.Service;

import com.example.Librarie.Model.CarteLibrarie;
import com.example.Librarie.Repository.CarteLibrariePersistenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarteLibrarieService {
    @Autowired
    private CarteLibrariePersistenta librarieRepo;

    public List<CarteLibrarie> findAll() {
        return (List<CarteLibrarie>) this.librarieRepo.findByOrderByAutorAsc();
    }

    public List<CarteLibrarie> findAllAngajat(int idLibrarie) {
        return this.librarieRepo.findByIdLibrarieOrderByAutorAsc(idLibrarie);
    }

    public String deleteBook(Long idCarteLibrarie){
        try{
            this.librarieRepo.deleteById(idCarteLibrarie);
            return "Stergere realizeaza cu succes!";
        }catch (Exception e){
            return "Nu s-a efectuat stergerea cartii cu ID:" + idCarteLibrarie;
        }
    }

    public String createBook(CarteLibrarie librarie) {
        try {
            this.librarieRepo.save(librarie);
            return "Cartea a fost salvata cu succes!";
        } catch (Exception e) {
            return "Nu s-a putut salva cartea. Eroare: " + e.getMessage();
        }
    }
    public CarteLibrarie updateBook(CarteLibrarie updatedCarte) {
        CarteLibrarie existingCarte = librarieRepo.findById((long) updatedCarte.getIdCarteLibrarie()).orElse(null);

        if (existingCarte != null) {
            existingCarte.setIdCarteLibrarie(updatedCarte.getIdCarteLibrarie());
            existingCarte.setIdLibrarie(updatedCarte.getIdLibrarie());
            existingCarte.setAutor(updatedCarte.getAutor());
            existingCarte.setDisponibil(updatedCarte.getDisponibil());
            existingCarte.setDomeniu(updatedCarte.getDomeniu());
            existingCarte.setEditura(updatedCarte.getEditura());
            existingCarte.setPret(updatedCarte.getPret());
            existingCarte.setTitlu(updatedCarte.getTitlu());
            return librarieRepo.save(existingCarte);
        }
        return null;
    }
    public void updateBookAvailability(Long idCarteLibrarie) {
        CarteLibrarie carte = librarieRepo.findById(idCarteLibrarie).orElse(null);
        if (carte != null) {
            int disponibil = carte.getDisponibil();
            if (disponibil > 0) {
                carte.setDisponibil(disponibil - 1);
                librarieRepo.save(carte);
            }
        }
    }



    public List<CarteLibrarie> filterBooks(String criteria, String filter){
        return this.librarieRepo.filterBooks(criteria, filter);
    }
    public List<Object[]> getDomeniuCount(){return this.librarieRepo.countByDomeniu();}

    public List<Object[]> getEdituraCount(){return this.librarieRepo.countByEditura();}


}
