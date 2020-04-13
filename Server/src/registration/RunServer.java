package registration;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import operation.TovarOperationImpl;
public class RunServer {

public static void main (String[] argv) {
try {
// создание экземпляров классов для регистрации
TovarOperationImpl operationImpl = new TovarOperationImpl();
// создаём реестр
Registry registry = LocateRegistry.createRegistry(1199);
// регистрация классов
registry.bind("rmiTest02", operationImpl);
System.out.println ("Все готово");
} catch (Exception e) {
System.out.println ("Ошибка " + e);
}
}
}
