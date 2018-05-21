
public class MyFunction {
	int getFactorial(int n) {
		int result = 1;
		for(int i = 1; i<=n; i++) {
			result = result*i;
		}
		
		return result;
	}
	
	int makeFormula (int x) {
		int factorial=this.getFactorial(x);
		return (x+7)*factorial;
		
	}
}
