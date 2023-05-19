/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_luisvarela;
import java.util.Scanner;
/**
 *
 * @author Luis Andres Varela
 */
public class Examen1P1_LuisVarela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        boolean salir=true;
        while(salir){
            System.out.println("1.Sumador Binario");
            System.out.println("2.Estrella de David");
            System.out.println("3.Salir");
            int opciones=lea.nextInt();
            switch(opciones){
                case 1:{
                    String respuesta="";
                    System.out.println("Ingrese el primer número:");
                    String num1=lea.next();
                    //le pido el primer numero al usuario
                    System.out.println("Ingrese el segundo número:");
                    String num2=lea.next();
                    //le pido el segundo numero al usuario
                    int i=0;
                    boolean primera_c=true;
                    int segundo_c=0;
                    if(num1.length()!=num2.length()){
                        System.out.println("Los números deben de tener el mismo número de bits");
                        primera_c=false;
                    }
                    if(primera_c){
                        //aqui hice un ciclo for para ver si solo hay 0 y 1
                        for(i=0;i<=num1.length()-1;i++){
                            if(num1.charAt(i)!='0'&&num1.charAt(i)!='1'){
                                segundo_c++;
                            }
                            if(num2.charAt(i)!='0'&&num2.charAt(i)!='1'){
                                segundo_c++;
                            }
                        }
                    }
                    //y tiene un contador para dar el mensaje correctamente
                    if(primera_c&&segundo_c>=1){
                        System.out.println("El primer número contiene caracteres distintos de '0' y '1'.");
                    }
                    /*if(primera_c&&segundo_c==0){
                        //la verdad ni idea
                        boolean mas_uno=false;
                        
                        for(int a=num1.length()-1;a>=0;a--){
                            
                           if(num1.charAt(a)=='1'&&num2.charAt(a)=='1'){
                                if(num1.charAt(a)=='1'||num2.charAt(a)=='1'&&mas_uno){
                                    respuesta+="1";
                                    mas_uno=true;
                                }else if(num1.charAt(a)=='1'&&num2.charAt(a)=='1'){
                                    respuesta+="0";
                                    mas_uno=true;
                                }   
                            }
                            
                            if((num1.charAt(a)=='1'&&num2.charAt(a)=='0')||(num1.charAt(a)=='0'&&num2.charAt(a)=='1')){
                                if(num1.charAt(a)=='1'||num2.charAt(a)=='1'&& mas_uno){
                                    respuesta+="0";
                                    mas_uno=true;
                                }else if((num1.charAt(a)=='1'&&num2.charAt(a)=='0')||(num1.charAt(a)=='0'&&num2.charAt(a)=='1')){
                                    respuesta+="1";
                                    
                                }
                            }
                            if(num1.charAt(a)=='0'&&num2.charAt(a)=='0'){
                                if(mas_uno){
                                    respuesta+="1";
                                    mas_uno=false;
                                }else if(num1.charAt(a)=='0'&&num2.charAt(a)=='0'){
                                    respuesta+="0";
                                }
                            }
                        }
                        System.out.println(respuesta);
                    }*/
                }
                break;
                case 2:{
                    System.out.println("Ingrese un numero");
                    int num=lea.nextInt();
                    while(num<=8||num%2==0){
                        System.out.println("¡ERROR! SOLO NUMEROS IMPARES Y MAYORES QUE 9");
                        num=lea.nextInt();
                    }
                    //las siguiente variable son posicion de la figura
                    int contador=num/2-1;
                    int contador1=2;
                    int contador1_mas=num/2+3;
                    int contador_menos=num-1;
                    
                    for(int i=1;i<=num/2+2;i++){
                        for(int a=1;a<=num;a++){//el siguiente if es para imprimir los *
                            if(i==2||i>2&&a==contador1&&i<=num/2+1||i>2&&a==contador_menos&&i<=num/2+1||i==num/2+2&&a==num/2+1){
                                System.out.print("*");//el siguiente else if es para imprimir los +
                            }else if(i==1&&a==num/2+1 || i>2&&a==contador&&i<num/2+1||i==num/2+1 || i>2&&a==contador1_mas&&i<=num/2+1){
                                System.out.print("+");
                            }else{//sino entra en ningun if imprime un espacio
                                System.out.print(" ");
                            }
                        }
                        if(i>2){
                            contador--;
                            contador_menos--;
                        }
                        if(i>2){
                            contador1++;
                            contador1_mas++;
                        }
                        System.out.println("");
                    }
                }
                break;
                case 3:{
                    salir=false;
                }
                break;
                default:
                    System.out.println("Error");
                    System.out.println("Ingrese otro numero entre 1-3:");      
            }
            
        }
        // TODO code application logic here
    }
    
}

