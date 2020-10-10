package dominio;
import java.awt.Color;
/**
 * Write a description of class luz here.
 *
 * @author Juan Pablo  
 * @author Juan Camilo Molina León
 * @version 29/09/20
 */
public class Palmera implements EnIsla{
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
     * contructor de Barco 
     */
    public Palmera(Isla isla ,String name,int posX,int posY)
    {
        this.posX=posX;
        this.posY=posY;
        
        color=Color.lightGray;
        this.name=name;
        palabras="";
        isla.adicione(this);
        
    }
    /**
     * @return la forma numero 2
     */
      public String forma(){
        return FORMAS[2];
    }
    /**
     * @return get de la posicion de x
     */
    public int getPosicionX(){
        return posX;
    }
    /**
     * @return get de la posicion de y
     */
    public int getPosicionY(){
        return posY;
    }
    /**
     * @return get del color del barco
     */
    public Color getColor(){
        return color;
    }
    /**
     * cabia el color a un verde oscuro
     */
    public void actue(){
        Color verde = new Color(0,77,18);
        this.color=verde;
    }
      /**
     * cabia el color verde claro
     */
    public void pare(){
        this.color=color.green;
    }
    /**
     * @retuen las palabras de la palmera
     */
    public String mensaje(){
	return  palabras;
    }
}
    
    


