package lab_5;

import java.util.ArrayList;
import java.util.Scanner;

public class labhafta5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> sorunlar = new ArrayList<String>();
		
		sorunlar.add("Siyasi Sorunlar");
		sorunlar.add("Sosyolojik Sorunlar");
		sorunlar.add("Ekonomk Sorunlar");
		sorunlar.add("Trafik Sorunlari");
		sorunlar.add("Hava Sorunlari");
		int[][] cevaplar= {{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0}};
		
		int donus=0;
		System.out.println("        ------------");
		System.out.println("   Topluluk Anketine Hosgeldiniz");
		System.out.println("        ------------\n\n");
		while(true)
		{
		System.out.println("ANKETE KATILMAK ICIN 1E BASINIZ\n");
		System.out.println("ANKETTEN CIKMAK ICIN HARICI BIR SAYIYA BASINIZ");
		int x=0;
		
		x=scanner.nextInt();
		if(x==1)
		{
			donus+=1;
			for(int i=0;i<5;i++)
			{
				
				System.out.println(sorunlar.get(i)+", Sorunu 1den 10a kadar puanlayiniz");
				int counter=scanner.nextInt();
				
				
				
	switch (counter) {
	
	case 1:
		cevaplar[i][0]=cevaplar[i][0]+1;
		break;
	case 2:
		cevaplar[i][1]=cevaplar[i][1]+1;
		break;
	case 3:	
		cevaplar[i][2]=cevaplar[i][2]+1;
		break;
	case 4:
		cevaplar[i][3]=cevaplar[i][3]+1;
		break;
	case 5:
		cevaplar[i][4]=cevaplar[i][4]+1;
		break;
	case 6:
		cevaplar[i][5]=cevaplar[i][5]+1;
		break;
	case 7:
		cevaplar[i][6]=cevaplar[i][6]+1;
		break;
	case 8:
		cevaplar[i][7]=cevaplar[i][7]+1;
		break;
	case 9:
		cevaplar[i][8]=cevaplar[i][8]+1;
		break;
	case 10:
		cevaplar[i][9]=cevaplar[i][9]+1;
		break;
		
		
		
		
	
	
	}
			
			
			
			}
				
		
			
			
			
			double toplam1 =0;
			toplam1=toplam1+cevaplar[0][0]+2*cevaplar[0][1]+3*cevaplar[0][2]+4*cevaplar[0][3]+5*cevaplar[0][4]+6*cevaplar[0][5]+7*cevaplar[0][6]+8*cevaplar[0][7]+9*cevaplar[0][8]
					+10*cevaplar[0][9];
			double toplam2 =0;
			toplam2=toplam2+cevaplar[1][0]+2*cevaplar[1][1]+3*cevaplar[1][2]+4*cevaplar[1][3]+5*cevaplar[1][4]+6*cevaplar[1][5]+7*cevaplar[1][6]+8*cevaplar[1][7]+9*cevaplar[1][8]
					+10*cevaplar[1][9];
			double toplam3 =0;
			toplam3=toplam3+cevaplar[2][0]+2*cevaplar[2][1]+3*cevaplar[2][2]+4*cevaplar[2][3]+5*cevaplar[2][4]+6*cevaplar[2][5]+7*cevaplar[2][6]+8*cevaplar[2][7]+9*cevaplar[2][8]
					+10*cevaplar[2][9];
			double toplam4 =0;
			toplam4=toplam4+cevaplar[3][0]+2*cevaplar[3][1]+3*cevaplar[3][2]+4*cevaplar[3][3]+5*cevaplar[3][4]+6*cevaplar[3][5]+7*cevaplar[3][6]+8*cevaplar[3][7]+9*cevaplar[3][8]
					+10*cevaplar[3][9];
			double toplam5 =0;
			toplam5=toplam5+cevaplar[4][0]+2*cevaplar[4][1]+3*cevaplar[4][2]+4*cevaplar[4][3]+5*cevaplar[4][4]+6*cevaplar[4][5]+7*cevaplar[4][6]+8*cevaplar[4][7]+9*cevaplar[4][8]
					+10*cevaplar[4][9];
			
			System.out.println(" SORU BIR TOPLAMI:      "+toplam1);
			System.out.println(" SORUN BIR ORTALAMASI   "+toplam1/donus);
			
			System.out.println(" \n SORU IKI TOPLAM        "+ toplam2);
			System.out.println(" SORUN IKI ORTALAMASI   "+toplam2/donus);
			
			System.out.println(" \n SORU UC TOPLAM         "+toplam3);
			System.out.println(" SORUN UC ORTALAMSI     "+toplam3/donus);
			
			System.out.println(" \n SORU DORT TOPLAM       "+toplam4);
			System.out.println(" SORUN DORT ORTALAMASI  "+toplam4/donus);
			
			System.out.println(" \n SORU BES TOPLAM        "+toplam5);
			System.out.println(" SORUN BES ORTALAMASI   "+toplam5/donus);
			System.out.println("\n");
			
			
			
			for(int i=0;i<5;i++)
			{
				System.out.println(sorunlar.get(i));
				for(int k=0;k<10;k++)
				System.out.print(cevaplar[i][k]+"  ");
				System.out.println("\n");
			}
			
			if(toplam1>toplam2 && toplam1>toplam3 && toplam1>toplam4 && toplam1>toplam5)
				System.out.println("1. anket en cok oyu su puanla almistir:"+toplam1);
			else if (toplam2>toplam3 && toplam1>toplam3 && toplam2>toplam4 && toplam2>toplam5)
				System.out.println("2. anket en cok oyu su puanla almistir:"+toplam2);
			else if(toplam3>toplam4 && toplam3>toplam4 && toplam3>toplam5)
				System.out.println("3. anket en cok oyu su puanla almistir:"+toplam3);
			else if(toplam4>toplam5 && toplam4>toplam5)
				System.out.println("4. anket en cok oyu su puanla almistir:"+toplam4);
			else 
				System.out.println("5. anket en cok oyu su puanla almistir:"+toplam5);
			
			
			if(toplam1<toplam2 && toplam1<toplam3 && toplam1<toplam4 && toplam1<toplam5)
				System.out.println("1. anket en az oyu su puanla almistir:"+toplam1+"\n");
			else if (toplam2<toplam3 && toplam1<toplam3 && toplam2<toplam4 && toplam2<toplam5)
				System.out.println("2. anket en az oyu su puanla almistir:"+toplam2+"\n");
			else if(toplam3<toplam4 && toplam3<toplam4 && toplam3<toplam5)
				System.out.println("3. anket en az oyu su puanla almistir:"+toplam3+"\n");
			else if(toplam4<toplam5 && toplam4<toplam5)
				System.out.println("4. anket en az oyu su puanla almistir:"+toplam4+"\n");
			else 
				System.out.println("5. anket en az oyu su puanla almistir:"+toplam5 +"\n");
			
		}
		if(x!=1)
		{
			break;
		}
		}
		
		
		
	}

}
