package screen;

//Classe permettant de créer une fenêtre 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Fenetre extends JFrame{
	
	private JPanel pan1 = new JPanel();
	
	public Fenetre () {
		super();
		create();
	}
	
	public void create() {
	    setTitle("TMS");
	    setSize(1440, 900);
	    //Nous demandons maintenant à notre objet de se positionner au centre
	    setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //On affiche les boutons ici 
	    createButtons();
	    this.setContentPane(pan1);
	    setVisible(true);
	}
	
	public void createButtons() {
		JButton bouton1 = new JButton("1");
		JButton bouton2 = new JButton("2");
		JButton bouton3 = new JButton("3");
		JButton bouton4 = new JButton("4");
		JButton bouton5 = new JButton("5");
		JButton bouton6 = new JButton("6");
		JButton bouton7 = new JButton("7");
		JButton bouton8 = new JButton("8");
		JButton bouton9 = new JButton("9");
		JButton bouton0 = new JButton("0");
		
		//Ligne 1
		pan1.setLayout(null);
		bouton1.setBounds(150,450,80,50);
		bouton2.setBounds(230,450,80,50);
		bouton3.setBounds(310,450,80,50);
		bouton4.setBounds(150,500,80,50);
		bouton5.setBounds(230,500,80,50);
		bouton6.setBounds(310,500,80,50);
		bouton7.setBounds(150,550,80,50);
		bouton8.setBounds(230,550,80,50);
		bouton9.setBounds(310,550,80,50);
		bouton0.setBounds(150,600,240,50);
		pan1.add(bouton1);
		pan1.add(bouton2);
		pan1.add(bouton3);
		pan1.add(bouton4);
		pan1.add(bouton5);
		pan1.add(bouton6);
		pan1.add(bouton7);
		pan1.add(bouton8);
		pan1.add(bouton9);
		pan1.add(bouton0);
		
	}

        
}