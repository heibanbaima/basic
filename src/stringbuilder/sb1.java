package stringbuilder;

public class sb1 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder(1024);
        sb.append("Mr").append("Bob").append("!").insert(0,"Hello,");
        System.out.println(sb.toString());
    }
}
