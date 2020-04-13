package operation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import types.Tovar;
import java.util.ArrayList;

public class TovarOperationImpl extends UnicastRemoteObject implements TovarOperation {
    static List<Tovar> IstTovar = new ArrayList<Tovar>();
 
    public TovarOperationImpl() throws RemoteException{}
    
    @Override
    public List<Tovar> getListOfTovar() throws RemoteException
    {
        return IstTovar;
    }
    @Override
    public List<Tovar> addNewTovar(Tovar item) throws RemoteException
    {
        IstTovar.add(item);
        return IstTovar;
    }
  
    @Override
    public int getSumofTovar() throws RemoteException{
        int sum = 0;
        for ( Tovar tovar: IstTovar)
        sum += tovar.getKol() * tovar.getPrice();
        return sum;
    }
}
