public class EmendaIndividual extends Emenda{
    private String projeto;
    private String licitacao;
    private String comprovacao;

    public EmendaIndividual(String ano, String autor, String tipo_emenda, String n_emenda, String localidade, String funcao, String subfuncao, String prog_orcamentario, String acao_orcamentaria, String plano_orcamentario, String cod_emenda, double valor_empenhado, double valor_liquidado, double valor_pago, double restos_inscritos, double restos_cancelados, double restos_pagos){
        super();
        this.projeto = projeto;
        this.licitacao = licitacao;
        this.comprovacao = comprovacao;
    }

    public String getProjeto(){
        return this.projeto;
    }
    public void setProjeto(String projeto){
        if(!projeto.isBlank()){
            this.projeto = projeto;
        }
    }

    public String getLicitacao(){
        return this.licitacao;
    }
    public void setLicitacao(String licitacao){
        if(!licitacao.isBlank()){
            this.licitacao = licitacao;
        }
    }

    public String getComprovacao(){
        return this.comprovacao;
    }
    public void setComprovacao(String comprovacao){
        if(!comprovacao.isBlank()){
            this.comprovacao = comprovacao;
        }
    }
    
}