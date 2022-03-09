package Control.Strategy;

import java.util.LinkedList;

import Model.Monster.Monster;

public class SkillStrategy1 implements SkillStrategy{

	public void skill(LinkedList<LinkedList<Monster>>  target) {
		for(int i=0;i<target.get(0).size();i++) {
			target.get(0).get(i).hp -= 1;
		}
		System.out.println("라이트닝 보오오올트");
		
	}
	public String getSkillname() {
		return "라이트닝 볼트";
	}
}
