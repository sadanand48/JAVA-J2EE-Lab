import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Demo {
	Demo(){
		JFrame f = new JFrame();
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		JTextField t3=new JTextField(10);
		JTextField t4=new JTextField(10);
		JButton b1= new JButton("Submit");
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.add(b1);
		f.setSize(300,300);

		f.setLayout(new FlowLayout());
		f.setVisible(true);
		b1.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				
				String s1=t1.getText();
				String s2=t2.getText();
				String s3=t3.getText();
				String s4=t4.getText();
				
				System.out.print(s1+s2+s3+s4);
			}
			
		});
	}
		public static void main(String args[]) throws Exception {
			new Demo();
			/*Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/demo";
			String uname="root";
			String password="atul4898";
			Connection c=DriverManager.getConnection(url,uname,password);
			String query="insert into Representative values(13,'adul','karnataka',200,400)";
			Statement st= c.createStatement();
			int c1=st.executeUpdate(query);
			System.out.print(c1 + " rows affected");
			st.close();
			c.close();*/
			
}
}