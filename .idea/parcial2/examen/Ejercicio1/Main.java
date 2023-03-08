package parcial2.examen.Ejercicio1;

public class Main {
    public static void main(String[] ardssd) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        VersionadorArchivo versionadorArchivo = new VersionadorArchivo();

        Archivo archivo = new Archivo(versionadorArchivo, baseDeDatos);

        archivo.addTexto("ESTE DOCUMENTO ES UNA PRUEBA\n");
        archivo.addTexto("EL TEXTO SOLO DEPENDE DE TU ESFUERZO :)\n");
        archivo.addTexto("PROLOGO\n");
        archivo.addTexto("ESTE DOCUMENTO FUE ACTUALIZADO SATISFACTORIAMENTE :3\n");

        System.out.println("ULTIMA VERSION");
        archivo.showInfo();

        System.out.println("Version 1");
        archivo = versionadorArchivo.restoreVersion(baseDeDatos.getVersion("Version 1"));
        archivo.showInfo();

    }
}
