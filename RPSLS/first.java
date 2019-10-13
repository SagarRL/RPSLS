package RPSLS;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;


public class first  extends JFrame{
	
	JPanel  Bpanel=new JPanel();
	JPanel LeftPanel=new JPanel();
	JPanel RightPanel=new JPanel();
	JPanel BottomPanel=new JPanel();
	
	
	Border paddingBorder=BorderFactory.createEmptyBorder(2, 4, 2, 6);
	Border recessedBorder=BorderFactory.createLoweredBevelBorder();
	Border blackLineBorder=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK);
	JLabel UserName=new JLabel("Player: ");
	JLabel usrname;
	JLabel usrname2;
	
	JLabel CompName=new JLabel("Computer");
JButton Rules=new JButton("Game Rules");
	

	
	


	
	public first(){
		getUserName();
		Rules();
		createUserPanel();
		createCompPanel();
		
		createContainer();
		promptRules();
		add(Bpanel,BorderLayout.NORTH);
		
	}
	public void createContainer() {
		Bpanel.setLayout(new BorderLayout());
		Bpanel.add(LeftPanel,BorderLayout.WEST);
		Bpanel.add(RightPanel,BorderLayout.EAST);
		Bpanel.add(BottomPanel,BorderLayout.SOUTH);
	
	}
	public void createUserPanel() {

		LeftPanel.setLayout(new FlowLayout());
		LeftPanel.add(UserName);
		usrname.setBorder(BorderFactory.createCompoundBorder(recessedBorder,paddingBorder));
		LeftPanel.add(usrname);

	}
public void createCompPanel() {
			
	RightPanel.setLayout(new FlowLayout());
	CompName.setBorder(BorderFactory.createCompoundBorder(recessedBorder,paddingBorder));
	RightPanel.add(CompName);
	
	RightPanel.add(Rules);
		
	}
public void Rules() {
	Rules.addActionListener(new ActionListener(){

		
		public void actionPerformed(ActionEvent e) {
			displayRules();
			
		}

		
	});

}
public void promptRules() {
	int option=0;
	option=JOptionPane.showConfirmDialog(null, "Would u like to read the rules");
	
	if(option==JOptionPane.YES_OPTION)
		displayRules();
	
	
}	
public void getUserName() {
	String str= JOptionPane.showInputDialog(null,"Enter Ur Name: ","User Name",JOptionPane.OK_OPTION);
	if(str!=null)
	{
		int ConfirmName= JOptionPane.showConfirmDialog(null, "U entered the text: " + str + ", Keepas user name?","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		if(ConfirmName==JOptionPane.YES_OPTION){
			usrname=new JLabel(str);
			usrname2=new JLabel(str);
		}
		else
			getUserName();
		
	}
} 

public void displayRules() {
	
	String rulesMsg="Rock crushes scissor(rock wins)\n"+
					"Rock crushes lizard(rock wins)\n"+
					"Paper disproves Spock(Paper wins)\n"+
					"Paper Covers rock(Paper wins)\n"+
					"Scissors cuts paper(Scissors wins)\n"+
					"Lizard poisons Spock(Lizard wins)\n"+
					"Lizard eats paper(Lizardwins)\n"+
					"Spock smashes scissors(Spocks Wins)\n"+
					"Spock vaporizes rock(Spock wins)\n"+
					"Tie if both choices are same\n";
	
	JOptionPane.showMessageDialog(null, rulesMsg);

}


}
