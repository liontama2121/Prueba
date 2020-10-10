package dominio;
import java.awt.Color;

public class PirataBorracho extends Pirata{
    private int ultimaAccion;
    private int cont;
    private char sentido;
    /**
     * @param isla
     * @param name
     * @param posicionx
     * @param posiciony
     */
    public PirataBorracho(Isla isla,String name,int posicionx, int posiciony){
        super(isla,name,posicionx,posiciony);
        color=Color.BLUE;
        palabras="drink";
        cont=0;
    }
    /**
     * cuando para y dice un mensaje 
     */
    @Override
    public void pare(){
       palabras="yo manejo ,todos a babor";
       mensaje();
    }
    /**
     * se mueve en diagonal 
     */
    @Override
    
    public void actue(){
        if (getPosicionX()==0){
            sentido='+';
        }else if (getPosicionX()>=530){
            sentido='-';
        }
        moverX(sentido);
        moverY(sentido);
    }
    /**
     * para cuando decide
     */
    public void decidan(){
        super.pare();
     }
}
