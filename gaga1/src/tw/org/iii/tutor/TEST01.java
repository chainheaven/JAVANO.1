package tw.org.iii.tutor;

public class TEST01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// byte 2^8 => -128 ~ 127 , 
		// short 2^16 => 65536 => -32768 ~ 32767,
		// int 2^32, 
		// long 2^64, 以上整數型態
		byte var1;
		byte var2, var3;
		byte var4 = -128;
		// 上面是宣告
		System.out.println(var4);
		
		// byte var5 = var4 + ; 母湯
		int var5 = var4 + 1 ;
		short var6 = 321, var7 = 123;
		int var8 = var6 + var7;
		
		//------------
		// [a-zA-Z$][a-zA-Z0-9$_]*
		byte $$$ = 100;
		System.out.println($$$);
		int 變數1 = 123;
		System.out.println(變數1);
	}

}
