import javax.swing.JFrame;

public class ArabianNightsSkills {

	public static void main(String[] args) {
		JFrame frame = new JFrame("The Arabian Nights Skill Creator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SkillsPanel panel = new SkillsPanel();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
