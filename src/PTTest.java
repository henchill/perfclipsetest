
public class PTTest {
	public int average(int n) {
		double total = 0.0;
		for (int i = 0; i < n; i += 1) {
			double tmp = Math.random() * 10000 + 1;
//			System.out.println(tmp);
			total += tmp;
		}
		return (int) (total / n);
	}
}