public class Wyliczanka {
    public static void main(String[] args) {
        int liczydlo=0;
        for(int i=1; i<=9; i++){
            System.out.print(i+" ");
            liczydlo++;
            if (liczydlo==3){
                System.out.println("\n");
                liczydlo=0;
            }
        }
    }
}
