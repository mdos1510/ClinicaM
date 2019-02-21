
package modelo;

//declaração dos atriburos e métodos gets e sets
public class ModeloMedico {
    private int cod_med;
    private String nome_med;
    private int crm_med;
    private String especialidade_med;
    private String end_med;
    private String tel_med;
    
    private String pesqui_med;

    
    public int getCod_med() {
        return cod_med;
    }

    
    public void setCod_med(int cod_med) {
        this.cod_med = cod_med;
    }

    
    public String getNome_med() {
        return nome_med;
    }

    
    public void setNome_med(String nome_med) {
        this.nome_med = nome_med;
    }

    
    public int getCrm_med() {
        return crm_med;
    }

   
    public void setCrm_med(int crm_med) {
        this.crm_med = crm_med;
    }

   
    public String getEspecialidade_med() {
        return especialidade_med;
    }

    
    public void setEspecialidade_med(String especialidade_med) {
        this.especialidade_med = especialidade_med;
    }

    
    public String getEnd_med() {
        return end_med;
    }

    
    public void setEnd_med(String end_med) {
        this.end_med = end_med;
    }

    
    public String getTel_med() {
        return tel_med;
    }

    
    public void setTel_med(String tel_med) {
        this.tel_med = tel_med;
    }

    /**
     * @return the pesqui_med
     */
    public String getPesqui_med() {
        return pesqui_med;
    }

    /**
     * @param pesqui_med the pesqui_med to set
     */
    public void setPesqui_med(String pesqui_med) {
        this.pesqui_med = pesqui_med;
    }
    
   
}