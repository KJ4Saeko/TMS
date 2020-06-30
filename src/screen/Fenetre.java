package screen;

//Classe permettant de cr�er une fen�tre 
import javax.swing.JFrame;

public class Fenetre extends JFrame{
	
	public Fenetre () {
		super();
		create();
	}
	
	public void create() {
	    setTitle("TMS");
	    setSize(1440, 900);
	    //Nous demandons maintenant � notre objet de se positionner au centre
	    setLocationRelativeTo(null);
	    //Termine le processus lorsqu'on clique sur la croix rouge
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Et enfin, la rendre visible        
	    setVisible(true);
	}

        
}