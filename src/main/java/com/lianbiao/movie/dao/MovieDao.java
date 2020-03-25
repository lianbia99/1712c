package com.lianbiao.movie.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lianbiao.movie.domain.Movie;

public interface MovieDao {

	/**
	 * 查询列表数据
	 */
	List<Movie> movieList(@Param("name")String name,@Param("dyname")String dyname,@Param("ntime")String ntime,@Param("price1")Integer price1,@Param("price2") Integer price2);

	/**
	 * 
	 * @Title: del 
	 * @Description: 删除多个数据
	 * @param ids
	 * @return: void
	 */
	void del(@Param("ids")String ids);

	/**
	 * 
	 * @Title: updateZt 
	 * @Description: 状态修改
	 * @param zt
	 * @return: void
	 */
	void updateZt(@Param("zt")Integer zt,@Param("id")Integer id);
}
