/*

A - Supermajority
Time Limit: 2 sec / Memory Limit: 1024 MiB
Score : 100 points

Problem Statement:
You are given positive integers A and B.

If A > B × (2/3), output Yes; otherwise, output No.

Constraints:
 - 1 ≤ A, B ≤ 1000
 - All input values are integers.
 
Input:
The input is given from Standard Input in the following format: A B

Sample Input 1: 316, 465
Sample Output 1: Yes

Sample Input 2: 101, 248
Sample Output 2: No

Sample Input 3: 666, 999
Sample Output 3: No

*/

import java.util.Scanner;

public class ASupermajority {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > B * 2 / 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}