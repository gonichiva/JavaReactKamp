package day3Task;

public class InstructorManager extends UserManager {

	public void getInformation(Instructor instructor) {
		System.out.println("��retmenin Ad�: "+ instructor.getFirstName() + " "+ instructor.getLastName());
		System.out.println("�leti�im: "+ instructor.getEmail());
		System.out.println("Tecr�be Y�l�: "+ instructor.getExperience());

	}
	
	public void addUser(Instructor i) {

		Instructor instructor = new Instructor(i.getFirstName(), i.getLastName(), i.getEmail(), 
												i.getUsername(), i.getPassword(), i.getExperience());
		i.instructors.add(instructor);
		System.out.println("��retmen Olu�turuldu");
	}

	public void removeUser(Instructor ins) {
		String username = ins.getUsername();
		
		for(int i=0;i<ins.instructors.size();i++) {
			if(ins.instructors.get(i).getUsername().equals(username)) {
				System.out.println("Kullan�c� Ad�n�z� De�i�tirmek i�in �ifrenizi Giriniz: ");
				String password = scanner.nextLine();
				
				if(password.equals(ins.instructors.get(i).getPassword())) {
					ins.instructors.remove(i);
					System.out.println("��retmen Silindi");
				}
				else {
					System.out.println("Yanl�� �ifre Girdiniz. ��leminiz Ger�ekle�tirilemedi.");
				}
			}
			else {
				System.out.println("B�yle bir ��retmen profili bulunamad�.");
			}
		}
	}
}
