/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samuelro;

/**
 *
 * @author Samuel
 * 
 */
public class medicoDAO extends Conexao 

{
    
    
    public String cadastrarMedico (medico medico)
    {
        try
        {
            String sentenca;
            sentenca = "INSERT INTO MEDICO VALUES(NULL,'" + medico.getNome() + 
                    "','"+ medico.getEspecialidade()+ 
                    "','" + medico.getCPF()+"','"+ medico.getCRM()+"')";
            
            return this.atualizarBanco(sentenca);
        }
         
        catch(Exception e)
        {
            return e.getMessage();
        }       
    }
    
     public String atualizarMedico (medico medico)
     {
         try
         {
             String sentenca;
             sentenca = "UPDATE MEDICO SET NOME = '" + medico.getNome() + 
                     "', ESPECIALIDADE = '" + medico.getEspecialidade() + "',CPF = '" +
                     medico.getCPF() + "'WHERE CRM = " + medico.getCRM();
             
             return this.atualizarBanco(sentenca);
             
         }
         catch(Exception e)
         {
           return e.getMessage();
         
         }     
     
     }
     
     public String excluirMedico (String medico)
     {
         try
         {
         String sentenca;
         sentenca = "DELETE FROM MEDICO WHERE CRM =" + medico;
         return this.atualizarBanco(sentenca);
         
         }
         catch(Exception e){
             return e.getMessage();
         }
         
     
     
     }
     

}

   
    
     
            
