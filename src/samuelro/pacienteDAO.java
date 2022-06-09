/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuelro;

/**
 *
 * @author Gabriella
 */
public class pacienteDAO extends Conexao{
    
     public String cadastrarPaciente (paciente paciente)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO PACIENTE VALUES(NULL,'" + paciente.getNome() + 
                    "','"+ paciente.getIdade()+ 
                    "','" +paciente.getCPF()+"')";
            
            return this.atualizarBanco(sentenca);
        }
         
        catch(Exception e)
        {
            return e.getMessage();
        }       
    }
    
     public String atualizarPaciente (paciente paciente)
     {
         try
         {
             String sentenca;
             sentenca = "UPDATE PACIENTE SET NOME = '" + paciente.getNome() + 
                     "', IDADE = '" + paciente.getIdade() + "',CPF = '" +
                     paciente.getCPF();
             
             return this.atualizarBanco(sentenca);
             
         }
         catch(Exception e)
         {
           return e.getMessage();
         
         }     
     
     }
     
     public String excluirPaciente (String paciente)
     {
         try
         {
         String sentenca;
         sentenca = "DELETE FROM PACIENTE WHERE CPF =" + paciente;
         return this.atualizarBanco(sentenca);
         
         }
         catch(Exception e){
             return e.getMessage();
         }
         
     
     
     }
    
}
