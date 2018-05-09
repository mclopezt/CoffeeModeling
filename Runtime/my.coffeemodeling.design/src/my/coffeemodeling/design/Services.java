package my.coffeemodeling.design;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import CoffeeModeling.Agua;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    
    public List<Agua> aguaUsada(){
    	
    	List<Agua> gastoAgua=new ArrayList<Agua>();
    	
    
    	for (Agua agua : gastoAgua) {
			
		}
    	
    	return gastoAgua;
    }
    
    
    
}
