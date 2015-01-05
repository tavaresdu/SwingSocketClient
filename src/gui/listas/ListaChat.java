package gui.listas;

import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListaChat extends JTextArea {

	private static final long serialVersionUID = 1L;
	JScrollPane sp = null;
	
	public ListaChat() {
		JScrollPane scrollPane = new JScrollPane(this);
		scrollPane.setPreferredSize(new Dimension(380, 100));
		this.setLineWrap(true);
		this.setWrapStyleWord(true);
		this.setEditable(false);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		this.sp = scrollPane;
	}
	
	public JScrollPane getScrollPane() {
		return sp;
	}
	
}
