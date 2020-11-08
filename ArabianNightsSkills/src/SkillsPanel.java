import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;

public class SkillsPanel extends Panel {
	private Label welcome, select;
	private JCheckBox aliBabaBtn, aladdinBtn, sinbadBtn, maarufBtn, zumurrudBtn, scheherazadeBtn;
	private Button createButton;
	private TextArea show;
	
	public SkillsPanel(){
		
		
		//setLayout(new FlowLayout(FlowLayout.CENTER));
		
		welcome = new Label("Welcome to the Arabian Nights Skill Chooser!");
		//welcome.setAlignment(alignment);
		select = new Label("Please select all avatars being used this game: ");
		
	    aliBabaBtn = new JCheckBox("Ali Baba");
	    aladdinBtn = new JCheckBox("Aladdin");
	    sinbadBtn = new JCheckBox("Sinbad");
	    maarufBtn = new JCheckBox("Ma'aruf");
	    zumurrudBtn = new JCheckBox("Zumurrud");
	    scheherazadeBtn = new JCheckBox("Scheherazade");
	    createButton = new Button("Create the Skills");
	    ButtonListener listener = new ButtonListener();
	    createButton.addActionListener(listener);

		show = new TextArea(10, 60);
		show.setEditable(false);
		
		setBackground(Color.lightGray);
		setPreferredSize(new Dimension(500, 500));
		
		add(welcome);
		add(select);
		add(aliBabaBtn);
		add(aladdinBtn);
		add(sinbadBtn);
		add(maarufBtn);
		add(zumurrudBtn);
		add(scheherazadeBtn);
		add(createButton);
		
		add(show);
		
	}
	
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			show.setText("");
			createSkills();
		}
		
		public void createSkills(){
			if(aliBabaBtn.isSelected()){
				Avatar alibaba = new Avatar("Ali Baba");
				show.append(alibaba.toString());
			}
			if(aladdinBtn.isSelected()){
				Avatar aladdin = new Avatar("Aladdin");
				show.append(aladdin.toString());
			}
			if(sinbadBtn.isSelected()){
				Avatar sinbad = new Avatar("Sinbad");
				show.append(sinbad.toString());
			}
			if(maarufBtn.isSelected()){
				Avatar maaruf = new Avatar("Ma'aruf");
				show.append(maaruf.toString());
			}
			if(zumurrudBtn.isSelected()){
				Avatar zum = new Avatar("Zumurrud");
				show.append(zum.toString());
			}
			if(scheherazadeBtn.isSelected()){
				Avatar sche = new Avatar("Scheherazade");
				show.append(sche.toString());
			}
		}
	}
}
