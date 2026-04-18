package entidades;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {

    public String enviar (String IP, int puerto, double n1, double n2, String operacion) throws Exception {
        //Crear el socket
        DatagramSocket socket = new DatagramSocket();
        InetAddress direccion = InetAddress.getByName(IP);

        //Enviar la peticióm
        String datos = operacion + "," +n1+","+n2;
        byte [] bufferS = String.valueOf(datos).getBytes();
        DatagramPacket salida = new DatagramPacket(bufferS, bufferS.length,direccion,puerto);
        socket.send(salida);

        // Recibir respuesta
        byte [] bufferE = new byte[1024];
        DatagramPacket entrada = new DatagramPacket(bufferE, bufferE.length);
        socket.receive(entrada);

        String respuesta = new String(entrada.getData(),0,entrada.getLength());
        System.out.println("La Respuesta es: " + respuesta);
        socket.close();

        return respuesta;
    }



}
