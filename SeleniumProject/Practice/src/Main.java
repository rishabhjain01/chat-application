public class Main {

    public static void main(String[] args) {
        String  Integer = "0.0025";
        String Substring = null;
        String SubString2 = null;
        if(Integer.contains(".")){
            Substring = Integer.substring(0,Integer.indexOf("."));
            System.out.println(Substring);
            SubString2 = Integer.substring(Integer.indexOf(".")+1,Integer.length());
            System.out.println(SubString2);
        }
        char [] array = Integer.toCharArray();
        char [] array1 = null;
        if(Substring !=null)
            array1 = Substring.toCharArray();
        char [] array2 = null;
        if(SubString2!=null)
            array2 = SubString2.toCharArray();
        System.out.println("TOTAL NUMBER OF SIGFIG DIGITS IS"+amountofSigFigs(array,array1,array2,Integer));
    }
    public static int amountofSigFigs(char [] a,char [] a1,char [] a2,String Integer){
        int count = 0;
        if(a1==null && a2 == null){
            for(int i = 0;i<a.length;i++){
                if(!(a[i]=='0')){
                    count++;
                }
            }
        }
        else{
            for(int i = 0;i<a1.length;i++){
                if(!(a[i]=='0')){
                    count++;
                }
            }
            for(int i = 0;i<a2.length;i++){
                count++;
            }
        }
        return count;
    }

}