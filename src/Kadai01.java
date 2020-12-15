
public class Kadai01 {

	/**
	 * 課題01
	 * 文字列の左右の文字を反転して返すメソッド
	 * @param s　対象の文字
	 * @return 左右を反転した結果
	 */
	String ReverseString(String s) {
		if(s == null) {
			return null;
		}
		char [] ary = s.toCharArray();
		int j = ary.length-1;
		char   work;
		for(int i=0 ; i < j; i++,j--) {
			work = ary[i];
			ary[i] = ary[j];
			ary[j] = work;

		}
		return  new String(ary);
	}
}
