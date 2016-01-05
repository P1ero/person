package person;

public class Person {

    private String name;
    private String surname;
    private String address;
    private String phone;
    private int age;
    private String nationality;
    
    Person(){        
    }
    
    public void setName(String a){
        this.name = a;
    }
    
    public void setSurname(String a){
        this.surname = a;
    }
    
    public void setAdress(String a){
        this.address = a;
    }
    
    public void setPhone(String a){
        this.phone = a;
    }
    
    public void setAge(int a){
        this.age = a;
    }
    
    public void setNationality(String a){
        this.nationality = a;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public int getAge(){
        return age;
    }
    
    public String getNationality(){
        return nationality;
    }
 
    public String toString(){
        String a;
        String age = "" + this.age;
        a = this.name + "\n" + this.surname + "\n" + this.address + "\n" + this.phone + "\n" + age + "\n" + this.nationality;
        return a;
    }
    
    public boolean equals(Person a){
        boolean x = false;
        if (this.name == a.getName())
            if (this.surname == a.getSurname())
                if (this.address == a.getAddress())
                    if (this.phone == a.getPhone())
                        if (this.age == a.getAge())
                            if (this.nationality == a.getNationality())
                                x = true;
        return x;
    }
    


    
}
