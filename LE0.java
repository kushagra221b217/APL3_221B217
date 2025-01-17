class Kushagra {
    int age;
    String name;
    
    void setAge(int Age){
        age = Age;
    }
    
    void setName(String Name){
        name = Name;
    }
    
    int getAge(){
        return age;
    }
    
    String getName(){
        return name;
    }
}

public class LE0
{
    public static void main (String[] args){
        Kushagra obj = new Kushagra();
        obj.setName("Kushagra");
        obj.setAge(20);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        
    }
}

