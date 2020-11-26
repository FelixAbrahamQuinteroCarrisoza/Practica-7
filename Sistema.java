public abstract class Sistema{
    public String name;
    public static int opcionIngre;
    public static int opcioncocinar;
    public static int opcionservir;
    
    //Metodos abstractos
	public abstract void getBateria();
    public abstract void getIde();

    public Sistema (String name,int opcionIngre,int opcioncocinar,int opcionservir){
		this.name = name;
        this.opcionIngre = opcionIngre;
        this.opcioncocinar = opcioncocinar;
        this.opcionservir = opcionservir;
    }
    
    public Sistema(){
        this.name = "";
        this.opcionIngre = 0;
        this.opcioncocinar = 0;
        this.opcionservir = 0;
    }
    
	//nombre
	public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    //opcion para ingredientes
    public int getOpcionIngre(){
        return opcionIngre;
    }
    public void setOpcionIngre(int opcionIngre){
        this.opcionIngre = opcionIngre;
    }

    //opcion para cocinar
    public int getOpcionCocinar(){
        return opcioncocinar;
    }
    public void setOpcionCocinar(int opcioncocinar){
        this.opcioncocinar = opcioncocinar;
    }

    //opcion para servir
    public int getOpcionServir(){
        return opcionservir;
    }
    public void setOpcionServir(int opcionservir){
        this.opcionservir = opcionservir;
    }
	
}