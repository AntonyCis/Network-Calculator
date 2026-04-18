package test;

import entidades.Cliente;

import java.util.Scanner;

public class TestCliente {
    public static void main(String[] args) throws Exception {
         Cliente cliente = new Cliente();
         Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la operacion: ");
         String operacion = scanner.nextLine();
         System.out.println("Ingrese el primer numero: ");
         double n1 = scanner.nextDouble();
         System.out.println("Ingrese el segundo numero: ");
         double n2 = scanner.nextDouble();
         cliente.enviar("192.168.100.83", 5000, n1, n2, operacion);
    }
}
