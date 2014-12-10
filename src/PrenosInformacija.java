
public class PrenosInformacija {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.ime="Nedim";
		s1.prezime="Omerovic";
		s1.brIndexa=24;
		System.out.printf("%s %s ima %d godina\n",s1.ime,s1.prezime,s1.brIndexa);
		Student s2=new Student();
		s2.ime=s1.ime;
		s2.prezime=s1.prezime;
		s2.brIndexa=s1.brIndexa;
		System.out.printf("%s %s ima %d godina\n",s2.ime,s2.prezime,s2.brIndexa);
		s1.ime="Nedo";
		System.out.printf("Izmjena %s %s ima %d godina\n",s1.ime,s1.prezime,s1.brIndexa);
		
		
		
	}

}
