package com.bank.repository;

import com.bank.model.Agencia;

import java.util.List;

public interface AgenciaRepository {
    public void adicionar (Agencia agencia);
    public Agencia ler (Long id);
    public Agencia atualizar (Long id, Agencia novaAgencia);
    public void deletar (Long id);

    public List <Agencia> listarAgencias ();

}
