package top.kxyu.web;

import net.sf.json.JSONObject;
import top.kxyu.dao.userDao;
import top.kxyu.util.StringUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/18 23:33
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class reg extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		JSONObject jsonObject = new JSONObject();
		if (StringUtil.isAllNotEmpty(username, password)) {
			Boolean flag = userDao.addUser(username, password);
			String msg;
			if (flag == null) {
				msg = "用户已存在";
				jsonObject.put("flag", false);

			} else if (flag) {
				msg = "注册成功";
				jsonObject.put("flag", true);
			} else {
				msg = "失败";
				jsonObject.put("flag", false);
			}
			jsonObject.put("msg", msg);
		}
		resp.getOutputStream().write(jsonObject.toString().getBytes("utf-8"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
}
