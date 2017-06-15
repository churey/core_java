package com.oracle.core.java.innerClass;

public class Updater {
	public void updateModel(BaseModel model, UpdaterCallback callback) {
		System.out.println("update java model ");
		callback.updateEntity(model);
		System.out.println("updated java model " + model.toString());
		System.out.println("save model to db.");
	}
}
