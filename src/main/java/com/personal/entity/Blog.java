package com.personal.entity;

public class Blog {
	 private Integer id;

	    private String title;

	    private String content;

	    private String date;

	    private String author;

	    private String status;

	    
	    
		@Override
		public String toString() {
			return "Blog [id=" + id + ", title=" + title + ", content="
					+ content + ", date=" + date + ", author=" + author
					+ ", status=" + status + "]";
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
}
