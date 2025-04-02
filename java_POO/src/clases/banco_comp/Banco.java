package clases.banco_comp;

import clases.banco_comp.Cuenta;

import java.util.ArrayList;
import java.util.Scanner;
public class Banco {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        boolean running = true;

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Cuenta> cuentas = new ArrayList<>();

        while (running){
            System.out.println("\n1. Crear nuevo cliente\n2. Actualizar información del cliente" +
                    "\n3. Crear cuenta bancaria\n4. Realizar deposito y retiro\n5. Salir");
            System.out.print("Opcion: ");
            int opcion = s.nextInt();
            switch (opcion){
                case 1:

                    System.out.println("\nIngrese los datos del cliente: ");
                    System.out.print("Id: ");
                    int clienteId = s.nextInt();
                    s.nextLine();
                    System.out.print("Nombre: ");
                    String clienteNombre = s.nextLine();

                    Cliente cliente = new Cliente(clienteId, clienteNombre);
                    clientes.add(cliente);
                    break;
                case 2:
                    if(clientes.toArray().length > 0){
                        System.out.print("Id de cliente a modificar: ");
                        int idModificar = s.nextInt();

                        clientes.forEach( (clienteModificar -> {
                            if(clienteModificar.getId() == idModificar){
                                System.out.print("Ingrese el nuevo nombre: ");
                                s.nextLine();
                                String nuevoNombre = s.nextLine();
                                clienteModificar.setNombre(nuevoNombre);

                                System.out.println("\nDatos del nuevo cliente: "+clienteModificar);

                            }else{
                                System.out.println("\nNingun cliente coincide con el id proporcionado");
                            }
                        }) );
                    }else{
                        System.out.println("\nNo hay clientes por modificar");
                    }


                    break;
                case 3:

                    if (clientes.toArray().length > 0){
                        System.out.println("\nClientes elegibles para cuenta: ");
                        ArrayList<Integer> clientesConCuenta = new ArrayList<>();

                        cuentas.forEach((cuenta -> {
                            clientesConCuenta.add(cuenta.getClienteId());
                        }));

                        clientes.forEach((clienteDisponible -> {
                            if( !clientesConCuenta.contains(clienteDisponible.getId()) ){
                                System.out.println(clienteDisponible);
                            }
                        }));

                        System.out.print("\nElija el cliente al que le asignará la cuenta: ");
                        int clienteDisponibleId = s.nextInt();

                        if(clientesConCuenta.contains(clienteDisponibleId)){
                            System.out.println("\nCliente no elegible para cuenta");
                        }else{
                            Cuenta cuenta = new Cuenta(clienteDisponibleId);
                            cuentas.add(cuenta);
                            System.out.println("\nCuenta creada exitosamente");
                        }
                    }else{
                        System.out.println("\nNo hay clientes para crear cuentas");
                    }

                    break;
                case 4:

                    if(cuentas.toArray().length > 0){
                        System.out.println("\nElija la cuenta a modificar:");
                        cuentas.forEach((System.out::println));
                        int cuentaModificar = s.nextInt();

                        // Esto se pudo haber hecho con un for (cuenta : cuentas)
                        cuentas.forEach((cuenta -> {
                            if(cuenta.getClienteId() == cuentaModificar){
                                double balanceActual = cuenta.getBalance();
                                System.out.println("\nEstado de la cuenta: $"+balanceActual);

                                System.out.print("1. Deposito\n2. Retiro");
                                System.out.println("\nQue accion quiere realizar: ");
                                int accion = s.nextInt();

                                switch (accion){
                                    case 1:
                                        System.out.print("\nIngrese la cantidad a depositar:");
                                        double dineroAgregar = s.nextInt();
                                        double nuevoBalanceAgregar = balanceActual + dineroAgregar;

                                        cuenta.setBalance(nuevoBalanceAgregar);
                                        System.out.println("\nSe ingresaron: $"+dineroAgregar+"\nNuevo balance: $"+cuenta.getBalance());

                                        break;
                                    case 2:
                                        System.out.print("\nIngrese la cantidad a remover:");
                                        double dineroRemover = s.nextInt();
                                        double nuevoBalanceRemover = balanceActual - dineroRemover;

                                        cuenta.setBalance(nuevoBalanceRemover);
                                        System.out.println("\nSe removieron: $"+dineroRemover+"\nNuevo balance: $"+cuenta.getBalance());
                                        break;
                                }
                            }
                        }));

                    }else{
                        System.out.println("\nNo hay cuentas por modificar");
                    }

                    break;
                case 5:
                    System.out.println("\nAdios");
                    running = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
