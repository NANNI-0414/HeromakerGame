package Control.Strategy;

import java.util.LinkedList;

import Model.Monster.Monster;

public interface SkillStrategy {
	public void skill(LinkedList<LinkedList<Monster>> target);
	public String getSkillname();
}
