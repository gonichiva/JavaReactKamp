package day3Task;

public class StudentManager extends UserManager{
	

	public void getInformation(Student student) {
		System.out.println("��retmenin Ad�: "+ student.getFirstName() + " "+ student.getLastName());
		System.out.println("�leti�im: "+ student.getEmail());
		System.out.println("Okul: "+ student.getSchool());
		System.out.println("B�l�m: "+ student.getDepartment());
	}
	
	public void addUser(Student s) {
		
		Student student = new Student(s.getFirstName(), s.getLastName(), s.getEmail(), s.getUsername(), s.getPassword(), 
										s.getSchool(), s.getDepartment());
		s.students.add(student);
		System.out.println("��renci Olu�turuldu");
	}

	
	public void removeUser(Student s) {
		String username = s.getUsername();
		
		for(int i=0;i<s.students.size();i++) {
			if(s.students.get(i).getUsername().equals(username)) {
				System.out.println("Kullan�c� Ad�n�z� De�i�tirmek i�in �ifrenizi Giriniz: ");
				String password = scanner.nextLine();
				
				if(password.equals(s.students.get(i).getPassword())) {
					s.students.remove(i);
					System.out.println("��renci Silindi");
				}
				else {
					System.out.println("Yanl�� �ifre Girdiniz. ��leminiz Ger�ekle�tirilemedi.");
				}
			}
			else {
				System.out.println("B�yle bir ��renci profili bulunamad�.");
			}
		}
	}
	
}
