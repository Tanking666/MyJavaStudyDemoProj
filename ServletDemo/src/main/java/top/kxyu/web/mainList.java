package top.kxyu.web;

import top.kxyu.util.DbUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @INFO:
 * @Auther: KXY
 * @Date: Created in 2019/10/18 23:33
 * @multiplexing: FALSE
 * @Despriction: FALSE
 */
public class mainList extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Content-type", "text/html;charset=UTF-8");
		resp.setCharacterEncoding("utf-8");
		req.setCharacterEncoding("utf-8");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (checkP(req.getSession().getId())) {

		} else {
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}

	}

	private boolean checkP(String session) {
		String sql = "SELECT su.id FROM s_user su WHERE su.session=?";
		ResultSet rs = DbUtil.querySQL(sql, session);
		try {
			if (rs != null && rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
