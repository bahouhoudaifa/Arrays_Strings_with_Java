import java.util.Scanner;
public class VerbsConj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the verb : ");
        String vb = sc.nextLine();

        if(vb.endsWith("er")){
            String radical = vb.substring(0,vb.length()-2);

            System.out.print("je " + radical + "e\n" );
            System.out.print("tu " + radical + "es\n");
            System.out.print("il/elle " + radical + "e\n");
            System.out.print("nous " + radical + "ons\n");
            System.out.print("vous " + radical + "ez\n");
            System.out.print("ils/elles " + radical + "ent\n");
        }else {
            System.out.println("Error : this verb is'nt in the first group.");
        }
        sc.close();
    }
}
