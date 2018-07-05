/*
Understand that the entire coach contains of blocks that are of the SAME pattern. Find the logic behind one block, and the same can be applied to the entire problem.

So, whatever input you get, convert it into simple, workable numbers, That is between 1 to 12 ( To model like the first block of seats)

To do that, do (input % 12) and you'll be able to work with numbers 0 to 11

The logic is very simple and can be implemented using a switch case or an if-else construct. Just implement the structure of the first block as your logic.

1 is opposite to 12, 6 is opposite to 7 --> All 4 of these are Window Seats (WS)
2 is opposite to 11, 5 is opposite to 8 --> All 4 of these are Middle Seats (MS)
3 is opposite to 10, 4 is opposite to 9 --> All 4 of these are Aisle Seats (AS)
.........
understand this series ..
1+11=12
2+9=11
3+7=10
4+5=9
5+3=8
6+1=7
Here if you concentrate in every row first no. and third no. are opposite like seat in the train..
*/

import java.util.*;
class SeatingArrangement {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
	   int cases = sc.nextInt();
	   int num;
	for(int i=0; i<cases; i++){
		int seatNo = sc.nextInt();
		int mod = seatNo%12;
		switch(mod){
		case 1: num = (mod==1 && seatNo!=1)?(seatNo+11):12;
				System.out.println(num +" "+ "WS");
				break;
		case 6: num = (mod==6 && seatNo!=6)?(seatNo+1):7;
				System.out.println(num +" "+ "WS");
				break;
		case 7: num = (mod==7 && seatNo!=7)?(seatNo-1):6;
				System.out.println(num +" "+ "WS");
				break;
		case 0: num = (mod==0 && seatNo!=12)?(seatNo-11):1;
				System.out.println(num +" "+ "WS");
				break;
		case 2: num = (mod==2 && seatNo!=2)?(seatNo+9):11;
				System.out.println(num +" "+ "MS");
				break;
		case 5: num = (mod==5 && seatNo!=5)?(seatNo+3):8;
				System.out.println(num +" "+ "MS");
				break;
		case 8: num = (mod==8 && seatNo!=8)?(seatNo-3):5;
				System.out.println(num +" "+ "MS");
				break;
		case 11: num = (mod==11 && seatNo!=11)?(seatNo-9):2;
				System.out.println(num +" "+ "MS");
				break;
		case 3: num = (mod==3 && seatNo!=3)?(seatNo+7):10;
				System.out.println(num +" "+ "AS");
				break;
		case 4: num = (mod==4 && seatNo!=4)?(seatNo+5):9;
				System.out.println(num +" "+ "AS");
				break;
		case 9: num = (mod==9 && seatNo!=9)?(seatNo-5):4;
				System.out.println(num +" "+ "AS");
				break;
		case 10: num = (mod==10 && seatNo!=10)?(seatNo-7):3;
				System.out.println(num +" "+ "AS");
				break;
}
}
    }
}
