/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;
import javazoom.jlgui.basicplayer.BasicPlayer;
import java.io.*;
/**
 *
 * @author Carlos J Medina
 */
public class Reproductor {
    

 
    private BasicPlayer Player;
 
Reproductor()
{
    Player=new BasicPlayer();
}
 
 
      public void Play() throws Exception
      {
      Player.play();
      }

      public void AbrirFichero(String archivo) throws Exception
      {
 
          Player.open(new File(archivo));
      }
 
 
      public void Pausa() throws Exception {
 
      Player.pause();
 
      }
 
 
      public void Continuar() throws Exception {
 
      Player.resume();
 
      }
 
       public void Stop() throws Exception {
 
      Player.stop();
 
      }
}
