
package modelo;


public class ModeloExame {
    
     private int code;
    private ModeloPaciente paciente = new ModeloPaciente();
   
    private String tipoexame;
    
    private String data;
    private String hora;
    private String local;
   
    private String pesquisa;

    /**
     * @return the tipoexame
     */
    public String getTipoexame() {
        return tipoexame;
    }

    /**
     * @param tipoexame the tipoexame to set
     */
    public void setTipoexame(String tipoexame) {
        this.tipoexame = tipoexame;
    }
    
    

    
    
   

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(int code) {
        this.code = code;
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
    
    
    
    
}
