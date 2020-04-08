import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.*;



    public class TekenProg extends JFrame implements MouseListener {
    Figuur figuur = new Rechthoek();
    List<Figuur> figuren = new ArrayList<>();




    public static JMenuBar getMyMenuBar() {

        // Defining Menu Bar
        JMenuBar jMenuBar = new JMenuBar();

        // Defining Menu
        JMenu tekenMenu = new JMenu("Tekenen");

        // Defining Menu Item
        JMenuItem rechthoekItem = new JMenuItem("Rechthoek");
        JMenuItem ovaalItem = new JMenuItem("Ovaal");
        JMenuItem lijnItem = new JMenuItem("Lijn");

        // Adding Menu Item to Menu
        tekenMenu.add(rechthoekItem);
        tekenMenu.add(ovaalItem);
        tekenMenu.add(lijnItem);

        jMenuBar.add(tekenMenu);

        return jMenuBar;
    }





    public TekenProg() {
        addMouseListener(this);




    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (Figuur f : figuren)
            f.draw(g);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        figuur = new Lijn();
        figuur.x1 = e.getX();
        figuur.y1 = e.getY();
}

    @Override
    public void mouseReleased(MouseEvent e) {
        figuur.x2 = e.getX();
        figuur.y2 = e.getY();
        figuren.add(figuur);
        repaint();
    }

    public static void main(String[] args) {
        TekenProg teken = new TekenProg();
        teken.setSize(500, 500);
        teken.setTitle("Tekenen");

        teken.setJMenuBar(getMyMenuBar());


        teken.setVisible(true);





        teken.setDefaultCloseOperation(EXIT_ON_CLOSE);



    }






    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
