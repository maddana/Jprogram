package day5;

public class PojoStudent {
		private String name;
		private int age,marks; //this can't be accessed outside the class only accessed inside the class
		//setter method to add data and getter method to read the data.
		public String getName() {//right click and goto source and generate get and set method
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
}
