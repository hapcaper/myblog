package com.personal.service;

import com.personal.entity.Blog;

import java.util.List;




public interface BlogService {

			//查询所有博文
			public List<Blog> selectAll();
			
			//保存博文
			public int insertBlog(Blog blog);
			 
			//更改博文状态
			public  int updateBlogStatus(Blog blog);
			
			//更新博文
			public  int updateBlogContent(Blog blog);
			
			public List<Blog> select_Id_Title();
			
			public Blog selectBlogById(int id);
			
			public int deleteBlogById(int id);
}
