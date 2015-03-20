package web_crawler;

import java.io.Serializable;
//1、序列化是干什么的？简单说就是为了保存在内存中的各种对象的状态，并且可以
//把保存的对象状态再读出来。虽然你可以用你自己的各种各样的方法来保存Object States，但是Java给你提供一种应
//比你自己好的保存对象状态的机制,那就是序列化        2、什么情况下需要序列化  a）当你想把的内存中的对象保
//存到一个文件中或者数据库中时候；b）当你想用套接字在网络上传送对象的时候；c）当你想通过RMI传输对象的时候；

public class Link implements Serializable{

	private String link ;// 本link的文本内容,即anchor的全部
	private int depth;// 本link在所在页面的深度
	private double score;// 对本链接的打分
	private String url;// 记录本link的绝对url
	private boolean belong;// 是本网站为1,否则为0.
	private int distance;// 本连接距离目标的距离1、2、3

	public Link(int value) {
		depth = value;// 对link的深度记录。
	}

	public void set_distance(int value) {
		distance = value;
	}

	public void set_belong(boolean value) {
		belong = value;
	}

	public String get_url() {
		return url;
	}

	public String get_link() {
		return link;
	}

	public int get_depth() {
		return depth;
	}

	public void set_url(String value) {
		url = value;
	}

	public void set_depth(int value) {
		depth = value;
	}

	public void set_link(String value) {
		link = value;
	}

	public void set_score(double value) {
		score = value;
	}

	public double get_score() {
		return score;
	}

	public boolean get_belong() {
		return belong;
	}

	public int get_distance() {
		return distance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
