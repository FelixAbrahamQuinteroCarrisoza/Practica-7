public class Minirobot_Cuchillo extends  Robot_MagnumOpos implements Funciones {
    public static int cumple;

    //constructor - esto se hereda de la clase abstracta sistema
	public Minirobot_Cuchillo (String name,int opcionIngre,int opcioncocinar,int opcionservir){
        super(name,opcionIngre,opcioncocinar,opcionservir);
        
    }

    //contructor
    public Minirobot_Cuchillo(){
        this.name = "";
        this.opcionIngre = 0;
    }
    
    //metodo abstracto para la bateria
    @Override 
    public void getBateria(){
        int numero= (int)(Math.random()*100);
        name="ROBOT CALENTOR 2000";
        System.out.println("\nNOMBRE\n"+name);
        System.out.println("\nLa bateria del robot es\n"+numero);
    }
    
    //metodo abstracto para la identificacion
    @Override 
    public void getIde(){
        String ide="AR00999";
        System.out.println("\nLa identificacion es\n"+ide);
    }
    
     /////METODOS DE INTERFACE /////

     //metodo cortar y para preparar ingredientes
     public void Cortar(){ 
        if(opcionIngre==1 || cumple==1){
        cumple=1;
        System.out.println("\nMINI ROBOT CUCHILLOS");
        System.out.println("Cortar carne y verdura");
    }
    else if(opcionIngre==3 ||cumple==3){
        cumple=3;
        System.out.println("\nMINI ROBOT CUCHILLOS");
        System.out.println("Cortar carne y verdura");
    }
}

//metodo picar y para preparar ingredientes
public void Picar(){
   if(opcionIngre==2 ||  cumple==2){
        cumple=2;
        System.out.println("\nMINI ROBOT CUCHILLOS");
        System.out.println("Picar carne y verdura");
    }
    else if(opcionIngre==3 ||cumple==3){
        cumple=3;
        System.out.println("\nMINI ROBOT CUCHILLOS");
        System.out.println("Picar carne y verdura");
    }
}
    	
}