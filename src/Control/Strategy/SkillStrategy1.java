package Control.Strategy;

import java.util.LinkedList;

import Model.Monster.Monster;

public class SkillStrategy1 implements SkillStrategy{

	public void skill(LinkedList<LinkedList<Monster>>  target) {
		for(int i=0;i<target.get(0).size();i++) {
			target.get(0).get(i).hp -= 1;
		}
		System.out.println("����Ʈ�� ��������Ʈ");
		
	}
	public String getSkillname() {
		return "����Ʈ�� ��Ʈ";
	}
}
