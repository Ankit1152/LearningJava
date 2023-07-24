public class Str_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // charAt() 
        System.out.println(sb.charAt(0));

        // setcharAt() 
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // insert()
        sb.insert(0,'S');
        System.out.println(sb);
        System.out.println(sb.insert(3,'n'));

        // delete()
        sb.delete(3,4);
        System.out.println(sb);
        sb.delete(2,4);
        System.out.println(sb);

        // append()
        sb.append("d");
        sb.append("e");
        sb.append("r");
        System.out.println(sb);
        System.out.println(sb.length());




    }
    
}
