package staticfinal;

public class ParentChild {
    
}

class Parent{
    ParentChild pc1;

    Parent(ParentChild pc1){
        this.pc1 =  pc1;
    }

    Parent(){

    }
}

class Child extends Parent{
    ParentChild pc2;

    Child(ParentChild pc1,ParentChild pc2){
        super(pc1);
        this.pc2 = pc2;
    }

    Child(ParentChild pc2){
        super(null);
        this.pc2= pc2;
    }

    Child(){
        
    }
}