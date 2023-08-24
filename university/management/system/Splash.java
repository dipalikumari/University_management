
package university.management.system;

import javax.swing.*;
import java.awt.*;


public class Splash extends JFrame implements Runnable{
    Thread t;
    
    Splash(){
        
        
        // create image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/medi1.jpg"));
        Image i2=i1.getImage().getScaledInstance(1399, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        t=new Thread(this);
        t.start();
        
        setVisible(true);
        
        int x=1;
        for(int i=0;i<=700;i+=4,x+=1){ 
            setLocation(700-((i+x)/2) , 450-(i/2));
            setSize(i+ 3*x, i+ x/2);
           
            try {
               Thread.sleep(10);
            }catch (Exception e){}
        }
    }
    
    public void run(){
        try {
           Thread.sleep(7000);
            setVisible(false);
            
            //next Frame
            new  Login();
        }catch (Exception e){}
    }
    
    public static void main(String[] args){
         new Splash();
    }
    
}
