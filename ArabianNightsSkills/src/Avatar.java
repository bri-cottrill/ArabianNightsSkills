import java.util.ArrayList;
import java.util.Random;

public class Avatar {
	private String name;
	private String skill1, skill2, skill3;
	
	public Avatar(String name){
		this.name = name;
		createSkills();
	}
	
	private void createSkills(){
		ArrayList<String> skillList = new ArrayList<>();
		skillList.add("Acting & Disquise"); skillList.add("Appearance"); skillList.add("Bargaining & Evaluation");
		skillList.add("Beguiling"); skillList.add("Courtly Graces"); skillList.add("Enduring Hardship");
		skillList.add("Luck"); skillList.add("Magic"); skillList.add("Piety"); skillList.add("Quick Thinking");
		skillList.add("Scholarship"); skillList.add("Seamanship"); skillList.add("Seduction"); skillList.add("Stealth & Stealing");
		skillList.add("Storytelling"); skillList.add("Weapon Use"); skillList.add("Wilderness Lore"); skillList.add("Wisdom");
		
		Random generator = new Random();
		
		
		this.skill1 = skillList.remove(generator.nextInt(skillList.size()));
		this.skill2 = skillList.remove(generator.nextInt(skillList.size()));
		this.skill3 = skillList.remove(generator.nextInt(skillList.size()));
	}
	
	@Override
	public String toString(){
		return name + ": " + skill1 + ", " + skill2 + ", " + skill3 + "\n"; 
	}
}
