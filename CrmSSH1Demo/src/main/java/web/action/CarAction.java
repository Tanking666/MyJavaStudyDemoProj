package web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import entity.Car;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/11/4 14:52
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class CarAction extends ActionSupport implements ModelDriven {
	private Car car = new Car();

	public Object getModel() {
		return car;
	}

	public String saveCar() {
		ServletContext sc = ServletActionContext.getServletContext();
		WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(sc);

		return "";
	}
}
