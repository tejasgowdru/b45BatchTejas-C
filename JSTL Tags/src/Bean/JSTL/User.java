package Bean.JSTL;


import javax.servlet.annotation.WebServlet;



@WebServlet("/User")
     
	public class User {
		String firstName;
		String lastName;
	public User(){
		firstName= "Ajith";
		lastName= "Kumar";
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName=firstName;
		
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.firstName=lastName;
	}




}
