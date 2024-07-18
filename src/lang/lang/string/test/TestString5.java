package lang.lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "user.exe";
        String ext = ".exe";

        int extIndex = str.indexOf(ext);
        String filename = str.substring(0, extIndex);
        String extName = str.substring(extIndex);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);

    }
}
