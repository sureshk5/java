package basics;

class Address
{
   int streetNum;
   String city;
   String state;
   String country;
   Address(int street, String c, String st, String coun)
   {
       this.streetNum=street;
       this.city =c;
       this.state = st;
       this.country = coun;
   }
}
class SchoolStudent {
   int rollNum;
   String studentName;
   //Creating HAS-A relationship with Address class
   Address studentAddr;
   SchoolStudent(int roll, String name, Address addr){
       this.rollNum=roll;
       this.studentName=name;
       this.studentAddr = addr;
   }
   
}

public class Aggregation {
	
	public static void main(String[] args) {
		Address ad = new Address(55, "Agra", "UP", "India");
		SchoolStudent obj = new SchoolStudent(123, "Chaitanya", ad);
	       System.out.println(obj.rollNum);
	       System.out.println(obj.studentName);
	       System.out.println(obj.studentAddr.streetNum);
	       System.out.println(obj.studentAddr.city);
	       System.out.println(obj.studentAddr.state);
	       System.out.println(obj.studentAddr.country);
	}
	
}
