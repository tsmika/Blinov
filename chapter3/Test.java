package chapter3;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		TestDataCreator creator = new TestDataCreator();
		Entity[] array =creator.createData(EntityType.STUDENT);
		for(Entity entity : array) {
			System.out.println(entity);			
		}
	}
}
