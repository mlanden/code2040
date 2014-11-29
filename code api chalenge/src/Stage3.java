import java.util.ArrayList;


public class Stage3 {

	public static String[] NoPre(String prefix, String[] words){
		ArrayList<String> keeps = new ArrayList<String>();
		for(int i = 0; i < words.length; i++){
			if(!words[i].startsWith(prefix)){
				keeps.add(words[i]);
			}
		}
		String[] vals = new String[keeps.size()];
		for(int i = 0; i < keeps.size(); i++){
			vals[i] = keeps.get(i);
		}
		return vals;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] collect = {"116eIjTT","758mThB3","75859xyB","116GqSUZ","758MF230","116h2fs5"};
		String pre = "979";
		String[] ans = NoPre(pre, collect);
		for(String an : ans)
			System.out.println(an);
	}

}
