package com.lianbiao.movie.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lianbiao.movie.domain.Movie;
import com.lianbiao.movie.service.MovieService;

@Controller
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("tolist")
	public String movieList(Model model,@RequestParam(defaultValue = "1")int pageNum,String name,String dyname,String ntime,Integer price1,Integer price2) {
		PageHelper page = new PageHelper();
		page.startPage(pageNum, 3);
		List<Movie> movieList = movieService.movieList(name,dyname,ntime,price1,price2);
		PageInfo info = new PageInfo(movieList);
		model.addAttribute("movieList",movieList);
		model.addAttribute("info", info);
		model.addAttribute("name", name);
		model.addAttribute("dyname",dyname);
		model.addAttribute("ntime",ntime);
		model.addAttribute("price1",price1);
		model.addAttribute("price2",price2);
		return "list";
	}
	
	@RequestMapping("selectMovie")
	public String selectMovie() {
		
		return "movie";
	}
	
	@ResponseBody
	@RequestMapping("del")
	public Object del(String ids) {
		boolean flag = movieService.del(ids);
		return flag;
	}
	
	
	@ResponseBody
	@RequestMapping("ztai")
	public Object ztai(Integer zt,Integer id) {
		boolean flag = movieService.updateZt(zt,id);
		return flag;
	}
}
