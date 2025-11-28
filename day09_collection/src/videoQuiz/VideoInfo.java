package videoQuiz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class VideoInfo {
	
	String no, title, category, lendName , lendDate;
	boolean lend;

	
	public VideoInfo(String no, String title, String category) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.lend = false;
		this.lendName = " X ";
		this.lendDate = " X ";
		
	}
	
	public String getNo() {
		return this.no;
	}
	public String getTitle() {
		return this.title;
	}
	public String getCategory() {
		return this.category;
	}
	public boolean isLend() {
		return this.lend;
	}
	public String getLendName() {
		return this.lendName;
	}
	
	public String getLendDate() {
		return lendDate;
	}
	
	public void setNo(String no) {
		this.no = no;		
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setLend(boolean lend) {
		this.lend = lend;
	}
	public void setLendName(String name) {
		this.lendName = name;
	}
	
	public void setLendDate() {
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat();
		this.lendDate = sd.format(date);
	}
	


}
