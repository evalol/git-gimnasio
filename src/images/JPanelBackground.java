package images;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * Clase que extiende de JPanel y permite poner una imagen como fondo.
 *
 * @author Guille Rodriguez Gonzalez ( http://www.driverlandia.com )
 * @version 1.0 | 05-2014
 *
 */
public class JPanelBackground extends JPanel {

    private Image background;

    @Override
    public void paintComponent(Graphics g) {

        int width = this.getSize().width;
        int height = this.getSize().height;

        if (this.background != null) {
            g.drawImage(this.background, 0, 0, width, height, null);
        }

        super.paintComponent(g);
    }

    public void setBackground(ImageIcon icon) {

        this.background = icon.getImage();
        repaint();
    }

}
