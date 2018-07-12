package model;



public class BbsDto {
	private int seq; // 게시글 고유 번호
	private String movieTitle; // 영화 제목
	private String title; // 게시글 제목
	private String content; // 게시글 내용
	private String id; // 작성자 아이디
	private int recommend; // 추천수
	private int readcount; // 조회수
	private String wdate; // 작성일
	private int del; // 삭제 유무 0 == 삭제안됨 , 1 == 삭제됨

	public BbsDto(int seq, String movieTitle, String title, String content, String id, int recommend, int readcount,
			String wdate, int del) {
		super();
		this.seq = seq;
		this.movieTitle = movieTitle;
		this.title = title;
		this.content = content;
		this.id = id;
		this.recommend = recommend;
		this.readcount = readcount;
		this.wdate = wdate;
		this.del = del;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRecommend() {
		return recommend;
	}

	public void setRecommend(int recommend) {
		this.recommend = recommend;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getDel() {
		return del;
	}

	public void setDel(int del) {
		this.del = del;
	}

	
	
	
}
