/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author CarlosM
 */
public class imgmsg1 extends javax.swing.JPanel {

    public imgmsg1(){
        this.setSize(221,183);
    }

    @Override
    public void paint(Graphics g){
        Dimension tamanio = getSize();
        ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Archivos/msg-no.png"));
        g.drawImage(imagenFondo.getImage(),0,0,tamanio.width, tamanio.height, null);
        setOpaque(false);
        super.paintComponent(g);
}

}
