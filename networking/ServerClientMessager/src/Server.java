import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server
{
    private ServerSocket serverSocket;
    private static Boolean startListening = false;

    public Server(ServerSocket serverSocket)
    {
        this.serverSocket = serverSocket;
    }

    public void startServer()
    {
        try {
            while(!serverSocket.isClosed())
            {
                Socket socket = serverSocket.accept();
                if (startListening)
                    System.out.println("### New client has connected!");
                else {
                    System.out.println("### Press ENTER to start listening sockets!");
                    startListening = true;
                }
                ClientHandler clientHandler = new ClientHandler(socket);

                Thread thread = new Thread(clientHandler);
                thread.start();
            }
        } catch (IOException e) {
            closeServerSocket();
        }
    }

    public void sendMessage()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Scanner scanner = new Scanner(System.in);
                Socket socket = null;
                String msg;
                try {
                    socket = new Socket("localhost",1713);
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    while(true)
                    {
                        msg = scanner.nextLine();
                        bufferedWriter.write("BigBrother (Server): " + msg);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void closeServerSocket()
    {
        try {
            if(serverSocket != null)
            {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String [] args) throws IOException
    {
        ServerSocket serverSocket = new ServerSocket(1713);
        Server server = new Server(serverSocket);
        server.sendMessage();
        server.startServer();
    }
}