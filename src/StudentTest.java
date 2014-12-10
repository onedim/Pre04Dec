
public class StudentTest {

	public static void main(String[] args) {
	
	Student []s; napraviNiz(10);
		
			
	}
	public static Student[]napraviNiz(int velicina){
		Student[] niz=new Student[velicina];
		int i;
		for(i=0;i<niz.length;i++){
			niz[i]=new Student();
			niz[i].ime="Ime";
			niz[i].prezime="Prezime";
			niz[i].brStudenata++;
			niz[i].brIndexa=niz[i].brStudenata;
		}
		return niz;
	}

	public static void Ispis(Student [] s ) {
		
		System.out.printf("Ime: %10s \nPrezime: %6s\nIndex: %8s \nBrStud %8d\n\n",s[i].ime,s[i].prezime,s[i].brIndexa,s[i].brStudenata);
		
	}

}