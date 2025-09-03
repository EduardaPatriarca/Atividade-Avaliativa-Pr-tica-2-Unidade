public class Emenda{
    private String ano;
    private String autor;
    private String tipo_emenda;
    private String n_emenda;
    private String localidade;
    private String funcao;
    private String subfuncao;
    private String prog_orcamentario;
    private String acao_orcamentaria;
    private String plano_orcamentario;
    private String cod_emenda;
    private double valor_empenhado;
    private double valor_liquidado;
    private double valor_pago;
    private double restos_inscritos;
    private double restos_cancelados;
    private double restos_pagos;

    public String getAno(){
        return this.ano;
    }
    public void setAno(String ano){
        if(!ano.isBlank()){
            this.ano = ano;
        }
    }

    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String autor){
        if(!autor.isBlank()){
            this.autor = autor;
        }
    }

    public String getTipo(){
        return this.tipo_emenda;
    }
    public void setTipo(String tipo_emenda){
        if(!tipo_emenda.isBlank()){
            this.tipo_emenda = tipo_emenda;
        }
    }

    public String getN_emenda(){
        return this.n_emenda;
    }
    public void setN_emenda(String n_emenda){
        if(!n_emenda.isBlank()){
            this.n_emenda = n_emenda;
        }
    }

    public String getLocalidade(){
        return this.localidade;
    }
    public void setLocalidade(String localidade){
        if(!localidade.isBlank()){
            this.localidade = localidade;
        }
    }

    public String getFuncao(){
        return this.funcao;
    }
    public void setFuncao(String funcao){
        if(!funcao.isBlank()){
            this.funcao = funcao;
        }
    }

    public String getSubfuncao(){
        return this.subfuncao;
    }
    public void setSubfuncao(String subfuncao){
        if(!subfuncao.isBlank()){
            this.subfuncao = subfuncao;
        }
    }

    public String getProg(){
        return this.prog_orcamentario;
    }
    public void setProg(String prog_orcamentario){
        if(!prog_orcamentario.isBlank()){
            this.prog_orcamentario = prog_orcamentario;
        }
    }

    public String getAcao(){
        return this.acao_orcamentaria;
    }
    public void setAcao(String acao_orcamentaria){
        if(!acao_orcamentaria.isBlank()){
            this.acao_orcamentaria = acao_orcamentaria;
        }
    }

    public String getPlano(){
        return this.plano_orcamentario;
    }
    public void setPlano(String plano_orcamentario){
        if(!plano_orcamentario.isBlank()){
            this.plano_orcamentario = plano_orcamentario;
        }
    }

    public String getCodigo(){
        return this.cod_emenda;
    }
    public void setCodigo(String cod_emenda){
        if(!cod_emenda.isBlank()){
            this.cod_emenda = cod_emenda;
        }
    }

    public double getValor_empenhado(){
        return this.valor_empenhado;
    }
    public void setValor_empenhado(double valor_empenhado){
        if(valor_empenhado >= 0){
            this.valor_empenhado = valor_empenhado;
        }
    }

    public double getValor_liquidado(){
        return this.valor_liquidado;
    }
    public void setValor_liquidado(double valor_liquidado){
        if(valor_liquidado >= 0){
            this.valor_liquidado = valor_liquidado;
        }
    }

    public double getValor_pago(){
        return this.valor_pago;
    }
    public void setValor_pago(double valor_pago){
        if(valor_pago >= 0){
            this.valor_pago = valor_pago;
        }
    }   

    public double getRestos_inscritos(){
        return this.restos_inscritos;
    }
    public void setRestos_inscritos(double restos_inscritos){
        if(restos_inscritos >= 0){
            this.restos_inscritos = restos_inscritos;
        }
    }

    public double getRestos_cancelados(){
        return this.restos_cancelados;
    }
    public void setRestos_cancelados(double restos_cancelados){
        if(restos_cancelados >= 0){
            this.restos_cancelados = restos_cancelados;
        }
    }
    public double getRestos_pagos(){
        return this.restos_pagos;
    }
    public void setRestos_pagos(double restos_pagos){
        if(restos_pagos >= 0){
            this.restos_pagos = restos_pagos;
        }
    }
}
