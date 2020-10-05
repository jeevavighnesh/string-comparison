class StringComparison {
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
         if(str1.length()==str2.length() && str1.equals(str2))
        {System.out.println("Both are same");}
    else if(str1.length()==str2.length() && !str1.equals(str2))
    {
        System.out.print("Strings are different but the length of the strings are same");
    }
    else {System.out.print("Both strings and length of the strings are different");}
    }
}
