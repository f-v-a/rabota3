package operation;

import java.rmi.Remote;
import java.rmi.RemoteException;
import types.Tovar;
import java.util.List;

public interface TovarOperation extends Remote{
    List<Tovar> getListOfTovar() throws RemoteException;
    List<Tovar> addNewTovar(Tovar item) throws RemoteException;
    int getSumofTovar() throws RemoteException;
    
}
