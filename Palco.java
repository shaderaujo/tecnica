
package view;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Israel
 */
public class Palco extends Application {
    
    private static Stage palco;
    private static Scene visualizar;
    private static Scene cadastro;
    private static Scene logar;
    private static Scene menu;
    
    @Override
    public void start(Stage stage) throws IOException{
        
        palco = stage;
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLLogin.fxml"));
        logar = new Scene(root);
        
        Parent cad = FXMLLoader.load(getClass().getResource("FXMLCadastroUsuario.fxml"));
        cadastro = new Scene(cad);
        
        Parent view = FXMLLoader.load(getClass().getResource("FXMLVisualizar.fxml"));
        visualizar = new Scene(view);

        Parent men = FXMLLoader.load(getClass().getResource("FXMLMenu.fxml"));
        menu = new Scene(men);
        
        
        palco.setTitle("Cadastro de Usuario");
        palco.setScene(logar);
        palco.setResizable(false);
        palco.show();
            
     
    }

    
    public static void cena(String c){
        switch(c){
            case "visualizar": palco.setScene(visualizar);palco.setTitle("Sistema de Escola Virtual - Visualização de Usuários");break;
            case "cadastro": palco.setScene(cadastro);palco.setTitle("Sistema de Escola Virtual - Cadastro de Usuários");break;
            case "palco": palco.setScene(logar);palco.setTitle("Sistema de Escola Virtual - Login");break;
            case "menu": palco.setScene(menu);palco.setTitle("Sistema de Escola Virtual - Menu");break;
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
