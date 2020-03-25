package com.lianbiao.movie.service;

import java.util.List;
import java.util.Map;

import com.lianbiao.movie.domain.Movie;

public interface MovieService {
	/**
	 * 
	 * @Title: movieList 
	 * @Description: 查询列表
	 * @return
	 * @return: List<Movie>
	 */
	List<Movie> movieList(String name,String dyname,String ntime,Integer price1,Integer price2);
	/**
	 * 
	 * @Title: del 
	 * @Description: 删除多个数据
	 * @param ids
	 * @return
	 * @return: boolean
	 */
	boolean del(String ids);
	
	/**
	 * 
	 * @Title: updateZt 
	 * @Description: 修改状态
	 * @param zt
	 * @return: boolean
	 */
	boolean updateZt(Integer zt,Integer id);
}
