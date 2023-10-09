/*

A seguinte clase ten problemas de compilación . Corríxeos e ,de seguido, implementa unha clase principal ( Boletin 6₂ ), co metodo main() para testear e verificar os métodos da clase Satelite.
public class Satelite ( )   {
 
     private double meridiano ;
     private double paralelo
     private double distanciaTerra ;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0 
}

public Satelite ( double m; double p ; double d ) ; {

meridiano = m ;
paralelo = p;
distanciaTerra = d ;

}
public void verPosicion ( ) {

System.out.println (“ o satelite atopase  no paralelo “ paralelo + “meridiano ” + meridiano “ a unha distancia da terra “ +“ distanciaTerra )     
}
---------------------------------------------------------------------------------
 */
package boletin6_2;

/**
 *
 * @author Adrian
 */
public class Satelite {
     
     private double meridiano;
     private double paralelo;
     private double distanciaTerra;

    public Satelite ( ) {

    meridiano = paralelo = distanciaTerra = 0 ;
    }

    public Satelite ( double m, double p, double d ){
    meridiano = m ;
    paralelo = p;
    distanciaTerra = d ;
    }
    public void verPosicion (double m, double p, double d) {
    System.out.println ("O satelite atopase  no paralelo " +paralelo+" meridiano " +meridiano+" a unha distancia da terra " +distanciaTerra );
    }
}
