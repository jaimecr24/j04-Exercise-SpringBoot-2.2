package com.di.exercisebs22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @Autowired ListaCiudadesServiceImp lista;

    @PostMapping("/controlador1/addciudad")
    public Ciudad addCiudad(@RequestBody Ciudad newCiudad)
    {
        lista.addCiudad(newCiudad);
        return newCiudad;
    }
}
