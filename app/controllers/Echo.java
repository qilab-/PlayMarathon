package controllers;

import models.request.Echo.EchoResultGetPostRequest;
import models.response.Echo.EchoResponse;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Echo extends Controller {

	public static Result index() {
		Form<EchoResultGetPostRequest> form = Form.form(EchoResultGetPostRequest.class);
		return ok(views.html.echo.index.render(
				"title",
				form));
	}
	
	public static Result result() {
		Form<EchoResultGetPostRequest> form = Form.form(EchoResultGetPostRequest.class).bindFromRequest();
		if (form.hasErrors()) {
			return badRequest(views.html.echo.index.render(
					"ERROR",
					form));
		}
		EchoResultGetPostRequest request = form.get();
		EchoResponse response = new EchoResponse();
		response.setName(request.getName());
		response.setAge(request.getAge());
		return ok(views.html.echo.result.render(
				"title",
				response));
	}
}
