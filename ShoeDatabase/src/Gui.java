import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class Gui extends JFrame{
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


    public class RadioButtonDemo extends JPanel implements ActionListener {

    JLabel picture;
 
    public RadioButtonDemo() {
        super(new BorderLayout());
    //Create the radio buttons.

    JRadioButton gucci = new JRadioButton("Gucci");
    gucci.setMnemonic(KeyEvent.VK_B);
    gucci.setActionCommand("Gucci");
    gucci.setSelected(true);

    JRadioButton catButton = new JRadioButton("Nike");
    catButton.setMnemonic(KeyEvent.VK_C);
    catButton.setActionCommand("Nike");

    JRadioButton dogButton = new JRadioButton("Adidas");
    dogButton.setMnemonic(KeyEvent.VK_D);
    dogButton.setActionCommand("Adidas");

    JRadioButton rabbitButton = new JRadioButton("Timberland");
    rabbitButton.setMnemonic(KeyEvent.VK_R);
    rabbitButton.setActionCommand("Timberland");

    JRadioButton pigButton = new JRadioButton("Birkenstock");
    pigButton.setMnemonic(KeyEvent.VK_P);
    pigButton.setActionCommand("Birkenstock");

    //Group the radio buttons.
    ButtonGroup group = new ButtonGroup();
    group.add(gucci);
    group.add(catButton);
    group.add(dogButton);
    group.add(rabbitButton);
    group.add(pigButton);

    //Register a listener for the radio buttons.
    gucci.addActionListener(this);
    catButton.addActionListener(this);
    dogButton.addActionListener(this);
    rabbitButton.addActionListener(this);
    pigButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
    picture.setIcon(new ImageIcon("images/" 
                                  + e.getActionCommand() 
                                  + ".gif"));
    }

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
 