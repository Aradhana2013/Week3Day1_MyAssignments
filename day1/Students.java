package week3.day1;

public class Students {


	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id + name);

	}

	public void getStudentInfo(String email, String phonenumber) {
		System.out.println(email + phonenumber);

	}

	public static void main(String[] args) {
		Students St = new Students();
		String name = " Gomathy";
		String email = "abc@gmail.com";
		String phonenumber = " 6479642013";
		St.getStudentInfo(237363);
		St.getStudentInfo(237363, name);
		St.getStudentInfo(email, phonenumber);

	}

}
