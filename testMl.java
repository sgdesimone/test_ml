  
import java.util.Scanner;

public class PedirDatos {

    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        String siteId=data.nextLine();
        int sellerId=entrada.nextInt();
        
    }
    
    session.beginTransaction();
        	
   	Items items  = new Items();
        	
   	items = (Items) session.createQuery(" from items where sellerId = " + sellerId + "and siteId = " + siteId ).uniqueResult();
    	
    session.save(users);


}


/* este script en java al momento de ejecutarlo pedira por consola, datos a ingresar (en ese caso seller_id y site_id) y por medio de Hibernate 
ejecua la consulta en la base de datos*/
