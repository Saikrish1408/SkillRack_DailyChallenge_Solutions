import java.util.Scanner;

public class DailyTest05052024 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int n = scannerObject.nextInt();
        System.out.println(findingNextBinary(n));;
        scannerObject.close();
    }

    static int findingNextBinary(int n) {
        int One_s_count = findingBinaryString(n);
        for(int i = (n + 1) ; ; i++) {
            int count = findingBinaryString(i);
            if(count == One_s_count)
                return i;
        }
    }

    public static int findingBinaryString(int n) {
        String binaryString = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0 ; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
