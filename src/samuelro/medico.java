/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuelro;

/**
 *
 * @author Samuel
 */
public class medico {

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

    /**
     * @return the Especialidade
     */
    public int getEspecialidade() {
        return Especialidade;
    }

    /**
     * @param Especialidade the Especialidade to set
     */
    public void setEspecialidade(int Especialidade) {
        this.Especialidade = Especialidade;
    }

    /**
     * @return the CRM
     */
    public int getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    private int id_medico;
    private int Especialidade;
    private int CRM;
    private String nome;
    private String CPF;
}
