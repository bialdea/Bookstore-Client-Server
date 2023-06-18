package com.example.Librarie.Controller;
import com.example.Librarie.DTO.LoginDTO;
import com.example.Librarie.Model.Utilizator;
import com.example.Librarie.Service.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private UtilizatorService utilizatorService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginDTO loginDTO) {
        Map<String, String> response = new HashMap<>();
            Utilizator utilizator = utilizatorService.getUserCredentials(loginDTO.getUsername(), loginDTO.getPassword());
            if (utilizator != null) {
                response.put("message", "Login successful.");
                response.put("tip", utilizator.getTip());
                return ResponseEntity.status(HttpStatus.OK).body(response);
            } else {
                response.put("message", "Invalid username or password.");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
            }

    }
}
