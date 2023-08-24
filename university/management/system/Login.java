
package university.management.system;

import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  // use  actinlistener
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    JButton login, cancel;
    JTextField tfusername, tfpassword;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // user name type and inpute type
        JLabel lblusername= new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);
        
        tfusername=new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);
        
        
        // password type and inpute type
        JLabel lblpassword= new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);
        
        tfpassword=new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);
        
        // create login button
        login=new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);  // button pr click krne action kre esliye use kiya hai
        login.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login);
        
        
           
        // create Cancel button
        cancel=new JButton("Cancel");
        cancel.setBounds(180, 140, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);  // button pr click krne action kre esliye use kiya hai
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        
        // create image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        image.setBounds(350, 0, 200, 200);
        
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == login){
            
            String username=tfusername.getText();
            String password=tfpassword.getText();
            
            String query="select * from login where username='"+username+"'and password='"+password+"'";
            
            try{
              Conn c=new Conn();
             ResultSet rs= c.s.executeQuery(query);
             
             if(rs.next()){
                 setVisible(false);
                 new Project();
             }else{
                 JOptionPane.showMessageDialog(null, "Invalid username or password");
                 setVisible(false);
             }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()== cancel){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
}
