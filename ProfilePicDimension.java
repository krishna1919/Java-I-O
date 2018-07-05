import java.util.*;
class ProfilePicDimension{
    public static void main(String args[] ) throws Exception {
        Scanner s= new Scanner(System.in);
        int L=s.nextInt();
        int N=s.nextInt();
        int W[]=new int[N];
		int H[]=new int[N];//for number of photos..
        //for W and H..
        for(int i=0;i<N;i++){
            W[i]=s.nextInt();
            H[i]=s.nextInt();
           // System.out.printf("%d %d\n",W,H);
        }
		for(int i=0;i<N;i++){
			if(W[i] == L & H[i] == L)
				System.out.println("ACCEPTED");
			else if(W[i] > L & H[i] > L)
			System.out.println("CROP IT");
			else
			System.out.println("UPLOAD ANOTHER");
			}
    }
    }