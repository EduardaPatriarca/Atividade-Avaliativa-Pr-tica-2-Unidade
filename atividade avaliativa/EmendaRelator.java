public class EmendaRelator extends Emenda {
    private String apoiador_solicitante;
    private String beneficiario;
    private String relator;
    
    public EmendaRelator(String ano, String autor, String tipo_emenda, String n_emenda, String localidade, String funcao, String subfuncao, String prog_orcamentario, String acao_orcamentaria, String plano_orcamentario, String cod_emenda, double valor_empenhado, double valor_liquidado, double valor_pago, double restos_inscritos, double restos_cancelados, double restos_pagos){
        super();
        this.apoiador_solicitante = apoiador_solicitante;
        this.relator = relator;
    }
    
    public String getApoiador_solicitante(){
        return this.apoiador_solicitante;
    }
    public void setApoiador_solicitante(String apoiador_solicitante){
        if(!apoiador_solicitante.isBlank()){
            this.apoiador_solicitante = apoiador_solicitante;
        }
    }
    
    public String getBeneficiario(){
        return this.beneficiario;
    }
    public void setBeneficiario(String beneficiario){
        if(!beneficiario.isBlank()){
            this.beneficiario = beneficiario;
        }
    }

    public String getRelator(){
        return this.relator;
    }
    public void setRelator(String relator){
        if(!relator.isBlank()){
            this.relator = relator;
        }
    }
}

