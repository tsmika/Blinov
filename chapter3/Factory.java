package chapter3;

public class Factory {

	public Entity createEntity(EntityType entityType) {
		Entity entity = null;

		switch (entityType) {
		case STUDENT:
			entity = new Student();
			break;
		default:
			return null; // (TODO create Exception)
		}

		return entity;
	}

}
