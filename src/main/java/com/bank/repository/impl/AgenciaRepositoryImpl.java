package com.bank.repository.impl;

import com.bank.model.Agencia;
import com.bank.repository.AgenciaRepository;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRepositoryImpl implements AgenciaRepository {
    private List <Agencia> dataBase = new ArrayList <> ();
    @Override
    public void adicionar(Agencia agencia) {
        dataBase.add(agencia);
    }

    @Override
    public Agencia ler(Long id) {
        return null;
    }

    @Override
    public Agencia atualizar(Long id, Agencia novaAgencia) {
        return null;
    }

    @Override
    public void deletar(Long id) {

    }

    @Override
    public List<Agencia> listarAgencias() {
        return List.of();
    }
}
