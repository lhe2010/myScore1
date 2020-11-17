// 2020-11-17 화 1교시 15:21-15:50 1회끝

public class ScoreTest {

	public static void main(String[] args) {
//		System.out.println(ScoreVO.count);
//		ScoreVO vo = new ScoreVO("홍길동", 100,100,100);
//		System.out.println(vo);
		
		ScoreList scoreList = new ScoreList();
		scoreList.addScore(new ScoreVO("홍길동",10,20,30));
		scoreList.addScore(new ScoreVO("오길동",100,40,30));
		scoreList.addScore(new ScoreVO("김길동",10,20,60));
		scoreList.addScore(new ScoreVO("이길동",10,90,30));
		scoreList.addScore(new ScoreVO("곽길동",87,99,44));
		
		System.out.println(scoreList);
	}

}
