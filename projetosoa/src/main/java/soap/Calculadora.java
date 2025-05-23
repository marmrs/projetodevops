package soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class Calculadora {
       @WebMethod(action = "somar")
       public int somar(
                    @WebParam(name = "numero1") int numero1,
                    @WebParam(name = "numero2") int numero2) {
             return numero1 + numero2;
       }     
       
   	@WebMethod(action = "subtrair")
   	public int subtrair(
   			@WebParam(name = "numero1") int numero1, 
   			@WebParam(name = "numero2") int numero2) {
   		return numero1 - numero2;
   	}
 
   	@WebMethod(action = "dividir")
   	public int dividir(
   			@WebParam(name = "numero1") int numero1, 
   			@WebParam(name = "numero2") int numero2) {
   		return numero1 / numero2;
   	}
   	
   	@WebMethod(action = "multiplicar")
   	public int multiplicar(
   			@WebParam(name = "numero1") int numero1, 
   			@WebParam(name = "numero2") int numero2) {
   		return numero1 * numero2;
   	}
}