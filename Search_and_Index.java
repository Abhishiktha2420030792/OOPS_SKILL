package oops1;

public class Search_and_Index {
	public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s.indexOf(""));        // 2
        System.out.println(s.lastIndexOf("na"));    // 4
        System.out.println(s.contains("nan"));      // true
    }
}
