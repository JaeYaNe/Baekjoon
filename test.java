
public class test {
	private static boolean checkTie(int[] lst) {
		for(int i = 0; i<5; i++) {
			if(lst[i]>0) {
				for(int j = i+1; j<6; j++) {
					if(lst[j]>0) {
						lst[i] -= 1;
						lst[j] -= 1;
						i--;
						break;
					}
				}
			}
		}
		for(int i = 0; i<6; i++) {
			if(lst[i]>0) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] lst = {0,0,2,1,0,0};
		if(checkTie(lst))System.out.println("기록 잘 됨");
		else System.out.println("기록 못 됨");
	}
}
