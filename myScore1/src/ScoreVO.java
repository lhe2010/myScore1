public class ScoreVO {
	
	public static int count;
	private int no;
	private String name;
	private int java;
	private int jsp; 
	private int spring;
	private int total;
	private double average;
	private int rank = 1;
	
	public ScoreVO() {}
	public ScoreVO(String name, int java, int jsp, int spring) {
		no = ++count;
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		this.total = java + jsp + spring;
		this.average = total/3.0;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	} 

	@Override
	public String toString() {
		// 번호  이름  java  jsp  spring  총점  평균  석차  \n
		// 정답t format() 첫 인자 : "   %d   %s %3d  %3d    %3d    %3d  %6.2f %d"
		String str = String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.1f\t%d", no, name, java,jsp, spring, total, average, rank);
		return str;
	}
	
	
}
