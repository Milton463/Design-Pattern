package com.milton.design.pattern.memento;

public class TestMementoPattern {

	public static void main(String[] args) {
		CareTaker careTaker =  new CareTaker();

		Originator originator = new Originator(5, 10, careTaker);
		System.out.println("Default state: "+originator);
		
		originator.setX(originator.getX() * 51);
		System.out.println("state: "+originator);
		originator.createSavePoint("SAVE1");
		
		originator.setY(originator.getY()/22);
		System.out.println("state: "+originator);
		
		originator.undo();
		System.out.println("state after undo: "+originator);
		
		originator.setX(Math.pow(originator.getX(), 3));
		originator.createSavePoint("SAVE2");
		System.out.println("state: "+originator);
		
		originator.setY(originator.getY() - 30);
		originator.createSavePoint("SAVE3");
		System.out.println("state: "+originator);
		
		
		originator.setY(originator.getY()/22);
		originator.createSavePoint("SAVE4");
		System.out.println("state: "+originator);
		
		originator.undo("SAVE2");
		System.out.println("Retrieving at: "+originator);
		
		originator.undoAll();
		System.out.println("State after undo all");
	}

}
