public class JavaStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.toString());
        StringBuffer sb1 = new StringBuffer(1000);
        System.out.println(sb1.capacity());
        System.out.println(sb1.toString());
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb2.capacity());
        System.out.println(sb2.toString());
        CharSequence seq = new StringBuffer("Hello");
        StringBuffer sb3 = new StringBuffer(seq);
        System.out.println(sb3.capacity());
        System.out.println(sb3.toString());
        sb3.append(" Java");
        System.out.println(sb3.toString());
        sb3.insert(10, " Programming");
        System.out.println(sb3.toString());
        System.out.println(sb3.compareTo(sb2));
        System.out.println(sb3.equals(sb2));
        System.out.println(sb3.charAt(2));
        System.out.println(sb3.substring(3));
        System.out.println(sb3.length());
        System.out.println(sb3.reverse());
    }
}
