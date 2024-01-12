public class Student {
	String name;

	String getName() {
		return name;
	}

    public static void main(String[] args) {
        
       
        Student student = new Student();
                
        student.name = "Mani";
    
        System.out.println(student.getName());
    }
	
}
