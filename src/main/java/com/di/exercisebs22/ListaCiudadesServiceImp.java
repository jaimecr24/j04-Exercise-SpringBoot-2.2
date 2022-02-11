package com.di.exercisebs22;

import java.util.ArrayList;

public class ListaCiudadesServiceImp implements ListaCiudadesService
{
    ArrayList<Ciudad> lista = new ArrayList<>();

    public ArrayList<Ciudad> getLista()
    {
        return lista;
    }

    public void addCiudad(Ciudad c)
    {
        lista.add(c);
    }
}
