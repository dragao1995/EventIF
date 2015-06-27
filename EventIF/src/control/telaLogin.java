package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaCadastro;
import view.TelaLogin;

public class telaLogin {
TelaLogin tl = new TelaLogin();
		
		
public TelaLogin getTl() {
			return tl;
		}
public void setTl(TelaLogin tl) {
			this.tl = tl;
		}


public void EventosTelaLogin(){
	
	tl.getBtnCadastro().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			TelaCadastro windowTC = new TelaCadastro();
			windowTC.getFrame().setVisible(true);
			tl.getFrameLogin().setVisible(false);
					
		}
	});
	
	tl.getBtnLogin().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			
					
		}
	});
			
	
}
	

}
