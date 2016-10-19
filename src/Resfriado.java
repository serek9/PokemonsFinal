import java.util.Random;

public class Resfriado implements Capturable{
    public Resfriado(){
    }

    @Override
    public boolean capturar(){
        int valor = randomInt();
        if (valor>60){
            System.out.println(valor);
            System.out.println("Estas resfriado!");
            return true;
        }
        else{
            System.out.println(valor);
            System.out.println("No estas resfriado!");
            return false;
        }
    }

    public static int randomInt(){
        Random r = new Random();
        return r.nextInt((120-20)+1)+20;
    }
}
