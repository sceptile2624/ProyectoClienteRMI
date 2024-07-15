import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ImageProcessor extends Remote {
    byte[] applyFilter(byte[] imageBytes) throws RemoteException;
}