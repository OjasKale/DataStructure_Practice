package stringStudy;

public class SpreadSheetColumnNumber {
	
	public static void main(String[] args) {
		final String col = "A";
		System.out.println(computeTheColNumber(col));
	}

	private static int computeTheColNumber(final String col) {
		int res = 0;
		for (int i = 0; i < col.length(); i++) {
			res = res * 26 + col.charAt(i) - 'A' + 1;
		}
		return res;
	}

}
