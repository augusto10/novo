
package clinica;

import javax.persistence.Entity;
import javax.persistence.Id;


public class medico {
    

@Entity
public class Medico {
   /** @pdOid cabdab3f-3a77-46d6-88db-8e6f336253cb */
    @Id 
   private int crm;
   /** @pdOid 2f77aebf-821b-4baa-96bc-3b7b5a1e062f */
   public java.lang.String nome;
   /** @pdOid 381cb221-0c50-47d5-afa7-d3d97c9a4597 */
   public java.util.Date dataAdmissao;
   /** @pdOid 96841600-bf3b-4ed0-8b1c-db8a6e4011eb */
   public double salario;
   
   public java.util.Collection internacao;

}
    
}
