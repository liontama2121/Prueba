package dominio;
import java.awt.Color;
public class Minucioso extends Pirata{
    private int ultimaAccion;
    private int cont;
    private char sentido;
    /**
     * @param isla
     * @param name
     * @param posicionx
     * @param posiciony
     * contructor
     */
    public Minucioso(Isla isla,String name,int posicionx, int posiciony){
        super(isla,name,posicionx,posiciony);
        color=Color.ORANGE;
        palabras="";
        cont=0;
        sentido='+';
    }
    
    @Override
    /**
     * habla mucho cuando para
     */
    public void pare(){
        palabras="bla bla bla bla bla bla";
        mensaje();
    }
    
    @Override
    /**
     * se mueve cuando actua 
     */
    public void actue(){
        
        if (getPosicionX()==0){
            sentido='+';
            moverV();
        }else if (getPosicionX()>=500){
            moverV();
            sentido='-';
        }
        moverX(sentido);
    }
    
    /**
     * no hace nada
     */
    public void decidan(){
      
     }
}

