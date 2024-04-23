
import javax.swing.*;

/*
Tutorial pildoras informaticas:
https://www.youtube.com/watch?v=L_QzjDWoKDo&list=PLU8oAlHdN5BktAXdEVCLUYzvDyqRQJ2lk&index=102
 */


/**
 *
 * @author Adrian
 */
public class Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuFrame pantalla= new MenuFrame();
        pantalla.setVisible(true);
        pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class MenuFrame extends JFrame{
    public MenuFrame(){
        setBounds(500,300,550,400);
    
        MenuLamina milamina = new MenuLamina();
        add(milamina);
        setVisible(true);
    }    
}
class MenuLamina extends JPanel{
    public MenuLamina(){
        //Creacion de la barra(vacia de menu)
        JMenuBar mibarra = new JMenuBar();
        
        //Creacion de opciones del menu en la barra
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");
        JMenu opciones = new JMenu("Opciones");
        
        //Antes de agregar los elementos de la barra agregamos los elementos de los botones
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardar_como = new JMenuItem("Guardar como");
        
        JMenuItem cortar = new JMenuItem("Cortar");
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Pegar");           
        JMenuItem generales = new JMenuItem("Generales");
        
        JMenuItem opcion1 = new JMenuItem("Opcion1");
        JMenuItem opcion2 = new JMenuItem("Opcion2");
        
        //agregamos opciones a edicion para crear el submenu
        opciones.add(opcion1);
        opciones.add(opcion2);
        edicion.add(opciones);
        
        //Una vez creados los elementos tenemos que decirles en que menu van a ir
        archivo.add(guardar);
        archivo.add(guardar_como);
        edicion.add(cortar);
        edicion.add(copiar);
        edicion.add(pegar);
        //Creamos separadores entre pegar y opciones
        edicion.addSeparator();
        edicion.add(opciones);
        herramientas.add(generales);
        
        //Especificar en que barra estan los elementos anteriores agregamos los elementos a su barra
        mibarra.add(archivo);
        mibarra.add(edicion);
        mibarra.add(herramientas);
        //Agregamos la barra de menus a la lamina
        add(mibarra);
    }
}
