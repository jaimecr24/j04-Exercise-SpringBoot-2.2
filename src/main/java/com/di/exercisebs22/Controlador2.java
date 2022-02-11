package com.di.exercisebs22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controlador2 {

    @Autowired ListaCiudadesServiceImp lista;

    @GetMapping("/controlador2/getCiudad")
    public ArrayList<Ciudad> getCiudad()
    {
        return lista.getLista();
    }
}
