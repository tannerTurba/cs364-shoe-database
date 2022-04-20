import javax.swing.*;
import java.awt.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class Gui extends JFrame {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    double screenWidth = screenSize.getWidth();
    double screenHeight = screenSize.getHeight();
    
    public Gui() {
        setSize((int)(screenWidth * 0.75), (int)(screenHeight * 0.85));
        setLocation(75, 75);
        setTitle("CS 364: Shoe Database");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
    }

    public static void main(String[] args) {
        Gui obj = new Gui();
        String testShoe = "https://images.stockx.com/images/Nike-Air-Max-97-White-Wolf-Grey-Product.jpg?fit=fill&bg=FFFFFF&w=700&h=500&fm=webp&auto=compress&trim=color&q=90&dpr=2&updated_at=1607044794";
        // obj.displayShoeImage(testShoe);
        obj.setVisible(true);
    }

    // private void displayShoeImage(String path) {
    //     try {
    //         URL url = new URL(path);
    //         BufferedImage image = ImageIO.read(url);
    //         System.out.println(image == null);
    //         // saveImage(path);
    //         // BufferedImage image = ImageIO.read(new File("/Users/tannerturba/Documents/cs364-shoe-database/image.jpg"));
    //         JLabel label = new JLabel(new ImageIcon(image));
    //         getContentPane().add(label);
    //         pack();
    //     } 
    //     catch (Exception e) {
    //         System.out.println("An error occurred: ");
    //         e.printStackTrace();
    //     }
    // }

    // private void saveImage(String imageUrl) {
    //     try{
    //         URL url = new URL(imageUrl);
    //         InputStream is = url.openStream();
    //         OutputStream os = new FileOutputStream("image.jpg");

    //         byte[] b = new byte[2048];
    //         int length;

    //         while ((length = is.read(b)) != -1) {
    //             os.write(b, 0, length);
    //         }

    //         is.close();
    //         os.close();
    //     }
    //     catch (Exception e) {
    //         System.out.println("An error occurred: ");
    //         e.printStackTrace();
    //     }
    // }

}

 