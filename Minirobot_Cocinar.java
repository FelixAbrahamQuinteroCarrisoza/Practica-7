public class Minirobot_Cocinar extends  Robot_MagnumOpos implements Funciones {
    public static int cumple2;

    //constructor - esto se hereda de la clase abstracta sistema
	public Minirobot_Cocinar (String name,int opcionIngre,int opcioncocinar,int opcionservir){
        super(name,opcionIngre,opcioncocinar,opcionservir);
        
    }

    //contructor
    public Minirobot_Cocinar(){
        this.name = "";
        this.opcionIngre = 0;
        this.opcioncocinar = 0;
    }
    
    //metodo abstracto para la bateria
    @Override 
    public void getBateria(){
        int numero= (int)(Math.random()*100);
        name="ROBOT CUCHILLAS 360";
        System.out.println("\nNOMBRE\n"+name);
        System.out.println("\nLa bateria del robot es\n "+numero);
    }
    
    //metodo abstracto para la identificacion
    @Override 
    public void getIde(){
        String ide="AR00888";
        System.out.println("\nLa identificacion es\n "+ide);
    }
    
     /////METODOS DE INTERFACE /////
    
     //metodo para cocinar guisos
    public void Cocinar(){
        if(opcioncocinar==1 || cumple2==1){
            cumple2=1;
            System.out.println("\nMINI ROBOT COCINERO ");
            System.out.println("Cocino un guiso con verduras");
        }
        else if(opcioncocinar==2 || cumple2==2){
            cumple2=2;
            System.out.println("\nMINI ROBOT COCINERO");
            System.out.println("Cocino un guiso con Carne");
        }
        else if(opcioncocinar==3 || cumple2==2){
            cumple2=2;
            System.out.println("\nMINI ROBOT COCINERO");
            System.out.println("Cocino un guiso con Carne y verdura");
        }
    }
    
    
	
}