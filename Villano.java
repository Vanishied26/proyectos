package Superheroes;

public class Villano extends Personaje {

    private int CrimenesCometidos;
    private String planMalvado;

    public Villano(String nombre, String identidadSecreta, String ciudad, String poder, int nivelEnergia, String plan) {
        super(nombre, identidadSecreta, ciudad, poder, nivelEnergia);
        this.planMalvado = planMalvado;
        this.CrimenesCometidos=0;
    }

    @Override
    public void usarPoder(){
        int CostoEnergia = 15;

        if(PuedesUsarPoder(CostoEnergia)){
            System.out.println(nombre + " usa su poder malvado " + poder);
            System.out.println("El villano ataca");
            reducirEnergia(CostoEnergia);
            System.out.println("El nivel de energia es: " + nivelEnergia);
        } else {
            System.out.println("El nivel de energia bajo");
        }
    }

    // SOBRECARGA
    public void usarPoder(int nivelmedio){
        int CostoEnergia = 60;

        if(PuedesUsarPoder(CostoEnergia)){
            System.out.println(nombre + " usa su poder oscuro " + poder);
            System.out.println("El villano ataca");
            reducirEnergia(CostoEnergia);
            System.out.println("El nivel de energia es: " + nivelEnergia);
        } else {
            System.out.println("El nivel de energia bajo");
        }
    }

    public void usarPoder(int nivelmaximo, String frase){
        int CostoEnergia = 120;

        if(PuedesUsarPoder(CostoEnergia)){
            System.out.println(nombre + " usa su poder final " + poder);
            System.out.println("El villano desata todo su poder: ");
            System.out.println(frase);
            reducirEnergia(CostoEnergia);
            System.out.println("El nivel de energia es: " + nivelEnergia);
        } else {
            System.out.println("El nivel de energia bajo");
        }
    }

    @Override
    public void decirFrase(){
          String [] frases={
             "Crearé un nuevo mundo donde solo reine mi justicia",       
             "El dolor es la única forma de traer verdadera paz",         
             "La humanidad no entiende... yo seré quien la despierte",   
             "¡Te mostraré la gran pared que no podrás sobrepasar por mayor que sea tu esfuerzo!",                  
             "El caos y la desesperación son mi verdadero dominio" 
          };
          int indice= (int)(Math.random()*frases.length);
          System.out.println(nombre+"Dice: "+frases[indice]);
      }

    @Override
    public String getTipo(){
        return "VILLANO- Amenaza en " + ciudad;
    }

    @Override
    public String getNombre(){
        return nombre;
    }
    public void revelarPlan(){
    System.out.println(nombre + " revela su plan malvado:"+planMalvado);
    System.out.println("Crimenes cometidos: ");
}
     public void CrimenesCometidos(){
         CrimenesCometidos++;
         System.out.println("Crimenes cometidos: "+CrimenesCometidos);
    }
}
