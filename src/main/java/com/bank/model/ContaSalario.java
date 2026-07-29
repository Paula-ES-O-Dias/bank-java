package com.bank.model;

import java.math.BigDecimal;

public class ContaSalario extends Conta{
    private String fonteEmpresarial;

    public ContaSalario () {

    }

    public ContaSalario (
            Long numero,
            String cpf,
            Long agencia,
            BigDecimal saldo,
            String fonteEmpresarial
    ){
        super (numero, cpf, agencia, saldo);
        this.fonteEmpresarial = fonteEmpresarial;
    }

    public String getFonteEmpresarial () {
        return fonteEmpresarial;
    }

    public void setFonteEmpresarial (String fonteEmpresarial) {
        this.fonteEmpresarial = fonteEmpresarial;
    }
}
