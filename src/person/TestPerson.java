
package person;


public class TestPerson {
    public static void main(String[] args) {
        
        Person one = new Person();
        
        one.setName("piero");
        one.setSurname("bisello");
        one.setAdress("rue d'espagne 98, 1060 st gilles");
        one.setPhone("00320493142597");
        one.setAge(33);
        one.setNationality("h");
      
        
        Person two = new Person();
        
        two.setName(randomName());
        two.setSurname("bisell");
        two.setAdress("ru d'espagn 98, 1060 st gille");
        two.setPhone("0032049314259");
        two.setAge(32);
        two.setNationality("italia");
        
        Person three = new Person();
        
        three.setName("pie");
        three.setSurname("bisel");
        three.setAdress("ru d'espag 98, 1060 st gill");
        three.setPhone("003204931425");
        three.setAge(31);
        three.setNationality("itali");
        
        Person four = new Person();
        
        four.setName("piero");
        four.setSurname("bisello");
        four.setAdress("rue d'espagne 98, 1060 st gilles");
        four.setPhone("00320493142597");
        four.setAge(33);
        four.setNationality("italian");
        
        System.out.println(two.toString());
        System.out.println(one.equals(four));
        
    }
    
        static public String randomName(){
        char[] array = new char[(int)(Math.random() * 10 + 3)];
        for (int i =0;i<array.length;i++){
            array[i]=(char)(int)(Math.random() * (122 - 97) + 97);
        }
        return new String(array);
    }
    
}
