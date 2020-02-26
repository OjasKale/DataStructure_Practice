package mockPracticeLeetCode;

public class CompareVersions {
	
	public static void main(String[] args) {
		String s1 = "1.0";
		String s2 = "1.0.0";
		System.out.println(compareVersion(s1,s2));
	}
	
	public static int compareVersion(String version1, String version2) {
        int i=0, j=0;
        String[] num1 = version1.split("\\.");
        String[] num2 = version2.split("\\.");
        while(i < num1.length || j < num2.length){
            int a = (i < num1.length ? Integer.parseInt(num1[i]) : 0);
            int b = (j < num2.length ? Integer.parseInt(num2[j]) : 0);
            int com = Integer.compare(a,b);
            if(com != 0){
                return com;
            }
            i++;
            j++;
        }
        return 0;
    }

}
