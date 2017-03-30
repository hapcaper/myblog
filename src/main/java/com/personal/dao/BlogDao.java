package com.personal.dao;

import java.util.List;

import com.personal.entity.Blog;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface BlogDao {

		//查询所有博文
		public List<Blog> selectAll();
		
		//查询某个人所有博文
		public List<Blog> selectAllByAuthor(String author);

		List<String> findTitle();

        List<Blog> findFirst20ByAuthor(@Param("author")String author);


		
		//保存博文
		public int insertBlog(Blog blog);
		 
		//更新博文//
		public  int updateBlog(Blog blog);
	
		public List<Blog> select_Id_Title();
		
		public Blog selectBlogById(@Param("id") int id);

		//删除博客（将其状态至0）
		public int deleteBlogById(@Param("id") int id);


}
