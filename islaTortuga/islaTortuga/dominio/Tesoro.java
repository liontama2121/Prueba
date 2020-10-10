package dominio;
import java.awt.Color;

/**
 * Write a description of class Tesoro here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tesoro implements EnIsla{

    private int posX;
    private int posY;
    private String name;
    private Color color;
    private String palabras;
    /**
     * @param isla
     * @param name
     * @param posX
     * @param posY
     */
    public Tesoro(Isla isla ,String name,int posX,int posY)
    {
      this.posX=posX;
      this.posY=posY;
        
       color=Color.yellow;
       this.name=name;
       palabras="";
       isla.adicione(this);  
    }
    /**
     * usa la forma numero uno de la clase EnIsla
     */
      public String forma(){
        return FORMAS[1];
    }
    /**
     * get de la posicion x
     */
    public int getPosicionX(){
        return posX;
    }
     /**
     * get de la posicion y
     */
    public int getPosicionY(){
        return posY;
    }
     /**
     * get del Color de Tesoro
     */
    public Color getColor(){
        return color;
    }
    
    public void actue(){
        
    }
    
    public void pare(){
    
    }
    
    public String mensaje(){
	return  palabras;
    }
}
    


