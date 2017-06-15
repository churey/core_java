package com.oracle.core.java.innerClass;

public class TestUpdateModel {
	public static void main(String[] args) {
		BaseModel model = new BaseModel();
		new Updater().updateModel(model, new UpdaterCallback(){
			@Override
			public void updateEntity(BaseModel model) {
				model.setName("jim");
				model.setAge(11);
			}
		});
	}
}
