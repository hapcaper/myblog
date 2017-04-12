package com.personal.service.serviceimpl;

import java.util.List;

import com.personal.dao.BlogDao;
import com.personal.entity.Blog;
import com.personal.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	private BlogDao blogDao;

	public List<Blog> selectAll() {
		// TODO Auto-generated method stub
		return blogDao.selectAll();
	}

	public int insertBlog(Blog blog) {
		// TODO Auto-generated method stub
		return blogDao.insertBlog(blog);
	}
	

	public int updateBlogStatus(Blog blog) {
		// TODO Auto-generated method stub
		blog.setStatus("0");
		return blogDao.updateBlog(blog);
	}
	
	public int updateBlogContent(Blog blog) {
		// TODO Auto-generated method stub
		
		return blogDao.updateBlog(blog);
	}

	public List<Blog> select_Id_Title() {
		
		return blogDao.select_Id_Title();
	}

	public Blog selectBlogById(int id) {
		return blogDao.selectBlogById(id);
	}

    @Override
    public int deleteBlogById(int id) {
        return 0;
    }


    @Override
    public Blog findFirstbyStatus(String status) {
        Blog blog = blogDao.findFirstbyStatus(status);
        return blog;
    }

    @Override
    public List<Blog> findIdAndTitleByStatus(String status) {
	    List<Blog> blogs = blogDao.findIdAndTitleByStatus(status);
        return blogs;
    }


}
