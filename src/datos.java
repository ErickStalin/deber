import java.util.Scanner;
public class datos {
    Scanner entrada = new Scanner(System.in);
    //Declaracion de objetos
    vehiculo v1 = new vehiculo("","","",0);
    vehiculo v2 = new vehiculo("","","",0);
    vehiculo v3 = new vehiculo("","","",0);
    vehiculo v4 = new vehiculo("","","",0);
    vehiculo v5 = new vehiculo("","","",0);
    String marca,placa,color;
    int llantas;
    int op, aux2;
    public void mostrar(){
        aux2 = 0;
        op = -1;
        while (op !=0){
            System.out.println("MENU DE AUTOS");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Ver datos");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opcion: ");
            op = entrada.nextInt();
            if(op == 1){
                aux2++;
                System.out.println("---REGISTRO DE AUTOS---");
                System.out.println("AUTO 1");
                System.out.print("Ingrese la marca del auto: ");
                marca = entrada.next();
                v1.setMar(marca);
                System.out.print("\nIngrese el color del auto: ");
                color = entrada.next();
                v1.setCol(color);
                System.out.print("\nIngrese la placa del auto: ");
                placa = entrada.next();
                v1.setPla(placa);
                System.out.print("\nIngrese el numero de llantas del auto: ");
                llantas = entrada.nextInt();
                v1.setAcientos(llantas);
                System.out.println("AUTO 2");
                System.out.print("Ingrese la marca del auto: ");
                marca = entrada.next();
                v2.setMar(marca);
                System.out.print("\nIngrese el color del auto: ");
                color = entrada.next();
                v2.setCol(color);
                System.out.print("\nIngrese la placa del auto: ");
                placa = entrada.next();
                v2.setPla(placa);
                System.out.print("\nIngrese el numero de llantas del auto: ");
                llantas = entrada.nextInt();
                v2.setAcientos(llantas);
                System.out.println("AUTO 3");
                System.out.print("Ingrese la marca del auto: ");
                marca = entrada.next();
                v3.setMar(marca);
                System.out.print("\nIngrese el color del auto: ");
                color = entrada.next();
                v3.setCol(color);
                System.out.print("\nIngrese la placa del auto: ");
                placa = entrada.next();
                v3.setPla(placa);
                System.out.print("\nIngrese el numero de llantas del auto: ");
                llantas = entrada.nextInt();
                v3.setAcientos(llantas);
                System.out.println("AUTO 4");
                System.out.print("Ingrese la marca del auto: ");
                marca = entrada.next();
                v4.setMar(marca);
                System.out.print("\nIngrese el color del auto: ");
                color = entrada.next();
                v4.setCol(color);
                System.out.print("\nIngrese la placa del auto: ");
                placa = entrada.next();
                v4.setPla(placa);
                System.out.print("\nIngrese el numero de llantas del auto: ");
                llantas = entrada.nextInt();
                v4.setAcientos(llantas);
                System.out.println("AUTO 5");
                System.out.print("Ingrese la marca del auto: ");
                marca = entrada.next();
                v5.setMar(marca);
                System.out.print("\nIngrese el color del auto: ");
                color = entrada.next();
                v5.setCol(color);
                System.out.print("\nIngrese la placa del auto: ");
                placa = entrada.next();
                v5.setPla(placa);
                System.out.print("\nIngrese el numero de llantas del auto: ");
                llantas = entrada.nextInt();
                v5.setAcientos(llantas);
            }
            if(op == 2){
                if(aux2 > 0){
                    System.out.println("---DATOS REGISTRADOS---");
                    System.out.println("    AUTO 1");
                    System.out.println("Marca: "+v1.getMar());
                    System.out.println("Color: "+v1.getCol());
                    System.out.println("Placa: "+v1.getPla());
                    System.out.println("Nro de llantas: "+v1.getAcientos());
                    System.out.println("    AUTO 2");
                    System.out.println("Marca: "+v2.getMar());
                    System.out.println("Color: "+v2.getCol());
                    System.out.println("Placa: "+v2.getPla());
                    System.out.println("Nro de llantas: "+v2.getAcientos());
                    System.out.println("    AUTO 3");
                    System.out.println("Marca: "+v1.getMar());
                    System.out.println("Color: "+v1.getCol());
                    System.out.println("Placa: "+v1.getPla());
                    System.out.println("Nro de llantas: "+v1.getAcientos());
                    System.out.println("    AUTO 4");
                    System.out.println("Marca: "+v4.getMar());
                    System.out.println("Color: "+v4.getCol());
                    System.out.println("Placa: "+v4.getPla());
                    System.out.println("Nro de llantas: "+v4.getAcientos());
                    System.out.println("    AUTO 5");
                    System.out.println("Marca: "+v5.getMar());
                    System.out.println("Color: "+v5.getCol());
                    System.out.println("Placa: "+v5.getPla());
                    System.out.println("Nro de llantas: "+v5.getAcientos());
                }
                else{
                    System.out.println("PRIMERO INGRESE DATOS!!");
                }
            }
        }
    }
}

