/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_odev_2;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LED extends Applet implements ActionListener{
    private int state = 0;
    private Button b;
    
    public void paint(Graphics g){
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++)
                g.drawOval(20 + i * 20, 20 + j * 20, 15, 15);
        g.setColor(Color.red);
        if (state == 0) {
            for(int i = 0; i < 5; i++)
                g.fillOval(20 + i * 20, 20 + 2 * 20, 15, 15);
        } else
        if (state == 1) {
            for(int i = 0; i < 5; i++)
                g.fillOval(20 + i * 20, 20 + i * 20, 15, 15);
        } else
        if (state == 2) {
            for(int i = 0; i < 5; i++)
                g.fillOval(20 + 2 * 20, 20 + i * 20, 15, 15);
        } else {
             for(int i = 0; i < 5; i++)
                g.fillOval(20 + (4 - i) * 20, 20 + i * 20, 15, 15);
        }
    }
    
    public void init() {
        b = new Button("DONDUR");
        b.addActionListener(this);
        this.add(b);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            state = (state + 1) % 4;
            repaint();
        }
    }
   
}
