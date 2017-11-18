package com.niit.yochatbackend.dao;

import java.util.List;

import com.niit.yochatbackend.dto.Blog;
import com.niit.yochatbackend.dto.BlogComment;

public interface BlogCommentDAO {
	
	// add blog comment
	boolean addBlogComment(BlogComment blogComment);
	
	// update blog comment
	boolean updateBlogComment(BlogComment blogComment);
	
	// delete blog comment
	boolean deleteBlogComment(BlogComment blogcomment);
	
	// get blog comment by id
	BlogComment getBlogComment(int id);
	
	// get list of blog comment
	List<BlogComment> list();
	
	// get list of Blog comment by blog id
	List<BlogComment> list(int id);
	
	// delete blog comment by blog id
	boolean deleteCommentByBlogId(Blog blogId);
}
