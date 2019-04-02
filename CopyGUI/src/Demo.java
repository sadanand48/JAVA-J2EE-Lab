
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.*;

public class Demo {
	Demo(){
		JFrame f =new JFrame();
		f.setLayout(new FlowLayout());
		f.setSize(800,800);
		JLabel j1=new JLabel("Source");
		JLabel j2=new JLabel("Destination");
		JButton b1= new JButton("Start");
		JButton b2= new JButton("Stop");
		JTextField t1=new JTextField(30);
		JTextField t2=new JTextField(30);
		f.add(j1);
		f.add(t1);
		f.add(b1);
		f.add(j2);
		f.add(t2);
		f.add(b2);
		f.setVisible(true);
		JProgressBar jp=new JProgressBar(0,100);
		b1.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent e) {
					
				String src=t1.getText();
				String dest=t2.getText();
				jp.setIndeterminate(true);
				jp.setString("Copying");
				jp.setStringPainted(true);
				jp.setVisible(true);
				try {
					f.add(jp);
					f.add(b2);
					f.setVisible(true);
					String content=new String(Files.readAllBytes(Paths.get(src)));
					PrintWriter p = new PrintWriter(dest);
					p.println(content);
					p.close();
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
			}
			
		});
	}
	
	public static void main(String args[]) {
		new Demo();
	}
}