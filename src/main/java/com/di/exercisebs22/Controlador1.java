package com.di.exercisebs22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Controlador1 {

    @Autowired ListaCiudadesService lista;

    @PostMapping("/controlador1/addCiudad")
    public String addCiudad(@RequestBody Map<String,Object> body) {
        String error = "Error en los datos de entrada";
        if (body==null) return error;
        if (body.get("nombre")==null) return error;
        if (body.get("numeroHabitantes")==null) return error;
        lista.addCiudad(new Ciudad(body.get("nombre").toString(), Integer.parseInt(body.get("numeroHabitantes").toString())));
        return "Ciudad añadida a la lista.";
    }
}

//Equivalente sin @autowired:
/*public class Controlador1 {

    ListaCiudadesService lista;

    void Controlador1(ListaCiudadesService lista){ this.lista = lista; }
}
*/

