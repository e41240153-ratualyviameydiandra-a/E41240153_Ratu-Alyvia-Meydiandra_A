import java.awt.*;
import java.applet.*;

/**
 *
 * @author LENOVO : Ratu Alyvia Meydiandra
 */

public class DrawShapes extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public void init() {
        // Mengatur font Arial ukuran 18, miring
        font = new Font("Arial", Font.ITALIC, 18);

        // Warna bawaan di kelas Color
        redColor = Color.red;
        backgroundColor = Color.orange;

        // Membuat warna menggunakan nilai Red, Green, Blue
        blueColor = new Color(0, 0, 122);

        // Mengatur warna latar belakang applet
        setBackground(backgroundColor);
    }

    public void stop() {
    }

    /**
     * Method ini menggambar bentuk pada layar
     */
    public void paint(Graphics graph) {
        // Mengatur font dan menampilkan judul
        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);

        // Menggambar kotak warna cyan
        graph.setColor(Color.CYAN);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 50, 50);

        // Menggambar kotak warna biru tua 
        graph.setColor(blueColor);
        graph.drawRect(115, 115, 90, 90); // Garis luar
        graph.fillRect(115, 115, 90, 90); // Isi warna

        // Menggambar lingkaran warna merah di depan kotak biru
        graph.setColor(redColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);
    }
}
