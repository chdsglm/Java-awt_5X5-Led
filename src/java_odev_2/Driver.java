/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_odev_2;

import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        Frame f = new Frame("LED");
        LED panel = new LED();
        panel.init();
        
        f.add(panel);
        f.setVisible(true);
        f.setSize(400, 400);
    }
}
