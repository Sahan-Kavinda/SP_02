import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(3000);//create server socket
            Socket socket = serverSocket.accept();//create local socket
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String massage = dataInputStream.readUTF();
            System.out.println(massage);
            socket.close();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
