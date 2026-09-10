import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int lucky = 0;
        int unlucky = 0;

        for (int i = 0; i < n; i++) {
            int weapons = s.nextInt();

            if (weapons % 2 == 0) {
                lucky++;
            } else {
                unlucky++;
            }
        }

        if (lucky > unlucky) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }

	}
}
