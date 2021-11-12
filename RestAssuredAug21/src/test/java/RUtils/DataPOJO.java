package RUtils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DataPOJO {
	public String email;
	public String first_name;
	public int id;
	public String last_name;
	public String avatar;

	public DataPOJO(String email,String first_name,int id,String last_name ,String avatar ) {
		this.email=email;
		this.first_name=first_name;
		this.id=id;
		this.last_name=last_name;
		this.avatar=avatar;	
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	@Override
	public String toString() {
		   return "{email:" + email + ","+" first_name:" + first_name +","+ "id:"+id+","+"last_name:"+last_name+","
				   +"avatar:"+avatar +"}";
		}

}
