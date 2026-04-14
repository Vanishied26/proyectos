package Superheroes;
public class Superheroe extends Personaje {

    public Superheroe(String nombre, String identidadSecreta, String ciudad, String poder, int nivelEnergia) {
        super(nombre, identidadSecreta, ciudad, poder, nivelEnergia);
    }

    @Override
    public void usarPoder(){
        int CostoEnergia = 10;

        if(PuedesUsarPoder(CostoEnergia)){
            System.out.println(nombre + " Usa su poder " + poder);
            System.out.println("El Heroes ataca");
            reducirEnergia(CostoEnergia);
            System.out.println("El nivel de energia es: " + nivelEnergia);
        } else {
            System.out.println("El nivel de energia bajo");
        }
    }

    // SOBRECARGA
    public void usarPoder(int nivelmedio){
        int CostoEnergia = 50;

        if(PuedesUsarPoder(CostoEnergia)){
            System.out.println(nombre + " Usa su poder especial " + poder);
            System.out.println("El Heroes ataca");
            reducirEnergia(CostoEnergia);
            System.out.println("El nivel de energia es: " + nivelEnergia);
        } else {
            System.out.println("El nivel de energia bajo");
        }
    }

    public void usarPoder(int nivelmaximo, String frase){
        int CostoEnergia = 100;

        if(PuedesUsarPoder(CostoEnergia)){
            System.out.println(nombre + " Usa su poder fatal " + poder);
            System.out.println("El Heroes ataca");
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
              "No voy a perder!",
              "¡Haré lo que sea para protegerlos!",
              "¡Nunca me rendiré, ese es mi camino ninja!",
              "Yo no Morire, No importa que mi cuerpo sea destruido... Mis deseos de pelear me levantaran por que soy muy grandes... "
                  + "y despues de eso los derrotare pase lo que pase",
              "Mi magia es no rendirme"
          };
          int indice= (int)(Math.random()*frases.length);
          System.out.println(nombre+"Dice: "+frases[indice]);
      }

    @Override
    public String getTipo(){
        return "SUPERHEROE- Protector de " + ciudad;
    }

    @Override
    public String getNombre(){
        return nombre;
    }
}
