package com.di.exercisebs22;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ListaCiudadesServiceImp implements ListaCiudadesService
{
    ArrayList<Ciudad> lista = new ArrayList<>();

    public ListaCiudadesServiceImp()
    {
        lista.add(new Ciudad("Castellón",172589));
        lista.add(new Ciudad("Villareal",51130));
    }

    public ArrayList<Ciudad> getLista()
    {
        return lista;
    }

    public void addCiudad(Ciudad c)
    {
        lista.add(c);
    }
}
