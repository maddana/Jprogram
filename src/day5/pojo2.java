package day5;

public class pojo2 {
	private String name;
	private int age;
	public String getName() {
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
	
	private class Marks
	{
		
		private int english;

		public int getEnglish() {
			return english;
		}

		public void setEnglish(int english) {
			this.english = english;
		}
		
	}
	
	Marks mb=new Marks();
	public void setmarks(int n)
	{
		mb.setEnglish(n);
		System.out.println("dfgkj");
	}
	public int getmarks()
	{
		return mb.getEnglish();
	}

}
