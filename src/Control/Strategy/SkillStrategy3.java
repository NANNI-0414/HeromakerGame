package Control.Strategy;

import java.util.LinkedList;

import Model.Monster.Monster;

public class SkillStrategy3 implements SkillStrategy{
	public void skill(LinkedList<LinkedList<Monster>>  target) {
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < target.get(0).size(); i++) {
				target.get(0).get(i).hp -= 1;
			}
		}
		System.out.println("¿ïÆ®¶ó ¶óÀÌÆ®´× ½ã¾ò¤§º¸ºÀº¸¿À¿ÃÆ®");

	}
	

	public String getSkillname() {
		return "¿ïÆ®¶ó ¶óÀÌÆ®´× ½ã´õº¼Æ®";
	}
}
