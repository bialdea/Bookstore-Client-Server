package com.example.Librarie.Service;

import com.example.Librarie.Model.Utilizator;
import com.example.Librarie.Repository.UtilizatorPersistenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UtilizatorService {
    @Autowired
    private UtilizatorPersistenta userRepo;

    public List<Utilizator> getUsers(){
        return(List<Utilizator>) this.userRepo.findAll();
    }
    public Optional<Utilizator> getUserById(Long id){
        return this.userRepo.findById(id);
    }

    public Utilizator insertUser(Utilizator user){
        return this.userRepo.save(user);
    }
    public String deleteUser(Long idUtilizator){
        try{
            this.userRepo.deleteById(idUtilizator);
            return "Stergere realizeaza cu succes!";
        }catch (Exception e){
            return "Nu s-a efectuat stergerea utilizatorului cu ID:" + idUtilizator;
        }
    }
    public Utilizator updateUser(Utilizator updatedUser) {
        Utilizator existingUser = userRepo.findById(updatedUser.getIdUtilizator()).orElse(null);

        if (existingUser != null) {
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setParola(updatedUser.getParola());
            existingUser.setTip(updatedUser.getTip());
            existingUser.setIdLibrarie(updatedUser.getIdLibrarie());
            return userRepo.save(existingUser);
        }
        return null;
    }
    public Utilizator getUserCredentials(String username, String password){
        return this.userRepo.findByUsernameAndParola(username, password);
    }
    public Long getUserIdLibrarie(String username, String password) {
        Utilizator utilizator = userRepo.findByUsernameAndParola(username, password);
        if (utilizator != null) {
            return utilizator.getIdLibrarie();
        }
        return null;
    }

}
