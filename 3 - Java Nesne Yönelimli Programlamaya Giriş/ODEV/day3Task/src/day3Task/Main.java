package day3Task;

public class Main {

	public static void main(String[] args) {
		
		//USER
		User user = new User("�brahim", "Erdo�an", "ibrahimcan.erdogann@gmail.com", "icanerdogan", "123");
		
		//INSTRUCTOR
		Instructor instructor = new Instructor("Engin", "Demiro�", "engindemirog@gmail.com", "engindemirog","1234", 20);
		
		//STUDENT
		Student student = new Student("Can", "Erdo�an", "ibrahim4545erdogan@gmail.com", "ican","12345", "Bal�kesir �niversitesi", "End�stri M�hendisli�i");
				
		//USER MANAGER
		UserManager userManager = new UserManager();
		
		userManager.addUser(user);
		userManager.signIn(user);
		userManager.signOut(user);
		userManager.changeEmail(user, "deneme@gmail.com");
		userManager.changePassword(user, "deneme");
		userManager.changeUsername(user, "icaner");
		userManager.getInformation(user);
		userManager.removeUser(user);
		
		//INSTRUCTOR MANAGER
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.addUser(instructor);
		instructorManager.getInformation(instructor);
		instructorManager.removeUser(instructor);
		
		//STUDENT MANAGER
		StudentManager studentManager = new StudentManager();
		
		instructorManager.addUser(student);
		instructorManager.getInformation(student);
		instructorManager.removeUser(student);
		
	}

}
