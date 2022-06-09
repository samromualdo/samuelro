/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuelro;

/**
 *
 * @author Samuel
 */
public class consulta {

    /**
     * @return the convenio
     */
    public String getConvenio() {
        return convenio;
    }

    /**
     * @param convenio the convenio to set
     */
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    /**
     * @return the id_consulta
     */
    public int getId_consulta() {
        return id_consulta;
    }

    /**
     * @param id_consulta the id_consulta to set
     */
    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    /**
     * @return the id_paciente
     */
    public int getId_paciente() {
        return id_paciente;
    }

    /**
     * @param id_paciente the id_paciente to set
     */
    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    /**
     * @return the id_medico
     */
    public int getId_medico() {
        return id_medico;
    }

    /**
     * @param id_medico the id_medico to set
     */
    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }
    private String convenio;
    private int id_consulta;
    private int id_paciente;
    private int id_medico;
    
}
