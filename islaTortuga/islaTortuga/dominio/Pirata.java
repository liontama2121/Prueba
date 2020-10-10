package dominio;

import java.awt.Color;

public class Pirata extends Persona implements EnIsla{

    private Isla isla;   
    protected String palabras;
    private String name;
    /**
     * @param isla;
     * @param name
     * @param posicionx
     * @param posiciony
     */
    
    public Pirata(Isla isla,String name,int posicionx, int posiciony){
        super(name,posicionx,posiciony);
        this.isla=isla;
        this.name=name;
        this.isla=isla;
        color=Color.BLACK;
        palabras="¡Buscando!";
        isla.adicione(this);
        
    }
    /**
     * mueve las extremidades de del pirata
     */
    @Override
    public void pare(){
        muevaBrazo('I','P'); 
        muevaPierna('I','P');
        muevaBrazo('D','P'); 
        muevaPierna('D','P');       
        palabras="";
    }
    /**
     * llama el muevase la clase EnIsla
     */
    public final void muevase(char d){
        if (! isla.enTesoro(this)){
            super.muevase(d);
        }    
    }
    /**
     * mueve las extremidades de del pirata
     */
    public void actue(){
        char d;
        if (getPosicionBrazo('I')==ABAJO && getPosicionBrazo('D')==ABAJO){
            muevaBrazo('I','S'); 
            muevaPierna('I','S');
        } else if  (getPosicionBrazo('I')==FRENTE){
            muevaBrazo('I','S'); 
            muevaPierna('I','S');
        } else if (getPosicionBrazo('I')==ARRIBA){
            muevaBrazo('I','B'); 
            muevaPierna('I','B');
            muevaBrazo('I','B'); 
            muevaPierna('I','B');
            muevaBrazo('D','S'); 
            muevaPierna('D','S');
        }else if (getPosicionBrazo('D')==FRENTE){
            muevaBrazo('D','S'); 
            muevaPierna('D','S');
            muevaBrazo('D','S'); 
            muevaPierna('D','S');
            muevaBrazo('I','B'); 
            muevaPierna('I','B');
        }else if (getPosicionBrazo('D')==ARRIBA){
            muevaBrazo('D','B'); 
            muevaPierna('D','B');
            muevaBrazo('D','B'); 
            muevaPierna('D','B');
            muevaBrazo('I','S'); 
            muevaPierna('I','S');
        }		
        do{
            d="NSEO".charAt((int)(Math.random() * 4));
        } while (! puedeMoverse(d));
        muevase(d);
    }
    
    public final String mensaje() {
        return super.mensaje()+": "+(isla.enTesoro(this) ? "¡ENCONTRE EL TESORO! ": palabras);
    }
    
    

}

