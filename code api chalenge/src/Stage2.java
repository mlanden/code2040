
public class Stage2 {

	public static int Find(String[] diction, String key){
		for(int i = 0; i < diction.length; i++){
			if(diction[i].equals(key)){
				return i;
			}
		}
		return -1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] hey = {"aYFdF","XBP8q","GzGZ4","0jDcN","6tb7Y","S3Ady","EEA2O","YzhpU","EV11o",
				"pGlkV","SA2mX","carSH","i8SP1","Q7uAM","34ecY","3RCnC","DYVbt","0IcUV","S4pKM","YD5C8"};
		String needle = "YzhpU";
		System.out.print(Find(hey,needle));
	}

}
