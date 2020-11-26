import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
    
       
    Funciones MAGNUM = new Robot_MagnumOpos();//objeto para imprimir las funciones(interfaces) del robot Robot_MagnumOpos
    Funciones MINI_Robot_1 = new Minirobot_Cuchillo();//objeto para imprimir las funciones(interfaces) del robot Minirobot_Cuchillo 
    Funciones MINI_Robot_2 = new Minirobot_Cocinar(); //objeto para imprimir las funciones(interfaces) del robot Minirobot_Cocinar
    
    Sistema MAGNUMmetodos = new Robot_MagnumOpos();
    Sistema MINI_1_metodos = new Minirobot_Cuchillo();
    Sistema MINI_2_metodos = new Minirobot_Cocinar();

    Sistema op = new Robot_MagnumOpos();//objeto para capturar opcion de control 
    Sistema op2 = new Minirobot_Cuchillo();//objeto para capturar opcion de control 
    Sistema op3 = new Minirobot_Cocinar();//objeto para capturar opcion de control

    Scanner Teclado = new Scanner(System.in);
    int opcion = 0;
    int opcion2 = 0;
    int controlIngredientes = 0;
    int controlCocinar = 0;
    int controlServir = 0;
    
    
    do{
    System.out.println("\n-------MENU PRINCIPAL------\n"); 
        System.out.println("\n1--PREPARAR INGREDIENTES: "); 
        System.out.println("2--COCINAR: ");
        System.out.println("3--SERVIR: ");
        System.out.println("4--Mostrar platillo con ingredientes preparados,cocinado y servido: ");
        System.out.println("5--Mostrar Sistema de robots: ");
        System.out.println("6--Salir: ");

        
        System.out.println("\n Introduce el numero del menu:");
        opcion=Teclado.nextInt();
        System.out.println("\n ");

//--------------------------OPCION 1 PARA PREPARAR INGREDIENTES-----------------------------//
          if(opcion==1){
              do{
          System.out.println("\n-------RELIJA ROBOT Para preparar ingredientes------\n"); 
          System.out.println("\n1--MAGNUM OPUS: "); 
          System.out.println("2--ROBOT AYUDANTE 1: ");
          System.out.println("3--Salir: ");     
        
        System.out.println("\n Introduce el numero del menu:");
        opcion2=Teclado.nextInt();
        System.out.println("\n ");
       //------OPCION 1 ROBOT MAGNUM OPUS-------//
        if(opcion2==1){
           do{    
               System.out.println("\n-------MENU PARA PREPARAR INGREDIENTES------\n"); 
               System.out.println("\n-------ROBOT MAGNUM OPUS------\n"); 
               System.out.println("\n1--Cortar verdura y carne: "); 
               System.out.println("2--Picar verdura y carne: ");
               System.out.println("3--Picar y cortar: verdura y carne: ");
               System.out.println("4--Salir: ");
               
        
               System.out.println("\n Introduce el numero del menu:");  
               Scanner inOpcionIngre = new Scanner(System.in);
               op.setOpcionIngre(inOpcionIngre.nextInt());
            
               if((op.getOpcionIngre())==1){
                controlIngredientes=10;    
                MAGNUM.Cortar();
               }
               else if((op.getOpcionIngre())==2 ){
                controlIngredientes=10;
                MAGNUM.Picar();
               }
               else if((op.getOpcionIngre())==3 ){
                controlIngredientes=10;
                MAGNUM.Cortar();
                MAGNUM.Picar();
               }   
            }while((op.getOpcionIngre())<4);
          }
          //------OPCION 2 ROBOT AYUDANTE-------//
          else if(opcion2==2){

            do{    
                System.out.println("\n-------MENU PARA PREPARAR INGREDIENTES------\n"); 
                System.out.println("\n-------ROBOT AYUDANTE 1------\n"); 
                System.out.println("\n1--Cortar verdura y carne: "); 
                System.out.println("2--Picar verdura y carne: ");
                System.out.println("3--Picar y cortar: verdura y carne: ");
                System.out.println("4--Salir: ");
                
         
                System.out.println("\n Introduce el numero del menu:");  
                Scanner inOpcionIngre = new Scanner(System.in);
                op2.setOpcionIngre(inOpcionIngre.nextInt());
             
                if((op2.getOpcionIngre())==1){
                 controlIngredientes=10;    
                 MINI_Robot_1.Cortar();
                }
                else if((op2.getOpcionIngre())==2 ){
                 controlIngredientes=10;
                 MINI_Robot_1.Picar();
                }
                else if((op2.getOpcionIngre())==3 ){
                 controlIngredientes=10;
                 MINI_Robot_1.Cortar();
                 MINI_Robot_1.Picar();
                }   
             }while((op2.getOpcionIngre())<4);

          } 


       }while((opcion2)<3);
      }
//------------------------------OPCION 2 PARA COCINAR----------------------------//
      else if(opcion==2){
        do{
            System.out.println("\n-------ELIJA ROBOT PARA COCINAR------\n"); 
            System.out.println("\n1--MAGNUM OPUS: "); 
            System.out.println("2--MINI ROBOT AYUDANTE 2 : ");
            System.out.println("3--Salir: ");     
          
          System.out.println("\n Introduce el numero del menu:");
          opcion2=Teclado.nextInt();
          System.out.println("\n ");
         //------OPCION 1 ROBOT MAGNUM OPUS-------//
          if(opcion2==1){
             do{    
                 System.out.println("\n-------MENU PARA COCINAR------\n"); 
                 System.out.println("\n-------ROBOT MAGNUM OPUS------\n"); 
                 System.out.println("1--GUISO CON VERDURAS: ");
                 System.out.println("2--GUISO CON CARNE: ");
                 System.out.println("2--GUISO CON CARNE Y VERDURAS: ");
                 System.out.println("4--Salir: ");
                 
          
                 System.out.println("\n Introduce el numero del menu:");  
                 Scanner inOpcionCocinar = new Scanner(System.in);
                 op.setOpcionCocinar(inOpcionCocinar.nextInt());
              
                 if((op.getOpcionCocinar())==1){
                    controlCocinar=10;    
                  MAGNUM.Cocinar();
                 }
                 else if((op.getOpcionCocinar())==2 ){
                    controlCocinar=10;
                  MAGNUM.Cocinar();
                 }
                 else if((op.getOpcionCocinar())==3 ){
                    controlCocinar=10;
                  MAGNUM.Cocinar();
                 }   
              }while((op.getOpcionCocinar())<4);
            }  
            //------OPCION 2 ROBOT AYUDANTE-------//
          else if(opcion2==2){

            do{    
                System.out.println("\n-------MENU PARA PREPARAR INGREDIENTES------\n"); 
                System.out.println("\n-------ROBOT AYUDANTE 2------\n"); 
                System.out.println("1--GUISO CON VERDURAS: ");
                System.out.println("2--GUISO CON CARNE: ");
                System.out.println("2--GUISO CON CARNE Y VERDURAS: ");
                System.out.println("4--Salir: ");
                
         
                System.out.println("\n Introduce el numero del menu:");  
                Scanner inOpcionCocinar = new Scanner(System.in);
                op3.setOpcionCocinar(inOpcionCocinar.nextInt());
             
                if((op3.getOpcionCocinar())==1){
                    controlCocinar=10;    
                    MINI_Robot_2.Cocinar();
                }
                else if((op3.getOpcionCocinar())==2 ){
                    controlCocinar=10;
                    MINI_Robot_2.Cocinar();
                }
                else if((op3.getOpcionCocinar())==3 ){
                    controlCocinar=10;
                    MINI_Robot_2.Cocinar();
                }   
             }while((op3.getOpcionCocinar())<4);

          }    




        }while(opcion2<3);
      }
      if(opcion==3){
        do{
            System.out.println("\n-------RELIJA ROBOT PARA COCINAR------\n"); 
            System.out.println("\n1--MAGNUM OPUS: "); 
            System.out.println("2--Salir: ");     
          
          System.out.println("\n Introduce el numero del menu:");
          opcion2=Teclado.nextInt();
          System.out.println("\n ");

         //------OPCION 1 ROBOT MAGNUM OPUS-------//
          if(opcion2==1){
             do{    
                 System.out.println("\n-------MENU PARA SERVIR------\n"); 
                 System.out.println("\n-------ROBOT MAGNUM OPUS------\n"); 
                 System.out.println("1--servir platillo: ");
                 System.out.println("2--Salir: ");
                 
                 System.out.println("\n Introduce el numero del menu:");  
                 Scanner inOpcionCocinar = new Scanner(System.in);
                 op.setOpcionServir(inOpcionCocinar.nextInt());
              
                 if((op.getOpcionServir())==1){
                    controlServir=10;    
                    MAGNUM.Servir();
                 }
              }while((op.getOpcionServir())<2);
            }  
         }while(opcion<2);
      }
     //////opcion 5////// 
    else if(opcion==4){  
        
        if(controlIngredientes==10 && controlCocinar==10 && controlServir==10 ){
        MAGNUM.Cortar(); 
        MAGNUM.Picar();
        MINI_Robot_1.Cortar();
        MINI_Robot_1.Picar();
        MAGNUM.Cocinar();
        MINI_Robot_2.Cocinar();
        MAGNUM.Servir();
        }
        else{
            System.out.println("ERROR , ACOMPLETAR TODOS LOS PASOS PARA IMPRIMIR PLATILLO COMPLETO");
        }
        
    }
    else if(opcion==5){
        do{
            System.out.println("\n-------RELIJA ROBOT QUE SE QUIERA OBSERVAR EL SISTEMA------\n"); 
            System.out.println("\n1--MAGNUM OPUS: "); 
            System.out.println("2--ROBOT AYUDANTE 1: ");
            System.out.println("3--ROBOT AYUDANTE 2: ");     
          
          System.out.println("\n Introduce el numero del menu:");
          opcion2=Teclado.nextInt();
          System.out.println("\n ");
          
          if(opcion2==1){
            MAGNUMmetodos.getBateria();
            MAGNUMmetodos.getIde();
            MAGNUM.Cortar(); 
            MAGNUM.Picar();
            MAGNUM.Cocinar();
            MAGNUM.Servir();
          }
          else if(opcion2==2){
            MINI_1_metodos.getBateria();
            MINI_1_metodos.getIde();
            MINI_Robot_1.Cortar();
            MINI_Robot_1.Picar();
          }
          else if(opcion2==3){
            MINI_2_metodos.getBateria();
            MINI_2_metodos.getIde();
            MINI_Robot_2.Cocinar();
          }
         
      }while(opcion2==4);
   }

    }while(opcion<6);
    

 }
}