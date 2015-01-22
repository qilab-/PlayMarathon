package models.request.Echo;

import play.data.validation.Constraints;

public class EchoResultGetPostRequest {

	@Constraints.Required
    @Constraints.MaxLength(15)
	private String name;
	
	@Constraints.Required
	@Constraints.Min(18)
	@Constraints.Max(200)
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
