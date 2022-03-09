package Model.Monster;

import java.util.LinkedList;

public class MonsterObjectPool {

	public LinkedList<Monster1> mon1Q;
	public LinkedList<Monster2> mon2Q;
	public LinkedList<Monster3> mon3Q;
	public LinkedList<Monster4> mon4Q;
	public LinkedList<Monster5> mon5Q;
	public LinkedList<MidBoss> midbossQ;
	public LinkedList<FinalBoss> finalbossQ;
	
	public MonsterObjectPool() {
		mon1Q = new LinkedList<Monster1>() ;
		mon2Q = new LinkedList<Monster2>();
		mon3Q = new LinkedList<Monster3>();
		mon4Q = new LinkedList<Monster4>();
		mon5Q = new LinkedList<Monster5>();
		midbossQ = new LinkedList<MidBoss>();
		finalbossQ = new LinkedList<FinalBoss>();
		
		makeObjectPool();
	}
	
	public void makeObjectPool() {
		for(int i = 0 ; i <10; i++) {
			mon1Q.addLast(new Monster1());
			mon2Q.addLast(new Monster2());
			mon3Q.addLast(new Monster3());
			mon4Q.addLast(new Monster4());
			mon5Q.addLast(new Monster5());
		}
		midbossQ.addLast(new MidBoss());
		finalbossQ.addLast(new FinalBoss());
	}
}
