package dept.and.Product;

abstract class Department{
    abstract int getDepartmentSize();
}

class CS extends Department{
    private int NoOFStudents =  100;
    @Override
    int getDepartmentSize(){
        return NoOFStudents;
    }
}