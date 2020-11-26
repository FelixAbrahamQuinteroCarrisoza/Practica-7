public class Robot_MagnumOpos extends  Sistema implements Funciones {
    public static int cumple;
    public static int cumple2;
    public static int cumple3;

    //constructor - esto se hereda de la clase abstracta sistema
	public Robot_MagnumOpos (String name,int opcionIngre,int opcioncocinar,int opcionservir){
        super(name,opcionIngre,opcioncocinar,opcionservir);
        
    }

    //contructor
    public Robot_MagnumOpos(){
        this.name = "";
        this.opcionIngre = 0;
        this.opcioncocinar = 0;
        this.opcionservir = 0;
    }
    
    //metodo abstracto para la bateria
    @Override 
    public void getBateria(){
        int numero= (int)(Math.random()*100);
        name="MAGNUM OPUS 3000";
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
            System.out.println("\nROBOT MAGNUM");
            System.out.println("Cortar carne y verdura");
        }
        else if(opcionIngre==3 ||cumple==3){
            cumple=3;
            System.out.println("\nROBOT MAGNUM");
            System.out.println("Cortar carne y verdura");
        }
    }
    
    //metodo picar y para preparar ingredientes
    public void Picar(){
       if(opcionIngre==2 ||  cumple==2){
            cumple=2;
            System.out.println("\nROBOT MAGNUM");
            System.out.println("Picar carne y verdura");
        }
        else if(opcionIngre==3 ||cumple==3){
            cumple=3;
            System.out.println("\nROBOT MAGNUM");
            System.out.println("Picar carne y verdura");
        }
    }
    
    //metodo para cocinar guisos
    public void Cocinar(){
        if(opcioncocinar==1 || cumple2==1){
            cumple2=1;
            System.out.println("\nROBOT MAGNUM");
            System.out.println("Cocino un guiso con verduras");
        }
        else if(opcioncocinar==2 || cumple2==2){
            cumple2=2;
            System.out.println("\nROBOT MAGNUM");
            System.out.println("Cocino un guiso con Carne");
        }
        else if(opcioncocinar==3 || cumple2==2){
            cumple2=2;
            System.out.println("\nROBOT MAGNUM");
            System.out.println("Cocino un guiso con Carne y verdura");
        }
    }
    public void Servir(){
        if(opcionservir==1 || cumple3==1){
            cumple3=1;
            System.out.println("\nROBOT MAGNUM");
            System.out.println("Comida servida");

        }
        
    }
    
	
}