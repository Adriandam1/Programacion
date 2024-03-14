/*
 Explicación del Programa

- Interfaces: Las interfaces `IPodeCamiñar`, `IPodeNadar` y `IPodeVoar` definen métodos que las clases pueden implementar.
- Clases: Las clases `Mamifero`, `Felino`, `Gato`, `Avestruz`, `Papagaio`, `Morcego` y `Tigre` implementan estas interfaces según sus capacidades.
- Aplicación: La clase `Aplicacion` crea instancias de estas clases y llama a sus métodos para demostrar sus capacidades.

 Sobre las Preguntas del Boletín

- ¿Precisas incluir todolos métodos das interfaces na clase Gato? Sí, si una clase implementa una interface, debe proporcionar implementaciones para todos los métodos definidos en la interface.
- Diagrama de Clases: Se requeriría una herramienta de diagramación para crearlo, pero básicamente mostraría las relaciones de herencia e implementación entre las clases y las interfaces.
 */
package boletins20;

/**
 *
 * @author Usuario
 */
public class Boletins20 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Gato gato = new Gato();
        gato.camiñar();
        gato.nadar();

        Avestruz avestruz = new Avestruz();
        avestruz.camiñar();

        Papagaio papagaio = new Papagaio();
        papagaio.camiñar();
        papagaio.voar();

        Morcego morcego = new Morcego();
        morcego.camiñar();
        morcego.voar();

        Tigre tigre = new Tigre();
        tigre.camiñar();
        tigre.nadar();
    }
}
