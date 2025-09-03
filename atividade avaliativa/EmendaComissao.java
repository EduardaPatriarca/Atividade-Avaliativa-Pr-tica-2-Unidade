public class EmendaComissao extends Emenda{
    private String apoiador_solicitante;
    private String nome_deputado;
    
    public EmendaComissao(String ano, String autor, String tipo_emenda, String n_emenda, String localidade, String funcao, String subfuncao, String prog_orcamentario, String acao_orcamentaria, String plano_orcamentario, String cod_emenda, double valor_empenhado, double valor_liquidado, double valor_pago, double restos_inscritos, double restos_cancelados, double restos_pagos){
        super();
        this.apoiador_solicitante = apoiador_solicitante;
        this.nome_deputado = nome_deputado;
    }


    public String getApoiador_solicitante(){
        return this.apoiador_solicitante;
    }
    public void setApoiador_solicitante(String apoiador_solicitante){
        if(!apoiador_solicitante.isBlank()){
            this.apoiador_solicitante = apoiador_solicitante;
        }
    }

    public String getNome_deputado(){
        return this.nome_deputado;
    }
    public void setNome_deputado(String nome_deputado){
        if(!nome_deputado.isBlank()){
            this.nome_deputado = nome_deputado;
        }
    }
}
