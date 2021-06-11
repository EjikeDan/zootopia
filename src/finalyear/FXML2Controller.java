/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalyear;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author Danni
 */
public class FXML2Controller implements Initializable {

    @FXML
    private AnchorPane root11;
    
    @FXML
    void menu (ActionEvent event){
      try {
          
          AnchorPane root11 = FXMLLoader.load(getClass().getResource("/finalyear/FXML.fxml"));
        Scene scene = new Scene(root11);
        Stage stage = (Stage) this.root11.getScene().getWindow();
        stage.setScene(scene);
          
          
//          System.out.println("Hello World!");
//          
//          URL url = new File("src/finalyear/FXML.fxml").toURI().toURL();
//          root1 = FXMLLoader.load(url);
//          
//       // Parent root = FXMLLoader.load(getClass().getResource("src/finalyear/FXML1.fxml"));
//        Scene scene = new Scene(root1);
//        
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.setTitle("Computer-aided Learning for Kids");
//        stage.setMaximized(true);
//        stage.show();
        }
        catch (Exception e){
        e.printStackTrace(); 
        }
  }
    
   @FXML
    void chameleon (ActionEvent event) {
    final File file = new File("src/finalyear/zootopia/chameleon.mp4");
    final String MEDIA_URL = file.toURI().toString();

    final Media media = new Media(MEDIA_URL);
    final MediaPlayer player = new MediaPlayer(media);
    MediaView mv = new MediaView(player);
    
    StackPane root = new StackPane();
    root.getChildren().add(mv);

    Stage stage = new Stage();
    stage.setScene(new Scene(root, 700, 500));
    stage.setTitle("Computer-aided Learning for Kids");
    stage.show();

    player.play(); 
    
    stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
          public void handle(WindowEvent we) {
              player.stop();
          }});
    }
    
    @FXML
    void zebra (ActionEvent event) {
    final File file = new File("src/finalyear/zootopia/zebra.mp4");
    final String MEDIA_URL = file.toURI().toString();

    final Media media = new Media(MEDIA_URL);
    final MediaPlayer player = new MediaPlayer(media);
    MediaView mv = new MediaView(player);
    
    StackPane root = new StackPane();
    root.getChildren().add(mv);

    Stage stage = new Stage();
    stage.setScene(new Scene(root, 700, 500));
    stage.setTitle("Computer-aided Learning for Kids");
    stage.show();

    player.play(); 
    
    stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
          public void handle(WindowEvent we) {
              player.stop();
          }});
    }
    
    @FXML
    void elephant (ActionEvent event) {
    final File file = new File("src/finalyear/zootopia/elephants.mp4");
    final String MEDIA_URL = file.toURI().toString();

    final Media media = new Media(MEDIA_URL);
    final MediaPlayer player = new MediaPlayer(media);
    MediaView mv = new MediaView(player);
    
    StackPane root = new StackPane();
    root.getChildren().add(mv);

    Stage stage = (Stage) this.root11.getScene().getWindow();
    stage.setScene(new Scene(root, 700, 500));
    stage.show();
//    Stage stage = new Stage();
//    stage.setScene(new Scene(root, 700, 500));
//    stage.setTitle("Computer-aided Learning for Kids");
//    stage.show();

    player.play(); 
    
    stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
          public void handle(WindowEvent we) {
              player.stop();
              
              try {
              Stage stage1 = new Stage();
              AnchorPane root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
        stage1.setScene( new Scene (root));
        stage1.setMaximized(true);
        stage1.show();
            }
        catch (Exception e){
        e.printStackTrace(); 
        }
              
          }});
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
