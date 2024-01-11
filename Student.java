public class Student {
	String name;

	String getName() {
		return name;
	}

    public static void main(String[] args) {
        
       
        Student student = new Student();
                
        student.name = "Nikhil";
    
        System.out.println(student.getName());
    }
	
}