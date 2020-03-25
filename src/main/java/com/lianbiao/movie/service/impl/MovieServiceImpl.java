package com.lianbiao.movie.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lianbiao.movie.dao.MovieDao;
import com.lianbiao.movie.domain.Movie;
import com.lianbiao.movie.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieDao movieDao;
	
	@Override
	public List<Movie> movieList(String name,String dyname,String ntime,Integer price1,Integer price2) {
		// TODO Auto-generated method stub
		return movieDao.movieList(name,dyname,ntime,price1,price2);
	}

	@Override
	public boolean del(String ids) {
		try {
			movieDao.del(ids);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateZt(Integer zt,Integer id) {
		try {
			movieDao.updateZt(zt,id);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
