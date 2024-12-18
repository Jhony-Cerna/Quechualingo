package IA;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class EjecutarIA {
    public void Ejecutar(){
        // Obtener la URL del archivo HTML desde los recursos
        URL htmlFileUrl = EjecutarIA.class.getClassLoader().getResource("IA/IAChatbot.html");

        if (htmlFileUrl != null && Desktop.isDesktopSupported()) {
            // Abrir el archivo HTML en el navegador predeterminado
            try {
                Desktop.getDesktop().browse(htmlFileUrl.toURI());
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("El escritorio no es compatible o el archivo HTML no se encontró en los recursos.");
        }
    }
}

