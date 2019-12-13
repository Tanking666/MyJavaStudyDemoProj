package com.springmvcdemo.controller;

import com.springmvcdemo.mapper.VideoMapper;
import com.springmvcdemo.pojo.Video;
import com.springmvcdemo.pojo.VideoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author KXY
 * @date Created in 2019/12/13 17:47
 */
//@RequestMapping("/hello")
@Controller
public class HelloControll {

	@Autowired
	private VideoMapper videoMapper;

	@RequestMapping("hello")
	public ModelAndView hello() {
		System.out.println("Hello MVC");
		ModelAndView modelAndView = new ModelAndView();
		//设置模型视图用于传递到jsp
		modelAndView.addObject("name", "Tanking666");
		//设置视图名字 相应用户
		modelAndView.setViewName("/webpage/hello.jsp");
		return modelAndView;
	}

	@RequestMapping("getAll")
	public ModelAndView getAll(HttpServletRequest req) {
		System.out.println(req.getParameter("abc"));
		ModelAndView modelAndView = new ModelAndView();
		VideoExample videoExample = new VideoExample();
		VideoExample.Criteria criteria = videoExample.createCriteria();
		criteria.andIdIsNotNull();
		videoExample.setOrderByClause(" name,'pname' ASC ");
		List<Video> videos = videoMapper.selectByExample(videoExample);
		//设置模型视图用于传递到jsp
		modelAndView.addObject("videos", videos);
		//设置视图名字 相应用户
		modelAndView.setViewName("/webpage/hello.jsp");
		return modelAndView;
	}
}
