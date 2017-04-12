package com.personal.control;



import com.personal.entity.Blog;
import com.personal.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	 private BlogService blogService;
	
	//查询所有博文
	@RequestMapping("/selectAll")
	public String selectAll(){
		
		
		return "index";
	}
	
	//保存博文
	@RequestMapping("/insertBlog")
	public String insertBlog(){
		
		
		
		return "index";
	}
	
	
	//更改博文状态
	@RequestMapping("/updateBlogStatus")
	public String updateBlogStatus(){
		
		
		
		return "index";
	}
	
	//更新博文
	@RequestMapping("/updateBlogContent")
	public String updateBlogContent(){
		
		
		
		return "index";
	}
	@RequestMapping("/toIndex.do")
	public String toIndex(HttpSession session, Model model){
		List<Blog> bloglist = blogService.findIdAndTitleByStatus("1");
		session.setAttribute("bloglist", bloglist);
		Blog blog = blogService.findFirstbyStatus("1");
		model.addAttribute("theblog", blog);
		return "index";
		
	}
	
	@RequestMapping("/toBlog.do")
	public String toBlog(Model model,HttpSession session,@RequestParam("id")int id){
		List<Blog> bloglist = blogService.select_Id_Title();
		session.setAttribute("bloglist", bloglist);
		Blog blog = blogService.selectBlogById(id);
		model.addAttribute("theblog", blog);
		return "index";
		
	}
	@RequestMapping("/toEdit.do")
	public String toEdit(Model model,HttpSession session){
		List<Blog> bloglist = blogService.select_Id_Title();
		session.setAttribute("bloglist", bloglist);
		return "edit";
		
	}
	@RequestMapping("/postBlog.do")
	public String postBlog(Model model, HttpSession session, HttpServletRequest request, HttpServletResponse response){
		 Blog b = new Blog();
		 
		 b.setTitle(request.getParameter("title"));
		 b.setContent(request.getParameter("content"));
		 b.setStatus("1");
		 blogService.insertBlog(b);
//		 try {
//			PrintWriter pw = response.getWriter();
//			String jsonStr = ;
//			pw.print(jsonStr);
//			pw.flush();
//			pw.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 return "redirect:toIndex.do";
		
	}
	@RequestMapping("/deleteBlog.do")
	public String deleteBlog(Model model,HttpSession session,@RequestParam("id")int id) {
		Blog blog = blogService.selectBlogById(id);
		blog.setStatus("0");
		blogService.updateBlogStatus(blog);
		return "redirect:toEdit.do";
		
	}
	

}
