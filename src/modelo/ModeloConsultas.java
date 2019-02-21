
package modelo;


public class ModeloConsultas {

   
    

    private int codc;
   
    private ModeloPaciente paciente = new ModeloPaciente();
    private ModeloMedico medico = new ModeloMedico();
    
    private String data;
    private String hora;
    private String local;
   
    private String pesquisa;
    
   private String pesquisames1;
   private String pesquisames2;
   
    
    
    /**
     * @return the codc
     */
    public int getCodc() {
        return codc;
    }

    /**
     * @param codc the codc to set
     */
    public void setCodc(int codc) {
        this.codc = codc;
    }

   
   

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
    /**
     * @return the paciente
     */
    public ModeloPaciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(ModeloPaciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the medico
     */
    public ModeloMedico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(ModeloMedico medico) {
        this.medico = medico;
    }
     /**
     * @return the pesquisames1
     */
    public String getPesquisames1() {
        return pesquisames1;
    }

    /**
     * @param pesquisames1 the pesquisames1 to set
     */
    public void setPesquisames1(String pesquisames1) {
        this.pesquisames1 = pesquisames1;
    }

    /**
     * @return the pesquisames2
     */
    public String getPesquisames2() {
        return pesquisames2;
    }

    /**
     * @param pesquisames2 the pesquisames2 to set
     */
    public void setPesquisames2(String pesquisames2) {
        this.pesquisames2 = pesquisames2;
    }

}
