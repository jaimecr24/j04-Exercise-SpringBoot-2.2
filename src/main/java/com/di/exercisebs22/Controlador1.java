package com.di.exercisebs22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

    @Autowired ListaCiudadesService lista;

    @PostMapping("/controlador1/addCiudad")
    public void addCiudad(@RequestBody Ciudad newCiudad)
    {
        lista.addCiudad(newCiudad);
    }
}

//Equivalente sin @autowired:
/*public class Controlador1 {

    ListaCiudadesService lista;

    void Controlador1(ListaCiudadesService lista){ this.lista = lista; }
}
*/

