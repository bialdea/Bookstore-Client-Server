package com.example.Librarie.Controller;

import com.example.Librarie.Model.CarteLibrarie;
import com.example.Librarie.Service.CarteLibrarieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RestController

public class ManagerController {
    @Autowired
    private CarteLibrarieService librarieService;
    @GetMapping("/getDomeniuCount")
    @ResponseBody
    public List<Object[]> getDomeniuCount(){return this.librarieService.getDomeniuCount();
    }

    @GetMapping("/getEdituraCount")
    @ResponseBody
    public List<Object[]> getEdituraCount(){
        return this.librarieService.getEdituraCount();
    }

    @GetMapping("/filterBooks/{criteria}/{filter}")
    @ResponseBody
    public List<CarteLibrarie> filterBooks(@PathVariable("criteria") String criteria, @PathVariable("filter") String filter){
        return this.librarieService.filterBooks(criteria, filter);
    }
}
