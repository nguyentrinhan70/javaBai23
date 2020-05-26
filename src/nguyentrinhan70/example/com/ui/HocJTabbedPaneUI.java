package nguyentrinhan70.example.com.ui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class HocJTabbedPaneUI extends JFrame {
	JTabbedPane tab;
	public HocJTabbedPaneUI(String title){
		super(title);
		addControls();
		addEvents();
	}
	public void showWindow(){
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	public void addControls()
	{
		Container con = getContentPane();
		tab = new JTabbedPane();
		con.add(tab);
		JPanel pnTab1 = new JPanel();
		JPanel pnTab2 = new JPanel();
		JPanel pnTab3 = new JPanel();
		
		tab.add(pnTab1,"Cấu hình");
		tab.add(pnTab2,"Bảo mật");
		tab.add(pnTab3, "Phân quyền");
		
		pnTab1.setBackground(Color.RED);
		pnTab2.setBackground(Color.BLACK);
		pnTab3.setBackground(Color.BLUE);
		
		pnTab1.add(new JButton("Đây là button 1"));
		pnTab2.add(new JButton("Đây là button 2"));
		pnTab3.add(new JButton("Đây là button 3"));
	}
	public void addEvents(){
	}
}
