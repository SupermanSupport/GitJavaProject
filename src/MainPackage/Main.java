package MainPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.MenuDragMouseListener;

public class Main extends JFrame
{
    
        public Main()
        {
            initComponents();
        
        }
        
        public void initComponents()
        {
            this.setTitle("Pasek Menu");
            this.setBounds(300, 300, 900, 500);
            this.setJMenuBar(pasekMenu);
 
            
            JMenu menuPlik = pasekMenu.add(new JMenu("Plik"));
            JMenu menuPomoc = pasekMenu.add(new JMenu("Pomoc"));
            
            JMenuItem podMenuNowy = menuPlik.add(new JMenuItem("Nowy"));
            menuPlik.addSeparator();
            
            JMenuItem podMenuFAQ = menuPomoc.add(new JMenuItem("FAQ"));
            
            podMenuNowy.addActionListener(new ActionListener() {
                
                public void actionPerformed(ActionEvent e) {  
                
                    System.out.println("siema");
                }
            });
            
            final JMenuItem podMenuZapisz = menuPlik.add(new JMenuItem("Zapisz"));
            
            JMenuItem podMenuWczytaj = menuPlik.add(new JMenuItem("Wczytaj"));
            menuPlik.addSeparator();
            
            JMenu menuOpcje =  new JMenu("Opcje");
            
            JMenuItem podMenuOpcje = menuPlik.add(menuOpcje);
            
            JMenuItem podmenu1 = menuOpcje.add("Opcja 1");
            JMenuItem podmenu2 = menuOpcje.add("Opcja 2");
            
            menuOpcje.add(tylkoDoOdczytu);
            
            tylkoDoOdczytu.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) 
                {
                    if (tylkoDoOdczytu.isSelected())
                        podMenuZapisz.setEnabled(false);
                    else
                         podMenuZapisz.setEnabled(true);
                    
                }
            });
            
            
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
        
        private JMenuBar pasekMenu = new JMenuBar();
        private JCheckBoxMenuItem tylkoDoOdczytu = new JCheckBoxMenuItem("Tylko do odczytu");
        public static void main(String[] args)
        {
            new Main().setVisible(true);
        }
}
