package RPSLS;
import javax.swing.*;

import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class second extends first implements ActionListener {
	public JButton rock,paper,scissor,lizard,spock;
	static Icon r,p,s,l,sp;
    static JLabel us,cs,uc,cc,score;
    public static int cpu_win = 0,player_win = 0,com_c,Tie=0;
    Random rand = new Random();
    public second()
    {
    	this.pack();
		this.setTitle("Rock,Paper,Scissors,Lizard,Spock");

        
		
		setLayout(new FlowLayout());

        r = new ImageIcon("H:/Studies2/Java_miniProj/1.png");
        rock = new JButton(r);
        add(rock);
        p = new ImageIcon("H:/Studies2/Java_miniProj/2.png");
        paper = new JButton(p);
        add(paper);
        s = new ImageIcon("H:/Studies2/Java_miniProj/3.png");
        scissor = new JButton(s);
        add(scissor);
        l = new ImageIcon("H:/Studies2/Java_miniProj/4.png");
        lizard = new JButton(l);
        add(lizard);
        sp = new ImageIcon("H:/Studies2/Java_miniProj/5.png");
        spock = new JButton(sp);
        add(spock);
        
        uc=new JLabel("");
        add(uc);
        cc=new JLabel("");      
        add(cc);
        us = new JLabel();
       
        add(us);
        
        cs = new JLabel();        
        add(cs);
        score = new JLabel();        
        add(score);
        
        rock.addActionListener(this);
        paper.addActionListener(this);
        scissor.addActionListener(this);
        lizard.addActionListener(this);
        spock.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent event)
    {    
        com_c = rand.nextInt(5) + 1;
        print_com_c(com_c);
        if (event.getSource() == rock)            
            rock(com_c);
        if (event.getSource() == paper)
            paper(com_c);
        if (event.getSource() == scissor)
            scissor(com_c);
        if (event.getSource() == lizard)
            lizard(com_c);
        if (event.getSource() == spock)
            spock(com_c);    
    }
    public static void rock(int com_input)
    {
        uc.setText("USER : ROCK");
        int flag = 0;
        switch(com_input)
        {
            case 1: flag = 0; 
            		Tie++;
            		break;
            case 2: flag = 1;
            		cpu_win++; 
            		break;
            case 3: flag = 2;
            		player_win++;
            		break; 
            case 4: flag = 2;
            		player_win++;
            		break; 
            case 5: flag = 1;
            		cpu_win++;
            		break; 
        }
        print(flag);
    }
   
    public static void paper(int com_input)
    {
        uc.setText("USER : PAPER");
        int flag = 0;
        switch(com_input)
        {
            case 1: flag = 2;
            		player_win++; 
            		break; 
            case 2: flag = 0;
            		Tie++;
            		break; 
            case 3: flag = 1;
            		cpu_win++; 
            		break; 
            case 4: flag = 1;
            		cpu_win++;
            		break; 
            case 5: flag = 2;
            		player_win++;
            		break; 
        }
        print(flag);
    }
   
    public static void scissor(int com_input)
    {
        uc.setText("USER : SCISSOR");
        int flag = 0;
        switch(com_input)
        {
            case 1: flag = 1; 
            		cpu_win++; 
            		break; 
            case 2: flag = 2;
            		player_win++; break; 
            case 3: flag = 0;
            		Tie++;
            		break; 
            case 4: flag = 2;
            		player_win++;break; 
            case 5: flag = 1; 
            		cpu_win++;
            		break; 
        }
        print(flag);
    }
   
    public static void lizard(int com_input)
    {
        uc.setText("USER : LIZARD");
        int flag = 0;
        switch(com_input)
        {
            case 1: flag = 1 ;
                 cpu_win++;
      				break; 
            case 2: flag = 2 ;
            		player_win++;
            		break; 
            case 3: flag = 1 ;
            		cpu_win++;
            			break; 
            case 4: flag = 0 ;
            		Tie++;
            		break;//tie 
            case 5: flag = 2 ;
            		player_win++;
            		break; 
        }
        print(flag);
    }

    public static void spock(int com_input)
    {
        uc.setText("USER : SPOCK");
        int flag = 0;
        switch(com_input)
        {
            case 1: flag = 2 ;
            		player_win++;
            		break;
            case 2: flag = 1 ;
            		cpu_win++;
            		break; 
            case 3: flag = 2 ;
            		player_win++;
            		break; 
            case 4: flag = 1 ;
            		cpu_win++;
            		break; 
            case 5: flag = 0 ;
            		Tie++;
            			break; 
        }
        print(flag);
    }

    public static void print_com_c(int com_c)
    {
        switch(com_c)
        {
            case 1: cc.setText("       Computer: ROCK");
            		break;
            case 2: cc.setText("      Computer: PAPER");
            		break;
            case 3: cc.setText("       Copmuter: SCISSOR");
            		break;
            case 4: cc.setText("       Computer: LIZARD");
            		break;
            case 5: cc.setText("       Computer: SPOCK");
            		break;
        }
    }
    
    public static void print(int flag)
    {
        switch(flag)
        {
            case 0: cs.setText("TIE");            
            		us.setText("");
            		break;
            case 1: cs.setText("     Computer WINS. ");            
            		us.setText("");
            		break;
            case 2: us.setText("      User WINS. ");
            		cs.setText("");
            		break;           
        }
        score.setText(" User score : "  +player_win+"	Computer Score : " +cpu_win+" Tie : "+Tie);
        
    }
}
