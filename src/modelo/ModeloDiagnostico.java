
package modelo;


public class ModeloDiagnostico {
    
     private int codd;
    
    private ModeloPaciente paciente = new ModeloPaciente();
    private ModeloExame exame = new ModeloExame();
    
    private String resultado;
   
    private String pesquisa;

    
    
    
    
    /**
     * @return the codd
     */
    public int getCodd() {
        return codd;
    }

    /**
     * @param codd the codd to set
     */
    public void setCodd(int codd) {
        this.codd = codd;
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
     * @return the exame
     */
    public ModeloExame getExame() {
        return exame;
    }

    /**
     * @param exame the exame to set
     */
    public void setExame(ModeloExame exame) {
        this.exame = exame;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
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
