import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class TekenProg2 extends JFrame implements MouseListener, ActionListener {
    Figuur figuur = new Rechthoek(); // default figuur rechthoek
    ArrayList<Figuur> figuren = new ArrayList<>();


    public TekenProg2(){
        addMouseListener(this);

        // create menu
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
        menuBar = getMyMenuBar();

        // add menu
        add(menuBar, BorderLayout.PAGE_START); // add menu to usual start position
    }

    private JMenuBar getMyMenuBar() {
        JMenuBar menuBar;
        JMenu tekenmenu;
        JMenuItem menuItem;
        menuBar = new JMenuBar();

        // build menu
        tekenmenu = new JMenu("Tekenen");
        menuBar.add(tekenmenu);

        // create string with options and add these to menu
        String[] klassen = {"Rechthoek", "Ovaal", "Lijn", "Driehoek"};

        for (String klas : klassen){
            menuItem = new JMenuItem(klas);
            tekenmenu.add(menuItem);
            menuItem.addActionListener( this);
        }

        menuBar.add(tekenmenu);

        return menuBar;
    }


    public static void main(String[] args) {
        TekenProg2 teken = new TekenProg2();
        teken.setSize(500,500);
        teken.setVisible(true);
        teken.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println(e.getActionCommand());
        switch (e.getActionCommand()){
            case "Rechthoek":
                figuur = new Rechthoek();
                break;
            case "Ovaal":
                figuur = new Ovaal();
                break;
            case "Lijn":
                figuur = new Lijn();
                break;
            case "Driehoek":
                figuur = new Driehoek();
                break;
        }
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (int i = 0 ; i < figuren.size(); i++){
            figuren.get(i).draw(g);
        }
    }


    @Override
    public void mousePressed(MouseEvent e) {
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