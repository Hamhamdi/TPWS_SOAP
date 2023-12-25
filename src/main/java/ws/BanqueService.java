package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;
import java.util.Date;

@WebService(serviceName = "BanqueWs")
public class BanqueService {

    @WebMethod(operationName = "conversionEuToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return mt*11;

    }
    @WebMethod
    public Compte getCompte(@WebParam(name ="code") int code){
        return new Compte(code, Math.random()*60000, new Date());
    }

    @WebMethod
    public List<Compte> ListComptes(){
        return List.of(
                new Compte(1, Math.random()*60000, new Date()),
                new Compte(2, Math.random()*60000, new Date()),
                new Compte(3, Math.random()*60000, new Date())
        );
    }



}
