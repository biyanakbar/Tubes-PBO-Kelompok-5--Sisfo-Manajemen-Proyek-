/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import controller.Controller;
import view.ViewConsole;

/**
 *
 * @author Biyan Ilham Akbar (1301144319)
 */
public class TubesPbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Application app = new Application();
        Controller c = new Controller(app);
        ViewConsole view = new ViewConsole(app);
        view.MainMenu();
        
    }
}
