package gameTetris;

import javax.swing.JLabel;

public class About {
	public JLabel about(){
		JLabel s1= new JLabel("<html><font color='Green'>Game Xếp chữ</font> phiên bản 1.0 (c) 2012 Thiết kế bởi<br><center><font color='Red'> Nguyễn Tính</font> và <font color='Red'> Hoàng An</font></center><br><br>" +
				"WEB SITE : <a href='http://congthuong.net/'>http://congthuong.net</a><br>"+
				"Lớp : CNTT34A<br>"+
				"Email : admin@nguyentinh.com<br>"+
				"Phone : 01212 181 202<br><br>"+
				"Đây là ứng dụng game đầu tiên được chúng tôi <br>viết bằng ngôn ngữ java, dưới sự hướng dẫn<br>"+
				"của thầy <font color='Green'>Nguyễn Anh Tú</font>. vì là game java đầu tiên<br> nên khó tránh khỏi"+
				"có lỗi xảy ra, nếu có nhu cầu<br> các bạn vui lòng phản ánh với chúng tôi."+
				"</html>");
		return s1;
	}
}
