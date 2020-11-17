import java.util.ArrayList;

public class ScoreList {
	
	private ArrayList<ScoreVO> scoreList = new ArrayList<ScoreVO>(); 
	
	public ArrayList<ScoreVO> getScoreList() {	return scoreList;	}
	public void setScoreList(ArrayList<ScoreVO> list) {	this.scoreList = list;	}

	void addScore(ScoreVO vo)	{ this.scoreList.add(vo);	}
	
	@Override
	public String toString() {
		String str = "===============================================================\n";
		str += String.format("번호\t이름\tjava\tjsp\tspring\t총점\t평균\t석차\n");
		str += "===============================================================\n";

		// rank 구하기
		for (int i = 0; i < ScoreVO.count -1; i++) {
			for (int j = i+1; j < ScoreVO.count; j++) {
				if(scoreList.get(i).getTotal() > scoreList.get(j).getTotal())
					scoreList.get(j).setRank(scoreList.get(j).getRank()+1);
				else if(scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) 
					scoreList.get(i).setRank(scoreList.get(i).getRank()+1);
			}			
		}
		
		// 프린트
		for (ScoreVO vo : this.scoreList) {
			str += (vo + "\n");
		}
		str += "===============================================================\n";
		
		return str;
	}
}
