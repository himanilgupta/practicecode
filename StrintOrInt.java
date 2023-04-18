class StrintOrInt{
    public static void main(String[] args) {
        String str = "qweroiukjasdf,234234,kjhssdfiio";
        String newStr[] = str.split(",",3);
        for(int i=0;i<newStr.length;i++){
            try{
                int b = Integer.parseInt(newStr[i]);
                System.out.println("Print number: "+b);
            } catch (NumberFormatException nfe) {
                System.out.println("print string: "+newStr[i]);
                char arr[] = newStr[i].toCharArray();
                for(int j=0;j<arr.length;j++) {
                    if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u'){
                        System.out.println("Vowels of string: "+newStr[i]+" are - "+arr[j]);
                    } else {
                        System.out.println("No vowels found");
                    }
                }
            }
            
        }    
    }
}