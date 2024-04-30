package com.controller.ClientesAPI.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NamedNativeQuery(
        name = "Company.getAll",
        resultClass = Company.class,
        query = "select  " +
                "cli.cliente_id, " +
                "cli.codigo,  " +
                "cli.razao_social, " +
                "cli.endereco, " +
                "cli.atividade_principal, " +
                "cli.regime_apuracao, " +
                "cli.situacao, " +
                "cli.natureza_juridica, " +
                "cli.porte, " +
                "cli.uf, " +
                "cli.municipio, " +
                "cli.data_source, " +
                "cli.last_update as last_update_clientes, " +
                "cli.inscricao_municipal, " +
                "cli.ccp, " +
                "r_pref.name as responsavel_prefeitura, " +
                "cli.last_update_prefeitura, " +
                "cli.inscricao_estadual, " +
                "r_sefaz.responsavel_name as responsavel_sefaz, " +
                "cli.last_update as last_update_sefaz, " +
                "cli.error_message " +
                "from clientes cli left join inscricoes_sefaz i_sefaz on" +
                " cli.inscricao_estadual=i_sefaz.inscricao " +
                "left join responsaveis_sefaz r_sefaz on" +
                " i_sefaz.responsavel_id=r_sefaz.responsavel_id " +
                "left join inscricoes_prefeitura i_pref on" +
                " TO_NUMBER(cli.codigo, '99999999999999')=TO_NUMBER(i_pref.cod_identificacao, '99999999999999') " +
                "left join responsaveis_prefeitura r_pref on" +
                " i_pref.responsavel_prefeitura_id=r_pref.responsavel_prefeitura_id " +
                "order by cli.razao_social;")
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
public class Company {
    @Id
    @Column(name = "cliente_id")
    private int id;
    private String codigo;
    @Column(name = "razao_social")
    private String razaoSocial;
    private String endereco;
    @Column(name = "atividade_principal")
    private String atividadePrincipal;
    @Column(name = "regime_apuracao")
    private String regimeApuracao;
    private String situacao;
    @Column(name = "natureza_juridica")
    private String naturezaJuridica;
    private String porte;
    private String uf;
    private String municipio;
    @Column(name = "data_source")
    private String dataSource;
    @Column(name = "last_update_clientes")
    private String lastUpdateClientes;
    @Column(name = "inscricao_municipal")
    private String inscricaoMunicipal;
    private String ccp;
    @Column(name = "responsavel_prefeitura")
    private String responsavelPrefeitura;
    @Column(name = "last_update_prefeitura")
    private String lastUpdatePrefeitura;
    @Column(name = "inscricao_estadual")
    private String inscricaoEstadual;
    @Column(name = "responsavel_sefaz")
    private String responsavelSefaz;
    @Column(name = "last_update_sefaz")
    private String lastUpdateSefaz;
    @Column(name = "error_message")
    private String errorMessage;
}
