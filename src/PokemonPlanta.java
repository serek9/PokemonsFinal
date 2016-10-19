import java.util.Random;

public class PokemonPlanta extends Pokemon implements Capturable{
    private String tipo="Planta";
    private String efectivo="Agua";
    private String debil="Fuego";

    public PokemonPlanta(String nombre, int ataque, int defensa, int ps){
        super(nombre, ataque, defensa, ps);

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "Nombre='" + getNombre() + '\'' +
                ", Ataque=" + getAtaque() +
                ", Defensa=" + getDefensa() +
                ", PS=" + getPs() +
                ", Tipo='" + tipo + '\'' +
                ", Efectivo Contra='" + efectivo + '\'' +
                ", Debil Contra='" + debil + '\'' +
                '}';
    }

    @Override
    public boolean capturar() {
        int r = randomInt();
        if (r-getPs()>getDefensa()){
            System.out.println(getNombre()+" CAPTURADO!");
            return true;
        }
        else {
            System.out.println(getNombre()+" NO CAPTURADO!");
            return false;
        }
    }

    public static int randomInt(){
        Random r = new Random();
        return r.nextInt((120-20)+1)+20;
    }


}