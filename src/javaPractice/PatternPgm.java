package javaPractice;

public class PatternPgm {
public static void main(String[] args) {
	int last = 5;
	int num = 1;
	for(int i = 0;i<last;i++) {
		for(int j=0;j<last;j++) {
			if(num>9) {
				num=1;
			}
			if(i>=j) {
				System.out.print(num++);
			}
		}
		System.out.println();
	}
}
}
