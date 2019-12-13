package top.kxyu.web;

import net.sf.json.JSONObject;
import top.kxyu.dao.userDao;
import top.kxyu.model.user;
import top.kxyu.util.DbUtil;

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
//@WebServlet("/ha")
public class login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		user u = userDao.getUser(username, password);
		JSONObject jsonObject = new JSONObject();
//			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		if (u == null) {
			jsonObject.put("msg", "登录失败");
			jsonObject.put("flag", false);
		} else {
			jsonObject.put("msg", "登录成功");
			jsonObject.put("flag", true);
			jsonObject.put("userId", u.getId());
			String sql = "UPDATE s_user su SET su.session=? WHERE su.id=?";
			DbUtil.execSql(sql, req.getRequestedSessionId(), u.getId());
		}
		resp.getOutputStream().write(jsonObject.toString().getBytes("utf-8"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
}
