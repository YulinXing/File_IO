
public class Students
{
	private String id;
	private String email;
	private String home;
	private String tutor;
		
	public Students(String id, String email, String home, String tutor)
	{
		this.id=id;
		this.email=email;
		this.home=home;
		this.tutor=tutor;
	}
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	
	
}
