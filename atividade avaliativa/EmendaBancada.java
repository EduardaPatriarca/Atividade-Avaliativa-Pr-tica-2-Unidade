public class EmendaBancada extends Emenda{
    private String lista_nomes;
    private String link_ata;

    public EmendaBancada(String ano, String autor, String tipo_emenda, String n_emenda, String localidade, String funcao, String subfuncao, String prog_orcamentario, String acao_orcamentaria, String plano_orcamentario, String cod_emenda, double valor_empenhado, double valor_liquidado, double valor_pago, double restos_inscritos, double restos_cancelados, double restos_pagos){
        super();
        this.lista_nomes = lista_nomes;
        this.link_ata = link_ata;
    }

    public String getLista_nomes(){
        return this.lista_nomes;
    }
    public void setLista_nomes(String lista_nomes){
        if(!lista_nomes.isBlank()){
            this.lista_nomes = lista_nomes;
        }
    }

    public String getLink_ata(){
        return this.link_ata;
    }
    public void setLink_ata(String link_ata){
        if(!link_ata.isBlank()){
            this.link_ata = link_ata;
        }
    }
}

