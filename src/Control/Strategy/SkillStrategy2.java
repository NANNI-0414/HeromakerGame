package Control.Strategy;

import java.util.LinkedList;

import Model.Monster.Monster;

public class SkillStrategy2 implements SkillStrategy {
	public void skill(LinkedList<LinkedList<Monster>> target) {
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < target.get(0).size(); i++) {
				target.get(0).get(i).hp -= 1;
			}
		}
		System.out.println("체이이인 라이트니이러우엉루ㅜ어뤙");

	}

	public String getSkillname() {
		return "체인 라이트닝";
	}
}
