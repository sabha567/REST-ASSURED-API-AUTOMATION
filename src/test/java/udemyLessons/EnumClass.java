package udemyLessons;

public enum EnumClass {

	AddPlaceAPI("/maps/api/place/add/json"), 
	DeletePlaceAPI("/maps/api/place/delete/json"), 
	GetPlaceAPI("/maps/api/place/get/json");

	private String resource;

	//Constructor
	EnumClass(String string1) {
		this.resource = string1;
	}

	public String returnValue() {
		return resource;
	}

}