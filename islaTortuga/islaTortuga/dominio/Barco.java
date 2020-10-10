package dominio;
import java.awt.Color;
/**
 * Write a description of class luz here.
 *
 * @author Juan Pablo  
 * @author Juan Camilo Molina León
 * @version 29/09/20
 */
public class Barco implements EnIsla{
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
    public Barco (Isla isla ,String name,int posX,int posY)
    {
        this.posX=posX;
        this.posY=posY;
        color=Color.lightGray;
        this.name=name;
        palabras="";
        isla.adicione(this);
        
    }
    /**
     * @return la forma numero 3 
     */
    public String forma(){
        return FORMAS[3];
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
     * cabia el color a un cafe
     */
    public void actue(){
        Color cafe = new Color(145,71,28);
        this.color=cafe;
    }
     /**
     * cabia el color parecido al fondo
     */
    public void pare(){
        Color fondo = new Color(231,231,230);
        this.color=fondo;
    }
     /**
     * @retuen las palabras del barco
     */
    public String mensaje(){
	return  palabras;
    }
}
    